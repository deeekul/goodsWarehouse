package ru.vsu.cs.kulinchenko.goodsWarehouse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.ProductsList;

import java.util.List;

public interface ProductsListRepository extends JpaRepository<ProductsList, Long> {

}

