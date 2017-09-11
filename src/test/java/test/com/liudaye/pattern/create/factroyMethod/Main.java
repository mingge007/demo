package test.com.liudaye.pattern.create.factroyMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 入口程序
 *
 * @author Liuhongming
 * @version 1.0 2017/9/11 17:14
 * @since 1.7
 */
public class Main {
    private final static Logger log = LoggerFactory.getLogger(Main.class);
    
    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        Product product = factoryA.createProduct();
        product.aciton();
        
        FactoryB factoryB = new FactoryB();
        product = factoryB.createProduct();
        product.aciton();
    }
}