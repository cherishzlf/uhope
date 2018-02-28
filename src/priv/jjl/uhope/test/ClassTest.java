package priv.jjl.uhope.test;

import priv.jjl.uhope.test.model.Student;

public class ClassTest {
    
    // 获取dao属性名称
    private static String mapperFiledName(String entityName) {
        char c = entityName.charAt(0);
        System.out.println(c);
        char lc = Character.toLowerCase(c);
        System.out.println(lc);
        String s = entityName.substring(1);
        System.out.println(s);
        return lc + s + "Mapper";
    }

    public static void main(String[] args) throws Exception {
	// TODO Auto-generated method stub
	Class<?> cla = Class.forName("priv.jjl.uhope.test.model.Student");
	Student stu = (Student) cla.newInstance();
	
	String str = ClassTest.mapperFiledName("EhTask");
	System.out.println(str);
    }

}
