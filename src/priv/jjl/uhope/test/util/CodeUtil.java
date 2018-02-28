package priv.jjl.uhope.test.util;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 编码工具类
 * @author jiangjialiang on 2018/1/17
 * @version 3.0.0
 */
public class CodeUtil {
	private static String[] a = new String[]{
			"黑龙江省", "内蒙古自治区", "吉林省", "辽宁省", 
			"230000000000", "150000000000", "220000000000", "210000000000"
			};
	private static String[] b = new String[]{
			"辽宁省",
			"210000000000"
			};
	private static String[] c = new String[]{
			"河北省", "山西省", "北京市", "天津市", 
			"130000000000", "140000000000", "110000000000", "120000000000"
			};
	private static String[] d = new String[]{
			"山西省", "陕西省", "宁夏回族自治区", "甘肃省", "青海省", 
			"140000000000", "610000000000", "640000000000", "620000000000", "630000000000"
			};
	private static String[] e = new String[]{
			"山东省", "河南省", "安徽省", "江苏省", 
			"370000000000", "410000000000", "340000000000", "320000000000"
			};
	private static String[] f = new String[]{
			"西藏自治区", "四川省", "云南省", "贵州省", "重庆市", "湖南省", "湖北省", "陕西省", "安徽省", "江苏省", "上海市", "江西省", "浙江省",
			"540000000000", "510000000000", "530000000000", "520000000000", "500000000000", "430000000000", "420000000000", "610000000000", "410000000000", "320000000000", "310000000000", "360000000000", "330000000000"
			};
	private static String[] g = new String[]{
			"浙江省", "福建省", "台湾省",
			"330000000000", "350000000000", "710000000000"
			};
	private static String[] h = new String[]{
			"云南省", "广西壮族自治区", "广东省", 
			"530000000000", "450000000000", "440000000000"
			};
	private static String[] j = new String[]{
			"广西壮族自治区", "云南省", "西藏自治区", "新疆维吾尔族自治区", 
			"450000000000", "530000000000", "540000000000", "650000000000"
			};
	private static String[] k = new String[]{
			"内蒙古自治区", "陕西省", "宁夏回族自治区", "甘肃省", "青海省", "西藏自治区", "新疆维吾尔族自治区", 
			"150000000000", "610000000000", "640000000000", "620000000000", "630000000000", "540000000000", "650000000000"
			};
	
	/**
	 * 根据行政区划名称或Code查询流域编码
	 * @param area 行政区划名称或Code
	 * @return String 流域编码 (一个或多个)
	 */
	public static String getBasinCode(String area) {
		
/*		Collection<String[]> list = new ArrayList<String[]>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		list.add(f);
		list.add(g);
		list.add(h);
		list.add(j);
		list.add(k);*/
		
		/**
		 * LinkedHashMap 就是按加入时的顺序遍历了
		 * HashMap散列图、Hashtable散列表是按“有利于随机查找的散列(hash)的顺序”。
		 * 并非按输入顺序。遍历时只能全部输出，而没有顺序。甚至可以rehash()重新散列，来获得更利于随机存取的内部顺序。
		 */
		Map<String, String[]> map = new LinkedHashMap<String, String[]>();
		String basinCode = "";
		map.put("A", a);
		map.put("B", b);
		map.put("C", c);
		map.put("D", d);
		map.put("E", e);
		map.put("F", f);
		map.put("G", g);
		map.put("H", h);
		map.put("J", j);
		map.put("K", k);
		
		/**
		 * 方法1: 在for-each循环中使用entries来遍历 (键值都需要)
		 * 注意：for-each循环在java 5中被引入所以该方法只能应用于java 5或更高的版本中。
		 * 如果你遍历的是一个空的map对象，for-each循环将抛出NullPointerException，
		 * 因此在遍历前你总是应该检查空引用。
		 */
		for (Map.Entry<String, String[]> entry : map.entrySet()) {
//		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());  
//			System.out.print("Key: "+entry.getKey()+"  Value: ");
			String[] strArr = entry.getValue();
			for (String str : strArr) {
//				System.out.print(str+" ");
				if (str.equals(area)) {
					basinCode += entry.getKey();
				}
			}
		}
		
//		System.out.println(basinCode);
		
        /**
         * 方法2: 在for-each循环中遍历keys或values
         * 如果只需要map中的键或者值，你可以通过keySet或values来实现遍历，而不是用entrySet。
         * 该方法比entrySet遍历在性能上稍好（快了10%），而且代码更加干净。
         */
        
/*		// 遍历map中的键  
		for (String key : strMap.keySet()) {  
		    System.out.println("Key = " + key);
		}  
		
		// 遍历map中的值  
		for (String[] value : strMap.values()) {  
//		    System.out.println("Value = " + value);
		    String[] valArr = value;
		    for (String str : valArr) {
				System.out.print(str+" ");
			}
		    System.out.println();
		}  */
		
		
		return basinCode;
	}
	
	/**
	 * 大写字母分割
	 * @param str 大写字母字符串
	 * @return String[] 大写字母String数组
	 */
	public static String[] letterSplit(String str) {
		String[] strArr = str.split("(?<!^)(?=[A-Z])");
/*		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}*/
		return strArr;
	}
	
}
