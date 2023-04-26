package kr.co.tproject.template.abstract_documents.face.abs;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

import kr.co.tproject.template.abstract_documents.face.Document;

public class AbstractDocument implements Document{

	private  final Map<String, Object> properties;
	
	protected AbstractDocument(Map<String, Object> properties) {
		Objects.requireNonNull(properties, "properties map is required");
		this.properties = properties;
	}
	
	@Override
	public Void put(String key, Object value) {
		properties.put(key, value);
		return null;
	}
	
	@Override
	public Object get(String key) {
		return properties.get(key);
	}
	
	@Override
	public <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor){
		return Stream.ofNullable(get(key))
				.filter(Objects::nonNull) 					//null 객체제외 하여 새로운 스트림 반환
				.map(el -> (List<Map<String, Object>>) el)	//리스트 스트림반환
				.findAny()									//Stream에서 가장 먼저 찾은 요소 리턴
				.stream()									//스트림으로 생성
				.flatMap(Collection::stream)				//스트림의 형태가 배열과 같을 때, 모든 원소를 단일 원소 스트림으로 반환
				.map(constructor);
	}
	
}
