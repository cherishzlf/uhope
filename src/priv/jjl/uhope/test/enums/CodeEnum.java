package priv.jjl.uhope.test.enums;

public enum CodeEnum {

	A("黑龙江流域"),
	B("辽河流域"),
	C("海河流域"),
	D("黄河流域"),
	E("淮河流域"),
	F("长江流域"),
	G("浙、闽、台诸河流域"),
	H("珠江流域"),
	J("广西、云南、西藏、新疆诸国际流域"),
	K("内流区诸河流域");
	private String basinName;

	private CodeEnum(String basinName) {
		this.basinName = basinName;
	}

	public String getBasinName() {
		return basinName;
	}

	public void setBasinName(String basinName) {
		this.basinName = basinName;
	}

	
}
