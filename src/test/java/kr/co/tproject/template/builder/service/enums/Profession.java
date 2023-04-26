package kr.co.tproject.template.builder.service.enums;

public enum Profession {
	WARRIOR, THIEF, MAGE, PRIEST;
	
	@Override
	public String toString() {
		return name().toLowerCase();
	}
}
