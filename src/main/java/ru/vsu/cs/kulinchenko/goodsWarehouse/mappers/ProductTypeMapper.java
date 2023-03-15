package ru.vsu.cs.kulinchenko.goodsWarehouse.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.vsu.cs.kulinchenko.goodsWarehouse.dto.ProductTypeDTO;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.ProductType;

@Mapper
public interface ProductTypeMapper {
    ProductTypeMapper INSTANCE = Mappers.getMapper(ProductTypeMapper.class);
    ProductTypeDTO toDTO(ProductType productType);
}
