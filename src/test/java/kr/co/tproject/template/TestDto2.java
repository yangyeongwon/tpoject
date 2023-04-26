package kr.co.tproject.template;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
public class TestDto2<T>{
	
	private T orderCd;					// 주문코드

	
}
