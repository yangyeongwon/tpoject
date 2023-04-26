package kr.co.tproject.template;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.springframework.boot.web.client.RestTemplateBuilder;

import java.util.List;

import static kr.co.tproject.template.GenericMethods.methodName;

class TestApplication {

	@Test
	void test() {
//		List<TestDto<Integer>> list = new ArrayList<>();
//		
//		TestDto<Integer> test1 = new TestDto<>();
//		test1.setData(2);
//		
//		
//		TestDto<Integer> test2 = new TestDto<>();
//		test2.setData(2);
//		
//		
//		list.add(test1);
//		list.add(test2);
//		System.out.println(list);
//		
//		List<Integer> emptyList = TestDto.emptyList();
//		System.out.println(emptyList.getClass().getName());
//		
//		
//		TestDto2<String> stringTest3 = new TestDto2<>();
//		stringTest3.setOrderCd("주문Id");
//		
//		TestDto2<Integer> integerTest3 = new TestDto2<>();
//		integerTest3.setOrderCd(1);
//		
//		System.err.println(test1.average(test2));
//		System.out.println(stringTest3.getOrderCd());
//		System.out.println(integerTest3.getOrderCd());
//		
//		
//		boolean result = methodName("key", 3);
//		System.out.println(result);
		
		
		
		/**
		 * List<Object> -> List<String>의 상위타입이 아니므로 에러
		 *   
		 * ?(와일드카드) : 임의의 어떤 것 
		 * 
		 * List<?> -> List<String> 상위타입x				 
		 */
//		String str = "yang";
//		Object obj = str;
//		System.out.println(obj.hashCode());
//		System.out.println(str.hashCode());

//		List<String> strList = new ArrayList<>();
//		List<Object> objList= strList;
		
//		Collection<String> c = new ArrayList<>();
//		c.add("hi");
//		printCollection(c);
		
		
		/**
		 * 제네릭 타입 정보를 유지하는 방법 
		 * 
		 * 1) Object : String -> Integer cast error 
		 * 			런타임 에러발생
		 * 
		 * 2) T : String -> Integer cast error
		 * 	   컴파일 에러발생
		 * 
		 */
		SimpleCollection<String> collection = new SimpleCollection<>();
		collection.add("hi");
		collection.add("guys");
		
		String hi = (String) collection.get(0);
		String guys = (String) collection.get(1);
		
		Integer hi1 = (Integer) collection.get(0);
		Integer guys2 = (Integer) collection.get(1);
		
		System.out.println(hi1);
		System.out.println(guys2);
		
	}

//	private static void printCollection(Collection<? extends String> c) {
//		for(Object e: c) {
//			System.out.println(e);
//		}
//	}
	
	static class SimpleCollection<T>{
		private final Object[] data = new Object[100];
		private int HEAD = 0;
		
		void add(T object) {
			data[HEAD] = object;
			HEAD++;
		}
		
		T get(int index) {
			return (T)data[index];
		}
	}
}

	

