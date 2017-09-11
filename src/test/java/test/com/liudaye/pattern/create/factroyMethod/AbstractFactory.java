package test.com.liudaye.pattern.create.factroyMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 一句话简单说明功能。。
 *
 * @author Liuhongming
 * @version 1.0 2017/9/11 17:17
 * @since 1.7
 */
public abstract class AbstractFactory {
    private final static Logger log = LoggerFactory.getLogger(AbstractFactory.class);
    
    public abstract Product createProduct();
}