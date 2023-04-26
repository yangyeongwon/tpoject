package kr.co.tproject.template.builder.main;

import org.junit.jupiter.api.Test;

import kr.co.tproject.template.builder.service.cls.Hero;
import kr.co.tproject.template.builder.service.enums.Armor;
import kr.co.tproject.template.builder.service.enums.HairColor;
import kr.co.tproject.template.builder.service.enums.HairType;
import kr.co.tproject.template.builder.service.enums.Profession;
import kr.co.tproject.template.builder.service.enums.Weapon;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class App {


	@Test
	void test() {
		Hero mage = new Hero.Builder(Profession.MAGE, "Amberjill")
				.withHairColor(HairColor.BLACK)
				.withWeapon(Weapon.DAGGER)
				.build();
		
		log.info(mage.toString());
		
		Hero warrior = new Hero.Builder(Profession.WARRIOR, "Amberjill")
		        .withHairColor(HairColor.BLOND)
		        .withHairType(HairType.LONG_CURLY).withArmor(Armor.CHAIN_MAIL).withWeapon(Weapon.SWORD)
		        .build();
	    log.info(warrior.toString());
	}

}
