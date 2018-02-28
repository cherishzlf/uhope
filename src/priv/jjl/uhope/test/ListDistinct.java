package priv.jjl.uhope.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListDistinct {
    /*
     * 方法1: 无顺序 Hastset根据hashcode判断是否重复，数据不会重复
     */
    public static List<String> deleteDuplicate(List<String> list) {
	Set<String> set = new HashSet<String>(list);
	list.clear();
	list.addAll(set);
	return list;
    }

    /*
     * 方法2:带顺序 通过Hashset的add方法判断是否已经添加过相同的数据，如果已存在相同的数据则不添加
     */
    public static List<String> deleteDuplicateWithOrder(List<String> list) {

	Set<String> set = new HashSet<String>();
	List<String> newList = new ArrayList<String>();

	Iterator<String> it = list.iterator();
	while (it.hasNext()) {
	    String str = (String) it.next();
	    if (set.add(str)) {
		newList.add(str);
	    }
	}

	list.clear();
	list.addAll(newList);
	return newList;
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	List<String> list = new ArrayList<String>();
	list.add("AAA");
	list.add("BBB");
	list.add("CCC");
	list.add("DDD");
	list.add("BBB");
	list.add("DDD");
	list.add("FFF");

	// AAA,CCC,BBB,DDD,FFF,
	list = deleteDuplicate(list);

	// AAA,BBB,CCC,DDD,FFF,
	list = deleteDuplicateWithOrder(list);
    }

}
