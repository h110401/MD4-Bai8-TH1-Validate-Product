package rikkei.academy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rikkei.academy.model.Product;
import rikkei.academy.repository.IRepository;

@Service
@Transactional
public class ProductServiceIMPL implements IProductService {

    @Autowired
    private IRepository repository;

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public void save(Product product) {
        repository.save(product);
    }

    @Override
    public Page<Product> findAllByNameContaining(String name, Pageable pageable) {
        return repository.findAllByNameContaining(name, pageable);
    }

    @Override
    public Page<Product> findByNameProduct(String name, Pageable pageable) {
        return repository.findByNameProduct(name, pageable);
    }
}
