package kr.co.tproject.template.bytecode.service.cls;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author 
 * 이 클래스는 다음으로 해석되는 명령에 의해 속성이 변경될 수 있는 게임 개체를 나타냅니다.
 */
@AllArgsConstructor
@Data
@Slf4j
public class Wizard {
	private int health;
	private int agility;
	private int wisdom;
	private int numberOfPlayedSounds;
	private int numberOfSpawnedParticles;
	
	public void playSound() {
		log.info("Playing sound");
		numberOfPlayedSounds++;
	}
	
	public void spawnParticles() {
		log.info("Spawning particles");
		numberOfSpawnedParticles++;
	}
	
}
