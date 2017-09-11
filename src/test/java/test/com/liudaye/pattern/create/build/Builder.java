package test.com.liudaye.pattern.create.build;

/**
 * 建造者接口
 *
 * @author Liuhongming
 * @version 1.0 2017/9/11 11:19
 */
public interface Builder {
    public Builder setAttributeA(String a);
    
    public Builder setAttributeB(String b);
    
    public Builder setAttributeC(String c);
    
    public Product build();
}