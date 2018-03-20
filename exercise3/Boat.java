package exercise3;

public class Boat {//创建父类Boat
	private int length;//声明私人实例变量
	public void setlength(int len) {//声明setlength方法，将传入的实参赋值给length
		length=len;
	}
	public int getlength() {//返回length的值
		return length;
	}
	public void move() {//声明move方法
		System.out.println("drift");
	}

}
