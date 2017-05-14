package org.shkim.factory;

public interface Product {
	/**
	 * super class를 interface로 작성 외부에서도 해당 기능들을 바로 사용할 수 있게 공유
	 * 
	 * 
	 */
	
	abstract String get_name();

	abstract int get_price();

	default String to_string() {
		return "product_name : " + get_name() + ", price : " + get_price();
	};
}
