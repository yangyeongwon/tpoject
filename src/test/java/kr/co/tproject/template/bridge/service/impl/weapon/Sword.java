package kr.co.tproject.template.bridge.service.impl.weapon;

import kr.co.tproject.template.bridge.service.face.Enchantment;
import kr.co.tproject.template.bridge.service.face.Weapon;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class Sword implements Weapon{

	private final Enchantment enchantment;
	
	@Override
	public Enchantment getEnchantment() {
		return enchantment;
	}

	@Override
	public void swing() {
		log.info("The sword is swung.");
		enchantment.apply();
	}

	@Override
	public void unwield() {
		log.info("The sword is unwielded.");
		enchantment.onDeactivate();
		
	}

	@Override
	public void wield() {
		log.info("The sword is wielded.");
		enchantment.onActivate();
		
	}

}
