package org.shkim.singleton;

public class InitializationOnDemandHolderIdiom {

	/**
	 * lazy initialization을 보장하면서 내부 class(Singleton)을 생성하며
	 * Thread 간의 동기화 문제를 해결함.
	 */
	
	private InitializationOnDemandHolderIdiom() {
	};

	private static class Singleton {
		private static final InitializationOnDemandHolderIdiom insatance = new InitializationOnDemandHolderIdiom();
	}

	public static InitializationOnDemandHolderIdiom getInstance() {
		System.out.println("create instance");
		return Singleton.insatance;
	}

}
