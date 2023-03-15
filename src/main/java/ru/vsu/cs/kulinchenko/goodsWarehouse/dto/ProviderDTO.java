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
public class ProviderDTO {
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;
    private Set<Product> products = new HashSet<>();
}
