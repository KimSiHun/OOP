package org.shkim.singleton;

public class ThreadSafeInitialization {

	/**
	 * ThreadSafeInitialization multi thread의 해결을 위해 synchronized(동기화) 사용 multi
	 * Thread들이 동시에 instance 생성시키는 위험은 없어졌다. 다수의 thread들이 getInstance()를 호출하면 높은
	 * cost 비용으로 성능저하 가능성이 높다.
	 */

	private static ThreadSafeInitialization instance;

	private ThreadSafeInitialization() {
	};

	public static synchronized ThreadSafeInitialization getInstance() {
		if (null == instance) {
			instance = new ThreadSafeInitialization();
		}
		return instance;
	}

	public void do_print() {
		System.out.println("ThreadSafeInitialization instance - " + instance.hashCode());
	}
}
