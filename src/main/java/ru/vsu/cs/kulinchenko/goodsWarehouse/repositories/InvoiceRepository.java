package ru.vsu.cs.kulinchenko.goodsWarehouse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.Invoice;

import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
