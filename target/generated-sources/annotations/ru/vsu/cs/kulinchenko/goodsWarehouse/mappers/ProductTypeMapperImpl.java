package ru.vsu.cs.kulinchenko.goodsWarehouse.mappers;

import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import ru.vsu.cs.kulinchenko.goodsWarehouse.dto.ProductTypeDTO;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.Product;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.ProductType;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-03T13:33:49+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 16 (Oracle Corporation)"
)
public class ProductTypeMapperImpl implements ProductTypeMapper {

    @Override
    public ProductTypeDTO toDTO(ProductType productType) {
        if ( productType == null ) {
            return null;
        }

        ProductTypeDTO.ProductTypeDTOBuilder productTypeDTO = ProductTypeDTO.builder();

        productTypeDTO.id( productType.getId() );
        productTypeDTO.name( productType.getName() );
        Set<Product> set = productType.getProducts();
        if ( set != null ) {
            productTypeDTO.products( new LinkedHashSet<Product>( set ) );
        }

        return productTypeDTO.build();
    }
}
