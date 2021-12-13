import dao.ProductDao;
import model.Product;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        ProductDao productDao = new ProductDao(sessionFactory);
        productDao.deleteById(4l);
        List<Product> products = productDao.findAll();
        products.forEach(System.out::println);



        sessionFactory.close();
    }
}
