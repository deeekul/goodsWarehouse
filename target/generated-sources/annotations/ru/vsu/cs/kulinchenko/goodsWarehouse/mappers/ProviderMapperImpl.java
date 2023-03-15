package ru.vsu.cs.kulinchenko.goodsWarehouse.mappers;

import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import ru.vsu.cs.kulinchenko.goodsWarehouse.dto.ProviderDTO;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.Product;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.Provider;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-03T13:33:49+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 16 (Oracle Corporation)"
)
public class ProviderMapperImpl implements ProviderMapper {

    @Override
    public ProviderDTO toDTO(Provider provider) {
        if ( provider == null ) {
            return null;
        }

        ProviderDTO.ProviderDTOBuilder providerDTO = ProviderDTO.builder();

        providerDTO.id( provider.getId() );
        providerDTO.name( provider.getName() );
        providerDTO.address( provider.getAddress() );
        providerDTO.phoneNumber( provider.getPhoneNumber() );
        Set<Product> set = provider.getProducts();
        if ( set != null ) {
            providerDTO.products( new LinkedHashSet<Product>( set ) );
        }

        return providerDTO.build();
    }
}
