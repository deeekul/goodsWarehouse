package ru.vsu.cs.kulinchenko.goodsWarehouse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {

}
