package ru.vsu.cs.kulinchenko.goodsWarehouse.mappers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import ru.vsu.cs.kulinchenko.goodsWarehouse.dto.ImageDTO;
import ru.vsu.cs.kulinchenko.goodsWarehouse.dto.ProductDTO;
import ru.vsu.cs.kulinchenko.goodsWarehouse.dto.ProductTypeDTO;
import ru.vsu.cs.kulinchenko.goodsWarehouse.dto.ProviderDTO;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.Image;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.Product;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.ProductType;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.Provider;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-03T13:33:49+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 16 (Oracle Corporation)"
)
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDTO toDTO(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDTO.ProductDTOBuilder productDTO = ProductDTO.builder();

        productDTO.id( product.getId() );
        productDTO.title( product.getTitle() );
        productDTO.type( productTypeToProductTypeDTO( product.getType() ) );
        productDTO.provider( providerToProviderDTO( product.getProvider() ) );
        productDTO.unitPrice( product.getUnitPrice() );
        productDTO.description( product.getDescription() );
        productDTO.previewImageId( product.getPreviewImageId() );
        productDTO.images( imageListToImageDTOList( product.getImages() ) );

        return productDTO.build();
    }

    protected ProductTypeDTO productTypeToProductTypeDTO(ProductType productType) {
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

    protected ProviderDTO providerToProviderDTO(Provider provider) {
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

    protected ImageDTO imageToImageDTO(Image image) {
        if ( image == null ) {
            return null;
        }

        ImageDTO.ImageDTOBuilder imageDTO = ImageDTO.builder();

        imageDTO.id( image.getId() );
        imageDTO.name( image.getName() );
        imageDTO.originalFileName( image.getOriginalFileName() );
        imageDTO.size( image.getSize() );
        imageDTO.contentType( image.getContentType() );
        byte[] bytes = image.getBytes();
        if ( bytes != null ) {
            imageDTO.bytes( Arrays.copyOf( bytes, bytes.length ) );
        }
        imageDTO.product( toDTO( image.getProduct() ) );

        return imageDTO.build();
    }

    protected List<ImageDTO> imageListToImageDTOList(List<Image> list) {
        if ( list == null ) {
            return null;
        }

        List<ImageDTO> list1 = new ArrayList<ImageDTO>( list.size() );
        for ( Image image : list ) {
            list1.add( imageToImageDTO( image ) );
        }

        return list1;
    }
}
