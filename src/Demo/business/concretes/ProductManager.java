package Demo.business.concretes;

import Demo.business.abstracts.ProductService;
import Demo.core.LoggerService;
import Demo.dataAccess.abstracts.ProductDao;
import Demo.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao;
    private LoggerService loggerService;


    public ProductManager(ProductDao productDao  ,LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService=loggerService;
    }

    @Override
    public void add(Product product) {
        if(product.getCategoryId() == 1){
            System.out.println("Bu kategoride urun eklenmiyor ");
            return;
        }
        productDao.add(product);
        loggerService.logToSystem(". Urun  eklendi : " + product.getProductName());

    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
