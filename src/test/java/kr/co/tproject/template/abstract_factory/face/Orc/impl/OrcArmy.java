package kr.co.tproject.template.abstract_factory.face.Orc.impl;

import kr.co.tproject.template.abstract_factory.face.Army;

public class OrcArmy implements Army{

	static final String DESCRIPTION = "This is the orc Army!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	};
	
	
	
}
