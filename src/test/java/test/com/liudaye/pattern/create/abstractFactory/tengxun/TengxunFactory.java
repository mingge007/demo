package test.com.liudaye.pattern.create.abstractFactory.tengxun;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import test.com.liudaye.pattern.create.abstractFactory.ChatUtilProduct;
import test.com.liudaye.pattern.create.abstractFactory.Factory;
import test.com.liudaye.pattern.create.abstractFactory.YunProduct;

/**
 * 腾讯工厂
 *
 * @author Liuhongming
 * @version 1.0 2017/9/11 17:32
 * @since 1.7
 */
public class TengxunFactory extends Factory {
    private final static Logger log = LoggerFactory.getLogger(TengxunFactory.class);
    
    @Override
    public YunProduct createYunProduct() {
        return new TengxunYun();
    }
    
    @Override
    public ChatUtilProduct createChatUtilProduct() {
        return new Wchat();
    }
}