package test.com.liudaye.pattern.create.abstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 抽象工厂方法类
 *
 * @author Liuhongming
 * @version 1.0 2017/9/11 17:24
 * @since 1.7
 */
public abstract class Factory {
    private final static Logger log = LoggerFactory.getLogger(Factory.class);
    
    public abstract YunProduct createYunProduct();
    
    public abstract ChatUtilProduct createChatUtilProduct();
    
}