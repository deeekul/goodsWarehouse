package ru.vsu.cs.kulinchenko.goodsWarehouse.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.vsu.cs.kulinchenko.goodsWarehouse.dto.ProviderDTO;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.Provider;

@Mapper
public interface ProviderMapper {
    ProviderMapper INSTANCE = Mappers.getMapper(ProviderMapper.class);
    ProviderDTO toDTO(Provider provider);
}
