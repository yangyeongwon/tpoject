package kr.co.tproject.template.abstract_documents.main;

import java.util.List;

import java.util.Map;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import kr.co.tproject.template.abstract_documents.face.enums.Property;
import kr.co.tproject.template.abstract_documents.face.impl.Car;
import lombok.extern.slf4j.Slf4j;


/**
 * Abstract Document pattern - 추상 문서 패턴
 * 추가적인 비정적 속성을 처리할 수 있음. 
 * 이 패턴 유형 안전성을 가능하게 하고 서로 다른 클래스의 속성을 분리하기 위해 특성 개념을 사용
 * 
 * @author YYW
 *
 */

@SpringBootTest
@Slf4j
public class TestDocument {
	
	@Test
	public void contructorTest() {
		System.out.println("Contructing parts and car");
		Map<String, Object> wheelProperties = Map.of(
			Property.TYPE.toString(), "wheel",
			Property.MODEL.toString(), "15C",
			Property.PRICE.toString(), "100L"
		);
		
		Map<String, Object> doorProperties = Map.of(
			Property.TYPE.toString(), "door",
			Property.MODEL.toString(), "Lambo",
			Property.PRICE.toString(), "300L"
		);
		
		Map<String, Object> carProperties = Map.of(
			Property.MODEL.toString(), "300SL",
			Property.PRICE.toString(), "10000L",
			Property.PARTS.toString(), List.of(wheelProperties, doorProperties)
		);
		

		Car car = new Car(carProperties);
		System.out.println("Here is out car:");
		System.out.println("model: "+ car.getModel());
		System.out.println("price: "+ car.getPrice());
		System.out.println("parts: ");
		car.getParts().forEach(s -> System.out.println(s.getClass().getName()));
		car.getParts().forEach(s -> System.out.printf("%s, %s, %s %n", s.getType(), s.getModel(), s.getPrice()));
		 
	}
}
