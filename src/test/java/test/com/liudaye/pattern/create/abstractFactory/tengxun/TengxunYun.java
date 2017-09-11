package test.com.liudaye.pattern.create.abstractFactory.tengxun;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import test.com.liudaye.pattern.create.abstractFactory.YunProduct;

/**
 * 腾讯云
 *
 * @author Liuhongming
 * @version 1.0 2017/9/11 17:28
 * @since 1.7
 */
public class TengxunYun extends YunProduct {
    private final static Logger log = LoggerFactory.getLogger(TengxunYun.class);
    
    @Override
    public String getData() {
        return "腾讯云数据";
    }
}