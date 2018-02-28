package priv.jjl.uhope.test;

/**
 * 装箱和拆箱(Autoboxing and unboxing)
 * @author jiangjialiang<br>2017年5月8日
 * @version 1.0.0
 */
public class BoxTest {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Integer i = 10;	// 装箱
	int n = i;		// 拆箱
	System.out.println("------------ Integer ------------");
	
	Long m = 2147483647L;
	
	System.out.println(m+1);
	
	
	Integer i1 = 127;
	Integer i2 = 127;
	Integer i3 = 128;
	Integer i4 = 128;
	System.out.println(i1==i2);
	System.out.println(i3==i4);
	
	System.out.println("------------ Double ------------");
	Double d1 = 127.0;
	Double d2 = 127.0;
	Double d3 = 128.0;
	Double d4 = 128.0;
	System.out.println(d1==d2);
	System.out.println(d3==d4);
	
	System.out.println("------------ Long ------------");
	Long lon = 26012402244L;	// L代表长整型
	
	System.out.println("------------ Intger/Long ------------");
	Integer a = 1;
	Integer b = 2;
	Integer c = 3;
	Integer d = 3;
	Integer e = new Integer(3);
	Integer f = 128;
	Integer g = 128;
	
	Long h = 2L;
	Long j = 3L;
	System.out.println(c==d);		
	System.out.println(f==g);		
	
	System.out.println(c==e);		
	System.out.println(e==a+b);		
	
	System.out.println(c==a+b);		
	System.out.println(c.equals(a+b));	
	
	System.out.println(j==a+b);		
	System.out.println(j.equals(a+b));	
	
	System.out.println(j==a+h);		
	System.out.println(j.equals(a+h));	
	
    }

}
