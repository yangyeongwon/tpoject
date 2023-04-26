package kr.co.tproject.template.abstract_factory.main;

import org.junit.jupiter.api.Test;

import kr.co.tproject.template.abstract_factory.face.KingdomFactory;
import kr.co.tproject.template.abstract_factory.face.kingdom.Kingdom;
import kr.co.tproject.template.abstract_factory.face.kingdom.Kingdom.FactoryMaker.KingdomType;

class AbsFactory implements Runnable{

	private final Kingdom kingdom = new Kingdom();
	
	@Test
	void test() {
		AbsFactory abs = new AbsFactory();
		abs.run();
	}

	@Override
	public void run() {
		System.out.println("elf kingdom");
		createKingdom(KingdomType.ELE);
		System.out.println(kingdom.getKing().getDescription());
		System.out.println(kingdom.getCastle().getDescription());
		System.out.println(kingdom.getArmy().getDescription());
		
		System.out.println("orc kingdom");
		createKingdom(KingdomType.ORC);
		System.out.println(kingdom.getKing().getDescription());
		System.out.println(kingdom.getCastle().getDescription());
		System.out.println(kingdom.getArmy().getDescription());
		
	}
	

	public void createKingdom(final KingdomType kingdomType) {
		final KingdomFactory kingdomFactory = Kingdom.FactoryMaker.makeFactory(kingdomType);
		kingdom.setKing(kingdomFactory.createKing());
		kingdom.setCastle(kingdomFactory.createCastle());
		kingdom.setArmy(kingdomFactory.createArmy());
	}

}
