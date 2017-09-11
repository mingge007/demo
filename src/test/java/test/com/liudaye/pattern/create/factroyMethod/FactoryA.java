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
public class FactoryA extends AbstractFactory {
    private final static Logger log = LoggerFactory.getLogger(FactoryA.class);
    
    @Override
    public Product createProduct() {
        //匿名内部产品A类
        Product product = new Product() {
            @Override
            void aciton() {
                System.out.println("action A");
            }
        };
        return product;
    }
}