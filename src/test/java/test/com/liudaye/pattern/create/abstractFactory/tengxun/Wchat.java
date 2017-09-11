package test.com.liudaye.pattern.create.abstractFactory.tengxun;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import test.com.liudaye.pattern.create.abstractFactory.ChatUtilProduct;

/**
 * 微信
 *
 * @author Liuhongming
 * @version 1.0 2017/9/11 17:28
 * @since 1.7
 */
public class Wchat extends ChatUtilProduct {
    private final static Logger log = LoggerFactory.getLogger(Wchat.class);
    
    @Override
    public void sendMsg(String msg) {
        System.out.println("wei xin send msg" + msg);
    }
}