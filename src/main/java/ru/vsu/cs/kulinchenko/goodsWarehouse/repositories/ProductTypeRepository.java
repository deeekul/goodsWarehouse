package ru.vsu.cs.kulinchenko.goodsWarehouse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.ProductType;

public interface ProductTypeRepository extends JpaRepository<ProductType, Long> {

}
