package ru.vsu.cs.kulinchenko.goodsWarehouse.dto;

import lombok.*;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.Image;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.ProductType;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.Provider;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private Long id;
    private String title;
    private ProductTypeDTO type;
    private ProviderDTO provider;
    private int unitPrice;
    private String description;
    private Long previewImageId;
    private List<ImageDTO> images = new ArrayList<>();
}
