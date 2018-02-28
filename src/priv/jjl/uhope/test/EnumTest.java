package priv.jjl.uhope.test;

import priv.jjl.uhope.test.enums.CodeEnum;

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(CodeEnum code: CodeEnum.values()){
			System.out.println(code.toString()+"--"+code.getBasinName());
		}
	}
}
