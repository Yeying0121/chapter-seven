package exercise2;

public class MonsterTestDrive {

	public static void main(String[] args) {
		Monster [] ma=new Monster[3];
		ma[0]=new Vampire();
		ma[1]=new Dragon();
		ma[2]=new Monster();//创建一个有容量为3的Monster数组，并对三个对象分别赋值
		for(int x=0;x<3;x++) {//循环调用frighten方法
			ma[x].frighten(x);
		}
		// TODO Auto-generated method stub

	}

}
