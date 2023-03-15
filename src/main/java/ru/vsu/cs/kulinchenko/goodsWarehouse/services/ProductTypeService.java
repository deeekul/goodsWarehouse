package ru.vsu.cs.kulinchenko.goodsWarehouse.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.Product;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.ProductType;
import ru.vsu.cs.kulinchenko.goodsWarehouse.repositories.ProductRepository;
import ru.vsu.cs.kulinchenko.goodsWarehouse.repositories.ProductTypeRepository;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductTypeService {
    private final ProductTypeRepository productTypeRepository;

    public List<ProductType> listProductTypes() {
        return productTypeRepository.findAll();
    }
}
