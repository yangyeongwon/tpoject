package kr.co.tproject.template.builder.service.enums;

import kr.co.tproject.template.builder.service.face.EnumMapperType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum HairType implements EnumMapperType{
	
	BALD("bald"),
	SHORT("short"),
	CURLY("curly"),
	LONG_STRAIGHT("long straight"),
	LONG_CURLY("long curly");
	
	@Getter
	private final String title;

	@Override
	public String getCode() {
		return name();
	}
	
	
}
