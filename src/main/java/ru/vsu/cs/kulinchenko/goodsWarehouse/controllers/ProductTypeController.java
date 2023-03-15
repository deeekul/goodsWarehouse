package ru.vsu.cs.kulinchenko.goodsWarehouse.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.vsu.cs.kulinchenko.goodsWarehouse.services.ProductTypeService;

@Controller
@RequiredArgsConstructor
public class ProductTypeController {
    private final ProductTypeService productTypeService;

    @GetMapping("/productTypes")
    public String productTypes(Model model) {
        model.addAttribute("product_types", productTypeService.listProductTypes());
        return "productTypes";
    }
}
