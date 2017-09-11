package test.com.liudaye.pattern.create.simpleFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 简单工厂demo
 *
 * @author Liuhongming
 * @version 1.0 2017/9/11 16:57
 * @since 1.7
 */
public class SimpleFactory {
    private final static Logger log = LoggerFactory.getLogger(SimpleFactory.class);
    
    public static Product createProduct(String name) {
        Product product = null;
        switch (name) {
            case "productA": {
                product = new ProductA();
                break;
            }
            case "productB": {
                product = new ProductB();
                break;
            }
            
        }
        return product;
    }
}