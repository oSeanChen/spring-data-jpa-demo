package com.oseanchen.demotest.junit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductTestService {

    @Autowired
    private ProductTestDao productTestDao;

    public ProductTest saveProduct(ProductTest productTest) {
        return productTestDao.save(productTest);
    }

    public Optional<ProductTest> getProductById(Long id) {
        return productTestDao.findById(id);
    }

    public void deleteProduct(Long id) {
        productTestDao.deleteById(id);
    }
}
