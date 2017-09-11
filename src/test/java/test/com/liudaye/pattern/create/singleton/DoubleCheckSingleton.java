package test.com.liudaye.pattern.create.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 双重校验锁方式 单例模式
 * <p>线程安全</p>
 * <p>利用jdk1.5以上版本 volatile的内存可见性（多线程中一个线程修改变量其他线程收到消息重新读取最新值）和synchronized偏向锁特性，线程安全的创建对象。
 *
 * @author Liuhongming
 * @version 1.0 2017/9/11 15:57
 * @since 1.7
 */
public class DoubleCheckSingleton {
    private final static Logger log = LoggerFactory.getLogger(DoubleCheckSingleton.class);
    
    private static volatile DoubleCheckSingleton instance = null;
    
    private DoubleCheckSingleton() {
    
    }
    
    /**
     * 获取单例
     *
     * @return 实例结果
     */
    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            //此时可能多个线程同时抢夺资源,利用synchronized锁机制，同时只让一个线程进入一下流程
            synchronized (DoubleCheckSingleton.class) {
                //volatile特性如果其他线程已经创建完成内存已经更新。则后进的线程不在重新创建对象
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}