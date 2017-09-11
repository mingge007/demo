package test.com.liudaye.pattern.create.abstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import test.com.liudaye.pattern.create.abstractFactory.ali.AliFactory;
import test.com.liudaye.pattern.create.abstractFactory.tengxun.TengxunFactory;

/**
 * 程序入口
 *
 * @author Liuhongming
 * @version 1.0 2017/9/11 17:31
 * @since 1.7
 */
public class Main {
    
    private final static Logger log = LoggerFactory.getLogger(Main.class);
    
    public static void main(String[] args) {
        Factory factory = new AliFactory();
        ChatUtilProduct chatUtil = factory.createChatUtilProduct();
        YunProduct yun = factory.createYunProduct();
        chatUtil.sendMsg(yun.getData());
        
        //客户端程序只需要更改工厂方法类即可切换一组环境
        factory = new TengxunFactory();
        chatUtil = factory.createChatUtilProduct();
        yun = factory.createYunProduct();
        chatUtil.sendMsg(yun.getData());
    }
}