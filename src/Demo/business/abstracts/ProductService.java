package Demo.business.abstracts;

import Demo.entities.concretes.Product;

import java.util.List;

public interface ProductService {

    void add(Product product);
    List<Product> getAll();


}
