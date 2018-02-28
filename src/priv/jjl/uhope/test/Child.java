package priv.jjl.uhope.test;

class Parent {

    static {
	System.out.println("父类的静态初始化块");
    }

    {
	System.out.println("父类的非静态初始化块");
    }

    public Parent() {
	System.out.println("父类的无参构造函数");
    }

    public Parent(String name) {
	System.out.println("父类的有参构造函数");
	getVal(name);
    }

    public void getVal(String name) {
	System.out.println("父类(name): " + name);
    }

}

public class Child extends Parent {

    public String name;

    static {
	System.out.println("子类的静态初始化块...");
    }
    {
	System.out.println("子类的非静态初始化块...");
    }

    public Child() {
	this("Lily");
	System.out.println("子类的无参构造函数...");
    }

    public Child(String name) {
	super(name);
	this.name = name;
	System.out.println("子类的有参构造方法...");
    }

    public void getShow() {
	System.out.println("子类(name): " + this.name);
    }

    public static void main(String[] args) {
	Child child = new Child();
	child.getShow();
	// Parent parent = new Parent();
    }

}
