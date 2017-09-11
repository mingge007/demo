package test.com.liudaye.pattern.create.simpleFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 程序入口
 *
 * @author Liuhongming
 * @version 1.0 2017/9/11 17:02
 * @since 1.7
 */
public class Main {
    private final static Logger log = LoggerFactory.getLogger(Main.class);
    
    public static void main(String[] args) {
        Product product = SimpleFactory.createProduct("productA");
        product.action();
    }
}