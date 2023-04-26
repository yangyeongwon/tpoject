package kr.co.tproject.template.abstract_factory.face;

public interface KingdomFactory {
	Castle createCastle();
	King createKing();
	Army createArmy();
}
