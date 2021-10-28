package Demo;

import Demo.Adapters.LoggerManagerAdapter;
import Demo.business.abstracts.ProductService;
import Demo.business.concretes.ProductManager;
import Demo.dataAccess.concretes.AbcProductDao;
import Demo.dataAccess.concretes.HibernateProductDao;
import Demo.entities.concretes.Product;

public class Main {
    public static void main(String[] args) {

        ProductService productService = new ProductManager(new HibernateProductDao() , new LoggerManagerAdapter());
        productService.add(new Product(1 , 2  , "ACER ASPIRE 3" , "16 RAM " , 123 , 2000));


    }
}
