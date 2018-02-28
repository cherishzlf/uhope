package priv.jjl.uhope.test;

import java.util.ArrayList;
import java.util.List;

import priv.jjl.uhope.test.model.Student;

public class ListTest implements Comparable {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Student stu1 = new Student();
	stu1.setId(1);
	stu1.setName("jack");
	stu1.setAddress("hz");
	Student stu2 = new Student();
	stu2.setId(2);
	stu2.setName("jone");
	stu2.setAddress("nb");
	List<Student> stuList1 = new ArrayList<Student>();
	stuList1.add(stu1);
	stuList1.add(stu2);
	
	Student stu3 = new Student();
	stu3.setId(3);
	stu3.setName("tom");
	stu3.setAddress("sh");
	Student stu4 = new Student();
	stu4.setId(4);
	stu4.setName("tank");
	stu4.setAddress("js");
	List<Student> stuList2= new ArrayList<Student>();
	stuList2.add(stu3);
	stuList2.add(stu4);
	
	int size = stuList1.size();
	/* 定义两行三列的二维数组并赋值
	String [][] names = new String[2][3];
	String [][] temp = {{"tom","jack","mike"},{"zhangsan","lisi","wangwu"}};
	names = temp;
	*/
	int[][] idArr = new int[size][2];
	for(int i=0; i<size; i++){
	    int id1 = stuList1.get(i).getId();
	    int id2 = stuList2.get(i).getId();
	    idArr[i][0] = id1;
	    idArr[i][1] = id2;
	}
	
	for(int j=0; j<idArr.length; j++){
	    for(int k=0; k<idArr[j].length; k++){
		System.out.print(idArr[j][k]);
	    }
	    System.out.println();
	}
	
    }

    @Override
    public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
    }

}
