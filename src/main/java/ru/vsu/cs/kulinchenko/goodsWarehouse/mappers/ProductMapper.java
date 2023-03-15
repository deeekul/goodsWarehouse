package ru.vsu.cs.kulinchenko.goodsWarehouse.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.vsu.cs.kulinchenko.goodsWarehouse.dto.ProductDTO;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.Product;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    ProductDTO toDTO(Product product);
}
