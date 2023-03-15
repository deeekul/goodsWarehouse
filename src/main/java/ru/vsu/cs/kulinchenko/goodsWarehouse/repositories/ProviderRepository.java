package ru.vsu.cs.kulinchenko.goodsWarehouse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.Provider;

public interface ProviderRepository extends JpaRepository<Provider, Long> {

}
