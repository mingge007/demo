package test.com.liudaye.pattern.create.build;

/**
 * 产品类
 * @author Liuhongming
 * @version 1.0 2017/9/11 11:22
 */
public class Product {
    private String a;
    private String b;
    private String c;
    private String buildName;
    
    public void action() {
        System.out.println("buildName:" + buildName + " action" + " ,a=" + a + " ,b=" + b + " ,c=" + c);
    }
    
    public String getBuildName() {
        return buildName;
    }
    
    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }
    
    public String getA() {
        return a;
    }
    
    public void setA(String a) {
        this.a = a;
    }
    
    public String getB() {
        return b;
    }
    
    public void setB(String b) {
        this.b = b;
    }
    
    public String getC() {
        return c;
    }
    
    public void setC(String c) {
        this.c = c;
    }
}