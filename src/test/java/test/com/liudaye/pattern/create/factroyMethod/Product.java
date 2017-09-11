package test.com.liudaye.pattern.create.factroyMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 产品类
 *
 * @author Liuhongming
 * @version 1.0 2017/9/11 17:06
 * @since 1.7
 */
public abstract class Product {
    private final static Logger log = LoggerFactory.getLogger(Product.class);
    
    abstract void aciton();
}