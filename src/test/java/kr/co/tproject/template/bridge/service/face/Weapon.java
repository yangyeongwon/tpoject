package kr.co.tproject.template.bridge.service.face;

public interface Weapon {
	Enchantment getEnchantment();
	
	void swing();
	
	void unwield();
	
	void wield();
}
