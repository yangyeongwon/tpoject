package kr.co.tproject.template.bytecode.util;

import kr.co.tproject.template.bytecode.service.enums.Instruction;

public class InstructionConverterUtil {
	
	public static int[] convertToByteCode(String instructions) {
		if(instructions == null || instructions.trim().length() == 0) {
			return new int[0];
		}
		
		String[] splitedInstructions = instructions.trim().split(" ");
		int[] bytecode = new int[splitedInstructions.length];
		for(int i=0; i<splitedInstructions.length; i++) {
			
			if(isValidInstruction(splitedInstructions[i])) {
				bytecode[i] = Instruction.valueOf(splitedInstructions[i]).getIntValue();
				
			} else if(isValidInt(splitedInstructions[i])) {
				bytecode[i] = Integer.parseInt(splitedInstructions[i]);
				
			} else {
				String errMessage = "invalid instruction or number :" + splitedInstructions[i];
				throw new IllegalArgumentException(errMessage);
			}
		}
		
		return bytecode;
	}
	
	private static boolean isValidInstruction(String instruction) {
		try {
			Instruction.valueOf(instruction);
			return true;
		} catch(IllegalArgumentException ie) {
			return false;
		}
	}
	
	private static boolean isValidInt(String value) {
		try {
			Integer.parseInt(value);
			return true;
		} catch(NumberFormatException ne) {
			return false;
		}
	}
}
