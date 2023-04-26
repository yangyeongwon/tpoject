package kr.co.tproject.template.builder.service.enums;

public enum HairColor {
	WHITE,
	BLOND,
	RED,
	BROWN,
	BLACK;
	
	@Override
	public String toString() {
		return name().toLowerCase();
	}
}
