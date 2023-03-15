package ru.vsu.cs.kulinchenko.goodsWarehouse.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.ProductsList;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.Provider;
import ru.vsu.cs.kulinchenko.goodsWarehouse.repositories.ProductsListRepository;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductsListService {
    private final ProductsListRepository productsListRepository;

    public List<ProductsList> listProductsList() {
        return productsListRepository.findAll();
    }

    public ProductsList getProductsListById(Long id) {
        return productsListRepository.findById(id).orElse(null);
    }

    public void save(ProductsList productsList) {
        productsList.setPrice();
        productsListRepository.save(productsList);
    }

    public void deleteProductsList(Long id) {
        productsListRepository.deleteById(id);
    }

    public void update(ProductsList updatedProductsList) {
        updatedProductsList.setPrice();
        productsListRepository.save(updatedProductsList);
    }
}
