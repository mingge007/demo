package test.com.liudaye.pattern.create.abstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 聊天工具抽象产品类
 *
 * @author Liuhongming
 * @version 1.0 2017/9/11 17:20
 * @since 1.7
 */
public abstract class ChatUtilProduct {
    private final static Logger log = LoggerFactory.getLogger(ChatUtilProduct.class);
    
    /**
     * 发送消息
     */
    public abstract void sendMsg(String msg);
}