package ru.vsu.cs.kulinchenko.goodsWarehouse.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.Image;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.Product;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.Provider;
import ru.vsu.cs.kulinchenko.goodsWarehouse.repositories.ProductRepository;

import javax.mail.Multipart;
import javax.transaction.Transactional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* Service для работы с products */

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> listProducts(String title) {
        if (title != null) {
            return productRepository.findByTitle(title);
        }
        return productRepository.findAll();
    }

    public List<Product> listProducts() {
        return productRepository.findAll();
    }

    public void saveProduct(Product product, MultipartFile file1, MultipartFile file2, MultipartFile file3) throws IOException {
        Image image1;
        Image image2;
        Image image3;
        if (file1.getSize() != 0) {
            image1 = toImageEntity(file1);
            image1.setPreviewImage(true);
            product.addImageToProduct(image1);
        }
        if (file2.getSize() != 0) {
            image2 = toImageEntity(file2);
            product.addImageToProduct(image2);
        }
        if (file3.getSize() != 0) {
            image3 = toImageEntity(file3);
            product.addImageToProduct(image3);
        }

        log.info("Saving new Product. Title: {}; Type: {}; Provider: {}",
                product.getTitle(), product.getType(), product.getProvider());
        Product productFromDb = productRepository.save(product);
        if (productFromDb.getImages().size() != 0) {
            productFromDb.setPreviewImageId(productFromDb.getImages().get(0).getId());
        }
        productRepository.save(product);
    }

    private Image toImageEntity(MultipartFile file) throws IOException {
        Image image = new Image();
        image.setName(file.getName());
        image.setOriginalFileName(file.getOriginalFilename());
        image.setContentType(file.getContentType());
        image.setSize(file.getSize());
        image.setBytes(file.getBytes());
        return image;
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public Product getProductByID(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public void update(Long id, Product updatedProduct) {
/*
        Product productToBeUpdated = getProductByID(id);

        productToBeUpdated.setTitle(updatedProduct.getTitle());
        productToBeUpdated.setType(updatedProduct.getType());
        productToBeUpdated.setProvider(updatedProduct.getProvider());
        productToBeUpdated.setUnitPrice(updatedProduct.getUnitPrice());
        productToBeUpdated.setDescription(updatedProduct.getDescription());
*/
        productRepository.save(updatedProduct);

    }
}
