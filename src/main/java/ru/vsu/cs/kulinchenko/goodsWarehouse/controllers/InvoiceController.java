package ru.vsu.cs.kulinchenko.goodsWarehouse.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.vsu.cs.kulinchenko.goodsWarehouse.services.InvoiceService;
import ru.vsu.cs.kulinchenko.goodsWarehouse.services.ProductTypeService;

@Controller
@RequiredArgsConstructor
public class InvoiceController {
    private final InvoiceService invoiceService;

    @GetMapping("/invoices")
    public String invoices(Model model) {
        model.addAttribute("invoices", invoiceService.listInvoices());
        return "invoices";
    }
}
