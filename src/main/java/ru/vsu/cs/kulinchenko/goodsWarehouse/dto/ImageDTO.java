package ru.vsu.cs.kulinchenko.goodsWarehouse.dto;

import lombok.*;
import org.hibernate.annotations.Type;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.Product;

import javax.persistence.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ImageDTO {
    private Long id;
    private String name;
    private String originalFileName;
    private Long size;
    private String contentType;
    private boolean isPreviewImage;
    private byte[] bytes;
    private ProductDTO product;
}
