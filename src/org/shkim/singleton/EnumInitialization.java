package org.shkim.singleton;

public enum EnumInitialization {

	/**
	 * Instance가 생성될 때, multi thread로부터 안전.
	 * %% 추가된 method들은 safed 하지 않을 수도 있다.
	 * 사용이 간편하며 enum은 자바 프로그램 전역에서 접근이 가능하다.
	 */
	
	INSTANCE;
	static String test = "";
	public static EnumInitialization getInstance(){
		test = "test";
		return EnumInitialization.INSTANCE;
	}
}
