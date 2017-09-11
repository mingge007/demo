package com.liudaye;

import java.util.HashMap;

/**
 * @author Liuhongming
 * @version 1.0 2017/8/4 14:03
 */
public class Y {
    public static void main(String[] args) throws Exception {
        R r = new R();
        Solution ss = new Solution();
        int length = 4000000;
        NumberChangeToChinese n = new NumberChangeToChinese();
        Long s = new Long(100000001L);
        System.out.println("字符串方式:" + n.numberToChinese(s.intValue()));
        System.out.println("递归计算方式:" + r.conversion1(s));
        System.out.println("循环计算方式:" + r.conversion(s));
        System.out.println("简洁字符串方式:" + ss.intToroman(s.intValue()));
        long start = System.currentTimeMillis();
        //for (int i = 0; i < length; i++) {
        //    n.numberToChinese(s);
        //}
        //System.out.println("字符串方式:" + (System.currentTimeMillis() - start) + "ms");
        //start = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
            r.conversion1(s);
        }
        System.out.println("递归计算方式:" + (System.currentTimeMillis() - start) + "ms");
        start = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
            r.conversion(s);
        }
        System.out.println("循环计算方式:" + (System.currentTimeMillis() - start) + "ms");
        start = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
            ss.intToroman(s.intValue());
        }
        System.out.println("字符串衔接串方式:" + (System.currentTimeMillis() - start) + "ms");
        start = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("123");
            stringBuffer.append("12311");
            stringBuffer.append("1231111");
            String l = stringBuffer.toString();
        }
        System.out.println("stringBuffer拼接速度方式:" + (System.currentTimeMillis() - start) + "ms");
        start = System.currentTimeMillis();
        String l1 = new String("123");
        String l2 = new String("123123");
        String l3 = new String("12312");
        for (int i = 0; i < length; i++) {
            String l = "";
            l = l + l1;
            l = l + l2;
            l = l + l3;
        }
        System.out.println("字符串拼接速度方式:" + (System.currentTimeMillis() - start) + "ms");
    }
}

class R {
    String[] firstBits = new String[]{"", "万", "亿", "兆"};
    //四分单位1001,0000
    String[] secondBits = new String[]{"", "十", "百", "千"};
    String[] metadata = new String[]{"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
    boolean isStar = true;
    
    /**
     * 递归方式 ,转换
     *
     * @param i
     * @return
     * @throws Exception
     */
    public String conversion1(long i) throws Exception {
        if (i <= 0) {
            return "";
        }
        int length = longLen3(i);
        int firstMax = length / 4 + (length % 4 == 0 ? 0 : 1);//定位最大单位
        long nexti = i;
        long currenti = i;
        if (length > 4) {//低位仍有四分位继续计算
            //计算四分位
            long k = pox(10000, firstMax - 1);
            currenti = i / k;
            nexti = i % k;
        }
        boolean add = isStar ? false : true;
        isStar = false;
        if (i != nexti) {
            return length4(currenti, add) + firstBits[firstMax - 1] + conversion1(nexti);
        }
        return length4(currenti, add) + firstBits[firstMax - 1];
    }
    
    /**
     * 循环方式 ,转换
     *
     * @param i
     * @return
     * @throws Exception
     */
    public String conversion(long i) throws Exception {
        isStar = true;
        String result = "";
        while (i > 0) {
            int length = longLen3(i);
            int firstMax = length / 4 + (length % 4 == 0 ? 0 : 1);//定位最大单位
            long k = pox(10000, firstMax - 1);
            if (length > 4) {//低位仍有四分位继续计算
                //计算四分位
                result = result + length4(i / k, isStar ? false : true) + firstBits[firstMax - 1];
            } else {
                result = result + length4(i, isStar ? false : true) + firstBits[firstMax - 1];
            }
            i = i % k;
            isStar = false;
        }
        return result;
    }
    
    /**
     * 四位转换
     *
     * @param j
     * @param add
     * @return
     * @throws Exception
     */
    public String length4(Long j, boolean add) throws Exception {
        int i = j.intValue();
        int lenth = longLen3(i);
        if (lenth > 4) {
            throw new Exception();
        }
        String s = "";
        boolean LastHasZro = false;
        while (lenth >= 1) {
            int x = i / (int) pox(10, lenth - 1);
            if (!(metadata[0] == (metadata[x]))) {//equals计算时长比==长
                s = s + (metadata[x] + secondBits[lenth - 1]);
                LastHasZro = false;
            } else if (metadata[0] == (metadata[x]) && !LastHasZro) {
                s = s + (metadata[x]);
                LastHasZro = true;
            }
            i = i % 10;
            lenth--;
        }
        if (LastHasZro) {
            //s.delete(s.length() - 1, s.length());
            s = s.substring(0, s.length() - 1);
        }
        if (add && longLen3(j) < 4) {
            //s.insert(0, metadata[0]);
            s = metadata[0] + s;
        }
        return s.toString();
    }
    
    /**
     * 四位转换
     *
     * @param j
     * @param add
     * @return
     * @throws Exception
     */
    public String length4_2(Long j, boolean add) throws Exception {
        int i = j.intValue();
        int lenth = longLen3(i);
        if (lenth > 4) {
            throw new Exception();
        }
        StringBuffer s = new StringBuffer();
        boolean LastHasZro = false;
        while (lenth >= 1) {
            int x = i / (int) pox(10, lenth - 1);
            if (!(metadata[0] == (metadata[x]))) {//equals计算时长比==长
                s.append(metadata[x] + secondBits[lenth - 1]);
                LastHasZro = false;
            } else if (metadata[0] == (metadata[x]) && !LastHasZro) {
                s.append(metadata[x]);
                LastHasZro = true;
            }
            i = i % 10;
            lenth--;
        }
        if (LastHasZro) {
            s.delete(s.length() - 1, s.length());
            //s = s.substring(0, s.length() - 1);
        }
        if (add && longLen3(j) < 4) {
            s.insert(0, metadata[0]);
            //s =  + s;
        }
        return s.toString();
    }
    
    /**
     * 计算长度
     *
     * @param a
     * @return
     */
    int longLen(long a) {
        if (a == 0) return 0;
        return 1 + longLen(a / 10);
    }
    
    /**
     * 计算长度
     *
     * @param a
     * @return
     */
    int longLen2(long a) {
        if (a == 0) return 0;
        return (a + "").length();
    }
    
    final static Long[] sizeTable = {
            9l,
            99l,
            999l,
            9999l,
            99999l,
            999999l,
            9999999l,
            99999999l,
            999999999l,
            9999999999l,
            99999999999l,
            999999999999l,
            9999999999999l,
            99999999999999l,
            999999999999999l,
            9999999999999999l,
            99999999999999999l,
            999999999999999999l,
            Long.MAX_VALUE};
    
    /**
     * 计算长度
     * 最快
     *
     * @param a
     * @return
     */
    int longLen3(long a) {
        if (a == 0) return 0;
        for (int i = 0; ; i++)
            if (a <= sizeTable[i])
                return i + 1;
    }
    
    /**
     * 计算长度
     *
     * @param a
     * @return
     */
    int longLen4(long a) {
        if (a == 0) return 0;
        int count = 0;
        while (a > 0) {
            a = a / 10;
            count++;
        }
        return count;
    }
    
    
    /**
     * 指数计算
     *
     * @param x
     * @param y
     * @return
     */
    long pox(long x, long y) {
        long sum = 1;
        while (y > 0) {
            sum = sum * x;
            y--;
        }
        return sum;
    }
}

class NumberChangeToChinese {
    public String numberToChinese(long num) {//转化一个阿拉伯数字为中文字符串
        if (num == 0) {
            return "零";
        }
        int unitPos = 0;//节权位标识
        String All = new String();
        String chineseNum = new String();//中文数字字符串
        boolean needZero = false;//下一小结是否需要补零
        String strIns = new String();
        while (num > 0) {
            long section = num % 10000;//取最后面的那一个小节
            if (needZero) {//判断上一小节千位是否为零，为零就要加上零
                All = Tool.chnNumChar[0] + All;
            }
            chineseNum = sectionTOChinese(section, chineseNum);//处理当前小节的数字,然后用chineseNum记录当前小节数字
            if (section != 0) {//此处用if else 选择语句来执行加节权位
                strIns = Tool.chnUnitSection[unitPos];//当小节不为0，就加上节权位
                chineseNum = chineseNum + strIns;
            } else {
                strIns = Tool.chnUnitSection[0];//否则不用加
                chineseNum = strIns + chineseNum;
            }
            All = chineseNum + All;
            chineseNum = "";
            needZero = (section < 1000) && (section > 0);
            num = num / 10000;
            unitPos++;
        }
        return All;
    }
    
    public String sectionTOChinese(long section, String chineseNum) {
        String setionChinese = new String();//小节部分用独立函数操作
        int unitPos = 0;//小节内部的权值计数器
        boolean zero = true;//小节内部的制零判断，每个小节内只能出现一个零
        while (section > 0) {
            Long v = section % 10;//取当前最末位的值
            if (v == 0) {
                if (!zero) {
                    zero = true;//需要补零的操作，确保对连续多个零只是输出一个
                    chineseNum = Tool.chnNumChar[0] + chineseNum;
                }
            } else {
                zero = false;//有非零的数字，就把制零开关打开
                setionChinese = Tool.chnNumChar[v.intValue()];//对应中文数字位
                setionChinese = setionChinese + Tool.chnUnitChar[unitPos];//对应中文权位
                chineseNum = setionChinese + chineseNum;
            }
            unitPos++;
            section = section / 10;
        }
        
        return chineseNum;
    }
}

class Tool {
    //数字位
    public static String[] chnNumChar = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
    public static char[] chnNumChinese = {'零', '一', '二', '三', '四', '五', '六', '七', '八', '九'};
    //节权位
    public static String[] chnUnitSection = {"", "万", "亿", "万亿"};
    //权位
    public static String[] chnUnitChar = {"", "十", "百", "千"};
    public static HashMap intList = new HashMap();
    
    static {
        for (int i = 0; i < chnNumChar.length; i++) {
            intList.put(chnNumChinese[i], i);
        }
        
        intList.put('十', 10);
        intList.put('百', 100);
        intList.put('千', 1000);
    }
    
}

class Solution {
    String[] metadata = new String[]{"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
    String[] bit = new String[]{"", "十", "百", "千", "", "万", "亿"};
    
    
    public String intToroman(int i) {
        String result = "";
        int r = 0;
        while (i > 0) {
            int cur = i % 10000;
            i = i / 10000;
            boolean flag = cur < 1000 && i > 0;
            int index = 0;
            String s = "";
            while (cur > 0) {
                s = metadata[cur % 10] + (cur % 10 == 0 ? "" : bit[index]) + s;
                cur = cur / 10;
                index++;
            }
            result = (flag ? "零" : "") + s + bit[4 + r] + result;
            r++;
        }
        return result.replaceAll("零+", "零").replaceAll("零$", "");
    }
}
