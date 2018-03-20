package exercise1;

public class Mixed2 {//创建一个Mixed2类

	public static void main(String[] args) {
		A a=new A();//创建一个A对象 a
		B b=new B();//创建一个B对象 b
		C c=new C();//创建一个C对象 c
		A a2=new C();//创建一个引用类型为A的C对象 a2（这样注释不知道是不是对的）
		b.m1();//调用B类中的m1方法
		c.m2();//调用C类中的m2方法
		a.m3();//调用A类中的m3方法
		// TODO Auto-generated method stub

	}

}
