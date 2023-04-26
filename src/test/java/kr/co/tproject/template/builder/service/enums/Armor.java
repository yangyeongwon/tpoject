package kr.co.tproject.template.builder.service.enums;

import kr.co.tproject.template.builder.service.face.EnumMapperType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Armor implements EnumMapperType{
	
	CLOTHES("clothes"),
	LEATHER("leather"),
	CHAIN_MAIL("chain mail"),
	PLATE_MAIL("plate mail");
	
	@Getter
	private final String title;
	
	@Override
	public String getCode() {
		return name();
	}
}
