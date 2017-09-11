package test.com.liudaye.pattern.create.factroyMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 产品B的工厂
 *
 * @author Liuhongming
 * @version 1.0 2017/9/11 17:08
 * @since 1.7
 */
public class FactoryB extends AbstractFactory {
    private final static Logger log = LoggerFactory.getLogger(FactoryB.class);
    
    @Override
    public Product createProduct() {
        Product product = new ProductB();
        return product;
    }
}