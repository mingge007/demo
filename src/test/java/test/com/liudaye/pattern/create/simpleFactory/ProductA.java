package test.com.liudaye.pattern.create.simpleFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 一句话简单说明功能。。
 *
 * @author Liuhongming
 * @version 1.0 2017/9/11 17:01
 * @since 1.7
 */
public class ProductA extends Product {
    private final static Logger log = LoggerFactory.getLogger(ProductA.class);
    
    @Override
    public void action() {
        System.out.println("action A");
    }
}