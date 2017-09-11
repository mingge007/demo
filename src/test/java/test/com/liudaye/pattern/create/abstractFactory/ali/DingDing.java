package test.com.liudaye.pattern.create.abstractFactory.ali;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import test.com.liudaye.pattern.create.abstractFactory.ChatUtilProduct;

/**
 * 钉钉聊天工具
 *
 * @author Liuhongming
 * @version 1.0 2017/9/11 17:28
 * @since 1.7
 */
public class DingDing extends ChatUtilProduct {
    private final static Logger log = LoggerFactory.getLogger(DingDing.class);
    
    @Override
    public void sendMsg(String msg) {
        System.out.println("ding ding send msg" + msg);
    }
}