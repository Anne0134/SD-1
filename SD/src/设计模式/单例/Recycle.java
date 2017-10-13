package 设计模式.单例;

public class Recycle {
	
	private static Recycle recycle = new Recycle();//饿汉
	
	private Recycle() {
		
	}
	
	public static Recycle getInstance() {
		return recycle;
	}

}
