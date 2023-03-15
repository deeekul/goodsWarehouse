package ru.vsu.cs.kulinchenko.goodsWarehouse.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.Product;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.Provider;
import ru.vsu.cs.kulinchenko.goodsWarehouse.services.ProviderService;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
@RequestMapping("/providers")
public class ProviderController {
    private final ProviderService providerService;

    @GetMapping("")
    public String providers(Model model) {
        model.addAttribute("providers", providerService.listProviders());
        return "providers";
    }

    @GetMapping("/{id}")
    public String providerInfo(@PathVariable Long id, Model model) {
        Provider provider = providerService.getProviderById(id);
        model.addAttribute("provider", provider);
        return "provider_info";
    }

    @GetMapping("/new")
    public String newProvider(@ModelAttribute("provider") Product product) {
        return "provider_new";
    }

    @PostMapping("/create")
    public String createProvider(Provider provider) {
        providerService.save(provider);
        return "redirect:/providers/";
    }

    @PostMapping("/delete/{id}")
    public String deleteProvider(@PathVariable("id") Long id) {
        providerService.deleteProvider(id);
        return "redirect:/providers/";
    }

    @GetMapping("/{id}/edit")
    public String editProvider(@PathVariable("id") Long id, Model model) {
        Provider provider = providerService.getProviderById(id);
        model.addAttribute("provider", provider);
        return "provider_edit";
    }

    @PostMapping("/{id}")
    public String updateProvider(@ModelAttribute("provider") Provider provider, @PathVariable("id") Long id) {

        providerService.update(provider);
        return "redirect:/providers";
    }
}
