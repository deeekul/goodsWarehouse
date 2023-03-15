package ru.vsu.cs.kulinchenko.goodsWarehouse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.Product;
import ru.vsu.cs.kulinchenko.goodsWarehouse.services.ProductService;
import ru.vsu.cs.kulinchenko.goodsWarehouse.services.ProductTypeService;
import ru.vsu.cs.kulinchenko.goodsWarehouse.services.ProviderService;

import javax.validation.Valid;
import java.io.IOException;

@Controller
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    private final ProductTypeService productTypeService;
    private final ProviderService providerService;

    public ProductController(ProductService productService, ProductTypeService productTypeService, ProviderService providerService) {
        this.productService = productService;
        this.productTypeService = productTypeService;
        this.providerService = providerService;
    }

    @GetMapping("")
    public String products(@RequestParam(name = "title", required = false) String title, Model model) {
        model.addAttribute("products", productService.listProducts(title));
        model.addAttribute("product_types", productTypeService.listProductTypes());
        model.addAttribute("providers", providerService.listProviders());

        return "products";
    }

    @GetMapping("/{id}")
    public String productInfo(@PathVariable Long id, Model model) {
        Product product = productService.getProductByID(id);
        model.addAttribute("product", product);
        model.addAttribute("images", product.getImages());
        return "product_info";
    }

    @GetMapping("/new")
    public String newProduct(@ModelAttribute("product") Product product, Model model) {
        model.addAttribute("product_types", productTypeService.listProductTypes());
        model.addAttribute("providers", providerService.listProviders());
        return "product_new";
    }


    @PostMapping("/create")
    public String createProduct(@RequestParam(value = "file1", required = false) MultipartFile file1,
                                @RequestParam(value = "file2", required = false) MultipartFile file2,
                                @RequestParam(value = "file3", required = false) MultipartFile file3,
                                @Valid Product product, BindingResult bindingResult, Model model) throws IOException {
        if (!bindingResult.hasErrors()) {
            model.addAttribute("noErrors", true);
        }
        productService.saveProduct(product, file1, file2, file3);
        return "redirect:/products";
    }

    @PostMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") Long id) {
        productService.deleteProduct(id);
        return "redirect:/products";
    }

    @GetMapping("/{id}/edit")
    public String editProduct(@PathVariable("id") Long id, Model model) {
        Product product = productService.getProductByID(id);
        model.addAttribute("product", product);
        model.addAttribute("images", product.getImages());
        model.addAttribute("product_types", productTypeService.listProductTypes());
        model.addAttribute("providers", providerService.listProviders());

        return "product_edit";
    }

    @PostMapping("/{id}")
    public String updateProduct(@ModelAttribute("product") @Valid Product product, BindingResult bindingResult,
                                @PathVariable("id") Long id, Model model) {
        /*if (!bindingResult.hasErrors()) {
            model.addAttribute("noErrors", true);
        }*/
        productService.update(id, product);
        return "redirect:/products";
    }
}
