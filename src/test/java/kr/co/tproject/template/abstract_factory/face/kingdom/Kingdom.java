package kr.co.tproject.template.abstract_factory.face.kingdom;

import kr.co.tproject.template.abstract_factory.face.Army;
import kr.co.tproject.template.abstract_factory.face.Castle;
import kr.co.tproject.template.abstract_factory.face.King;
import kr.co.tproject.template.abstract_factory.face.KingdomFactory;
import kr.co.tproject.template.abstract_factory.face.factory.impl.ElfKingdomFactory;
import kr.co.tproject.template.abstract_factory.face.factory.impl.OrcKingdomFactory;
import lombok.Data;

@Data
public class Kingdom {
	private King king;
	private Castle castle;
	private Army army;
	
	public static class FactoryMaker{
		
		public enum KingdomType {
			ELE, ORC
		}
		
		public static KingdomFactory makeFactory(KingdomType type) {
			switch(type) {
				case ELE:
					return new ElfKingdomFactory();
				case ORC:
					return new OrcKingdomFactory();
				default :
					throw new IllegalAccessError("KingdomType not supported");
			}
		}
	}
}
