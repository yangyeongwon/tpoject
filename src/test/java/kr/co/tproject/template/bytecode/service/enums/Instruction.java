package kr.co.tproject.template.bytecode.service.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Instruction {
	LITERAL(1),				// e.g. "LITERAL 0", 0을 스택에 푸시
	SET_HEALTH(2),			// e.g. "SET_HEALTH", 건강 및 마법사 번호 팝, 세트 건강 호출
	SET_WISDOM(3),			// e.g. "SET_WISDOM", 팝 지혜 및 마법사 번호, 호출 세트 지혜
	SET_AGILITY(4),			// e.g. "SET_AGILITY", 민첩성 팝업 및 마법사 번호, 세트 민첩성 호출
	PLAY_SOUND(5),			// e.g. "PLAY_SOUND", 마법사 번호로 값 팝, 재생 사운드 호출
	SPAWN_PARTICLES(6),		// e.g. "SPAWN_PARTICLES", 마법사 번호로 값 팝, 스폰 입자 호출
	GET_HEALTH(7),			// e.g. "GET_HEALTH", 마법사 번호로 값 팝, 마법사의 건강 푸시
	GET_AGILITY(8),			// e.g. "GET_AGILITY", 마법사 번호로 값 팝, 마법사의 민첩성 푸시
	GET_WISDOM(9),			// e.g. "GET_WISDOM", 값을 마법사 번호로 팝업, 마법사의 지혜를 푸시합니다.
	ADD(10),				// e.g. "ADD", 값 2개 팝, 합계 푸시
	DIVIDE(11);				// e.g. "DIVIDE", 2개 값 팝, 나눗셈 푸시
	
	private final int intValue;
	
	/**
	  * 정수 값을 명령어로 변환합니다.
	  *
	  * @param 명령어의 값 값
	  * @return 명령어 표현
	  */
	public static Instruction getInstruction(int value) {
		for(int i=0; i < Instruction.values().length; i++ ) {
			if(Instruction.values()[i].getIntValue() == value) {
				return Instruction.values()[i];
			}
		}
		throw new IllegalArgumentException("Invalid instrcution value");
	}
}
