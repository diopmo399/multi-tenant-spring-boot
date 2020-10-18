package com.amran.dynamic.multitenant.tenant.service.Impl;

import com.amran.dynamic.multitenant.tenant.entity.Product;
import com.amran.dynamic.multitenant.tenant.repository.ProductRepository;
import com.amran.dynamic.multitenant.tenant.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mohamed DIOP
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
}
