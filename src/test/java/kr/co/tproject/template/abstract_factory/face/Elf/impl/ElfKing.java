package kr.co.tproject.template.abstract_factory.face.Elf.impl;

import kr.co.tproject.template.abstract_factory.face.King;

public class ElfKing implements King {

	static final String DESCRIPTION = "This is the elven king!";
	
	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
