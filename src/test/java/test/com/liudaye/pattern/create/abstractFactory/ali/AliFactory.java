package test.com.liudaye.pattern.create.abstractFactory.ali;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import test.com.liudaye.pattern.create.abstractFactory.ChatUtilProduct;
import test.com.liudaye.pattern.create.abstractFactory.Factory;
import test.com.liudaye.pattern.create.abstractFactory.YunProduct;

/**
 * 阿狸工厂
 *
 * @author Liuhongming
 * @version 1.0 2017/9/11 17:26
 * @since 1.7
 */
public class AliFactory extends Factory {
    private final static Logger log = LoggerFactory.getLogger(AliFactory.class);
    
    @Override
    public YunProduct createYunProduct() {
        return new AliYun();
    }
    
    @Override
    public ChatUtilProduct createChatUtilProduct() {
        return new DingDing();
    }
}