package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.ProductModel;
import repo.ProductRepo;

@RestController
public class ProductController {
	
	@Autowired
	ProductRepo productRepo;
	
	@GetMapping("/")
	public String Home() {
		return "Rest Server Started ";
	}
	
	@GetMapping("/allProducts")
	public List<ProductModel> allProducts(){
		return productRepo.findAll();
	}

	@PostMapping("/allProducts")
	public ProductModel addProducts(@RequestBody ProductModel product) {
		return productRepo.save(product);
	}
	
	@GetMapping("/product/{id}")
	public Optional<ProductModel> getProduct(@PathVariable String id) {
		return productRepo.findById(id);
	}
	
	//Update
	
	//Detele
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable String id){
		productRepo.deleteById(id);
		return "Success";
	}
}
