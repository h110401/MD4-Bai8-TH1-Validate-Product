package rikkei.academy.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import rikkei.academy.model.Product;

public interface IRepository extends PagingAndSortingRepository<Product, Long> {
    Page<Product> findAllByNameContaining(String name, Pageable pageable);

    @Query("select p from Product p where p.name like concat('%',:name,'%')")
    Page<Product> findByNameProduct(@Param("name") String name, Pageable pageable);
}
