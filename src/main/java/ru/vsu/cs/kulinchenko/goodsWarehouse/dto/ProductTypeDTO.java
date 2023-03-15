package ru.vsu.cs.kulinchenko.goodsWarehouse.dto;

import lombok.*;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.Product;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductTypeDTO {
    private Long id;
    private String name;
    private Set<Product> products = new HashSet<>();
}
