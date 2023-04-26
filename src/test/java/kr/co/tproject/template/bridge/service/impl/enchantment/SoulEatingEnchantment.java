package kr.co.tproject.template.bridge.service.impl.enchantment;

import kr.co.tproject.template.bridge.service.face.Enchantment;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SoulEatingEnchantment implements Enchantment{

	@Override
	public void apply() {
		log.info("The item spreads bloodlust.");
		
	}

	@Override
	public void onActivate() {
		log.info("The item eats the soul of enemies.");
		
	}

	@Override
	public void onDeactivate() {
		log.info("Bloodlust slowly disappears.");
		
	}

}
