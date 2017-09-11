package test.com.liudaye.pattern.create.build;

/**
 * 建造者类B
 * @author Liuhongming
 * @version 1.0 2017/9/11 11:19
 */
public class BuilderB implements Builder {
    Product product;
    
    BuilderB() {
        product = new Product();
    }
    
    @Override
    public Builder setAttributeA(String a) {
        product.setA("" + a);
        return this;
    }
    
    @Override
    public Builder setAttributeB(String b) {
        product.setB(b);
        return this;
    }
    
    @Override
    public Builder setAttributeC(String c) {
        product.setC(c);
        return this;
    }
    
    @Override
    public Product build() {
        product.setBuildName("build B");
        return product;
    }
}