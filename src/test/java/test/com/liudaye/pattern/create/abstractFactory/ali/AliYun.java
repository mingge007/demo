package test.com.liudaye.pattern.create.abstractFactory.ali;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import test.com.liudaye.pattern.create.abstractFactory.YunProduct;

/**
 * 阿里云
 *
 * @author Liuhongming
 * @version 1.0 2017/9/11 17:27
 * @since 1.7
 */
public class AliYun extends YunProduct {
    private final static Logger log = LoggerFactory.getLogger(AliYun.class);
    
    @Override
    public String getData() {
        return "阿里云数据";
    }
}