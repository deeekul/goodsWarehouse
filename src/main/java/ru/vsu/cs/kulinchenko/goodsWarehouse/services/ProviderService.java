package ru.vsu.cs.kulinchenko.goodsWarehouse.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.authenticator.jaspic.PersistentProviderRegistrations;
import org.springframework.stereotype.Service;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.Product;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.ProductType;
import ru.vsu.cs.kulinchenko.goodsWarehouse.models.Provider;
import ru.vsu.cs.kulinchenko.goodsWarehouse.repositories.ProductTypeRepository;
import ru.vsu.cs.kulinchenko.goodsWarehouse.repositories.ProviderRepository;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProviderService {
    private final ProviderRepository providerRepository;

    public List<Provider> listProviders() {
        return providerRepository.findAll();
    }

    public void deleteProvider(Long id) {
        providerRepository.deleteById(id);
    }

    public Provider getProviderById(Long id) {
        return providerRepository.findById(id).orElse(null);
    }

    public void save(Provider provider) {
        providerRepository.save(provider);
    }

    public void update(Provider updatedProvider) {
        providerRepository.save(updatedProvider);
    }

/*    public Provider getProviderByProductId(Long id) {
        return providerRepository.getProviderByProductId(id);
    }*/
}
