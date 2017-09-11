package test.com.liudaye.pattern.create.build;

/**
 * 指挥者类
 * @author Liuhongming
 * @version 1.0 2017/9/11 11:31
 */
public class Director {
    Builder builder;
    
    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
    
    Product buildProduct() {
        return builder.build();
    }
}