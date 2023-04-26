package kr.co.tproject.template.abstract_factory.face.factory.impl;

import kr.co.tproject.template.abstract_factory.face.Army;
import kr.co.tproject.template.abstract_factory.face.Castle;
import kr.co.tproject.template.abstract_factory.face.King;
import kr.co.tproject.template.abstract_factory.face.KingdomFactory;
import kr.co.tproject.template.abstract_factory.face.Orc.impl.OrcArmy;
import kr.co.tproject.template.abstract_factory.face.Orc.impl.OrcCastle;
import kr.co.tproject.template.abstract_factory.face.Orc.impl.OrcKing;

public class OrcKingdomFactory implements KingdomFactory {

	@Override
	public Castle createCastle() {
		return new OrcCastle();
	}

	@Override
	public King createKing() {
		return new OrcKing();
	}

	@Override
	public Army createArmy() {
		return new OrcArmy();
	}

}
