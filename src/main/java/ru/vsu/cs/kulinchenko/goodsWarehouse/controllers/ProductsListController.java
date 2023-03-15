package ru.vsu.cs.kulinchenko.goodsWarehouse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.Invoice;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.Product;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.ProductsList;
import ru.vsu.cs.kulinchenko.goodsWarehouse.services.InvoiceService;
import ru.vsu.cs.kulinchenko.goodsWarehouse.services.ProductService;
import ru.vsu.cs.kulinchenko.goodsWarehouse.services.ProductsListService;

import java.util.Comparator;

@Controller
@RequestMapping("/productsLists")
public class ProductsListController {
    private final ProductsListService productsListService;
    private final ProductService productService;
    private final InvoiceService invoiceService;

    public ProductsListController(ProductsListService productsListService,
                                    ProductService productService, InvoiceService invoiceService) {
        this.productsListService = productsListService;
        this.productService = productService;
        this.invoiceService = invoiceService;
    }

    @GetMapping("")
    public String productsList(Model model) {
        model.addAttribute("productsLists", productsListService.listProductsList());
        model.addAttribute("products", productService.listProducts());
        model.addAttribute("invoices", invoiceService.listInvoices());

        return "productsLists";
    }

    @GetMapping("/{id}")
    public String productsListInfo(@PathVariable Long id, Model model) {
        ProductsList productsList = productsListService.getProductsListById(id);
        model.addAttribute("productsList", productsList);
        return "productsList_info";
    }

    @GetMapping("/new")
    public String newProductsList(@ModelAttribute("productsList") ProductsList productsList, Model model) {
        model.addAttribute("products", productService.listProducts());
        model.addAttribute("invoices", invoiceService.listInvoices());
        return "productsList_new";
    }

    @PostMapping("/create")
    public String createProvider(ProductsList productsList) {
        productsListService.save(productsList);
        return "redirect:/productsLists/";
    }

    @PostMapping("/delete/{id}")
    public String deleteProvider(@PathVariable("id") Long id) {
        productsListService.deleteProductsList(id);
        return "redirect:/productsLists";
    }

    @GetMapping("/{id}/edit")
    public String editProductsList(@PathVariable("id") Long id, Model model) {
        ProductsList productsList = productsListService.getProductsListById(id);
        model.addAttribute("productsList", productsList);
        model.addAttribute("products", productService.listProducts());
        model.addAttribute("invoices", invoiceService.listInvoices());
        return "productsList_edit";
    }

    @PostMapping("/{id}")
    public String updateProvider(@ModelAttribute("productsList") ProductsList productsList, @PathVariable("id") Long id) {
        productsListService.update(productsList);
        return "redirect:/productsLists";
    }

}
