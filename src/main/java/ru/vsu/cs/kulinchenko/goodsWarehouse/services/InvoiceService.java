package ru.vsu.cs.kulinchenko.goodsWarehouse.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.Invoice;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.ProductType;
import ru.vsu.cs.kulinchenko.goodsWarehouse.repositories.InvoiceRepository;
import ru.vsu.cs.kulinchenko.goodsWarehouse.repositories.ProductTypeRepository;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class InvoiceService {
    private final InvoiceRepository invoiceRepository;

    public List<Invoice> listInvoices() {
        return invoiceRepository.findAll(Sort.by(Sort.Direction.ASC, "number"));
    }
}


