package ru.vsu.cs.kulinchenko.goodsWarehouse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.Product;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.Provider;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTitle(String title);

}
