package test.com.liudaye.pattern.create.build;


/**
 * 主函数
 * @author Liuhongming
 * @version 1.0 2017/9/11 11:30
 */
public class Main {
    public static void main(String[] args) {
        Builder builderA = new BuilderA().setAttributeA("A1").setAttributeB("A2").setAttributeC("A3");
        Builder builderB = new BuilderB().setAttributeA("B1").setAttributeB("B2").setAttributeC("B3");
        
        Director director = new Director();
        director.setBuilder(builderA);
        Product product = director.buildProduct();
        product.action();
        
        
        director.setBuilder(builderB);
        product = director.buildProduct();
        product.action();
    }
}