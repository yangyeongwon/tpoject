package kr.co.tproject.template.abstract_factory.face.Orc.impl;

import kr.co.tproject.template.abstract_factory.face.Castle;

public class OrcCastle implements Castle {
	
	static final String DESCRIPTION = "This is the orc castle!";
	
	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
