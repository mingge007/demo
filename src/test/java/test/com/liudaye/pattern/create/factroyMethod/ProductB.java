package test.com.liudaye.pattern.create.factroyMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 产品B
 *
 * @author Liuhongming
 * @version 1.0 2017/9/11 17:13
 * @since 1.7
 */
public class ProductB extends Product {
    private final static Logger log = LoggerFactory.getLogger(ProductB.class);
    
    @Override
    void aciton() {
        System.out.println("action B");
    }
}