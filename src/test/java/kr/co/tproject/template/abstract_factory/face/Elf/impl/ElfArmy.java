package kr.co.tproject.template.abstract_factory.face.Elf.impl;

import kr.co.tproject.template.abstract_factory.face.Army;

public class ElfArmy implements Army{

	static final String DESCRIPTION = "This is the elven Army!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	};
	
	
	
}
