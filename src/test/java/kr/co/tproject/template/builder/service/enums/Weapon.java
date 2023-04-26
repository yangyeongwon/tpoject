package kr.co.tproject.template.builder.service.enums;

public enum Weapon {
	DAGGER, SWORD, AXE, WARHAMMER, BOW;

	@Override
	public String toString() {
		return name().toLowerCase();
	}
}
