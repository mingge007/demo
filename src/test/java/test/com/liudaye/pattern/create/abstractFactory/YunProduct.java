package test.com.liudaye.pattern.create.abstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 云抽闲产品类
 *
 * @author Liuhongming
 * @version 1.0 2017/9/11 17:20
 * @since 1.7
 */
public abstract class YunProduct {
    private final static Logger log = LoggerFactory.getLogger(YunProduct.class);
    
    /**
     * 查询云数据
     */
    public abstract String getData();
}