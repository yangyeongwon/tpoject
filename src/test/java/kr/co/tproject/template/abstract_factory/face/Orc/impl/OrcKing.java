package kr.co.tproject.template.abstract_factory.face.Orc.impl;

import kr.co.tproject.template.abstract_factory.face.King;

public class OrcKing implements King {

	static final String DESCRIPTION = "This is the orc king!";
	
	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
