package kr.co.tproject.template.bridge.main;

import org.junit.jupiter.api.Test;

import kr.co.tproject.template.bridge.service.impl.enchantment.FlyingEnchantment;
import kr.co.tproject.template.bridge.service.impl.enchantment.SoulEatingEnchantment;
import kr.co.tproject.template.bridge.service.impl.weapon.Hammer;
import kr.co.tproject.template.bridge.service.impl.weapon.Sword;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class App {

	@Test
	void test() {
		log.info("The knight receives an enchanted sword.");
		Sword enchantedSword = new Sword(new SoulEatingEnchantment());
		enchantedSword.wield();
		enchantedSword.swing();
		enchantedSword.unwield();
		
		System.out.println("-----------------------------------------------");
		log.info(enchantedSword.getEnchantment().getClass().getName());
		System.out.println("-----------------------------------------------");
		
		log.info("The valkyrie receives an enchanted hammer.");
		Hammer hammer = new Hammer(new FlyingEnchantment());
		hammer.wield();
		hammer.swing();
		hammer.unwield();
	}

}
