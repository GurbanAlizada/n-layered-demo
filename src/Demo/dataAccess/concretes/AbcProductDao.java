package Demo.dataAccess.concretes;

import Demo.dataAccess.abstracts.ProductDao;
import Demo.entities.concretes.Product;

import java.util.List;

public class AbcProductDao implements ProductDao {

    @Override
    public void add(Product product) {
        System.out.println("AbcProductDao ile eklendi : " + product.getProductName());
    }

    @Override
    public void delete(Product product) {
        System.out.println("AbcProductDao ile eklendi : " + product.getProductName());
    }

    @Override
    public void update(Product product) {
        System.out.println("AbcProductDao ile eklendi : " + product.getProductName());
    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
