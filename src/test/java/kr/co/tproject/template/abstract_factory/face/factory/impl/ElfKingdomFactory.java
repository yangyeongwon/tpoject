package kr.co.tproject.template.abstract_factory.face.factory.impl;

import kr.co.tproject.template.abstract_factory.face.Army;
import kr.co.tproject.template.abstract_factory.face.Castle;
import kr.co.tproject.template.abstract_factory.face.King;
import kr.co.tproject.template.abstract_factory.face.KingdomFactory;
import kr.co.tproject.template.abstract_factory.face.Elf.impl.ElfArmy;
import kr.co.tproject.template.abstract_factory.face.Elf.impl.ElfCastle;
import kr.co.tproject.template.abstract_factory.face.Elf.impl.ElfKing;

public class ElfKingdomFactory implements KingdomFactory{

	@Override
	public Castle createCastle() {
		return new ElfCastle();
	}

	@Override
	public King createKing() {
		return new ElfKing();
	}

	@Override
	public Army createArmy() {
		return new ElfArmy();
	}

}
