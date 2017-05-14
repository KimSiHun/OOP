package org.shkim.singleton;

public class Singleton {

	/**
	 *  lazy initialization
	 *  instance가 사용되는 시점에 생성시키는 방법
	 *  multi thread 환경에서는 안전하지 않음.
	 */
	
	private static Singleton instance;

	private Singleton() {
		System.out.println("call singleton");
	}

	public static Singleton getInstance() {
		if (null == instance) {
			instance = new Singleton();
		}
		return instance;
	}

	public void do_print() {
		System.out.println("Lazy_initialization instance - " + instance.hashCode());
	}
}
