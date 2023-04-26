package kr.co.tproject.template;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class TestDto<T extends Number> {
	public T data;
	String prodCd;
	String nextOrderDt;

	public double average(TestDto<T> a) {
		return (this.data.doubleValue() + a.getData().doubleValue()) / 2;
	}
	
	public static <T> List<T> emptyList(){
		return new ArrayList<T>();
	}

}
