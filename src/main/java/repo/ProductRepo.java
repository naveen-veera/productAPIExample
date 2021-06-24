package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.ProductModel;

@Repository
public interface ProductRepo extends JpaRepository<ProductModel, String>{

}
