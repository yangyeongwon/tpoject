package kr.co.tproject.template.bytecode.service.cls;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.ThreadLocalRandom;

import kr.co.tproject.template.bytecode.service.enums.Instruction;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class VirtualMachine {
	private final Stack<Integer> stack = new Stack<>();
	
	private final List<Wizard> wizards = new ArrayList<>();
	
	
	public VirtualMachine() {
		for(int i=0; i < 2; i++) {
			wizards.add(new Wizard(randomInt(3, 32), randomInt(3, 32), randomInt(3, 32), 0, 0));
		}
	}
	
	public VirtualMachine(Wizard wizard1, Wizard wizard2) {
		wizards.add(wizard1);
		wizards.add(wizard2);
	}
	
	public void execute(int[] bytecode) {
		for(int i=0; i< bytecode.length; i++) {
			Instruction instruction = Instruction.getInstruction(bytecode[i]);
			switch(instruction){
				case LITERAL :
					// Read the next byte from the bytecode.
					int value = bytecode[++i];
		          	// Push the next value to stack
			      	stack.push(value);
			      	break;
	
				case SET_AGILITY :
					int amount = stack.pop();
			        int wizard = stack.pop();
			        setAgility(wizard, amount);
					break;
				
				case SET_WISDOM :
					amount = stack.pop();
			        wizard = stack.pop();
			        setWisdom(wizard, amount);
					break;
				
				case SET_HEALTH :
					amount = stack.pop();
			        wizard = stack.pop();
			        setHealth(wizard, amount);
					break;
				
				case GET_HEALTH :
					wizard = stack.pop();
			        stack.push(getHealth(wizard));
					break;
					
				case GET_AGILITY :
					wizard = stack.pop();
			        stack.push(getAgility(wizard));
					break;
					
				case GET_WISDOM :
					wizard = stack.pop();
			        stack.push(getWisdom(wizard));
					break;
					
				case ADD :
					int a = stack.pop();
					int b = stack.pop();
			        stack.push(a + b);
					break;
					
				case DIVIDE:
					a = stack.pop();
			        b = stack.pop();
			        stack.push(b / a);
					break;
					
				case PLAY_SOUND :
					wizard = stack.pop();
			        wizards.get(wizard).playSound();
					break;
					
				case SPAWN_PARTICLES :
					wizard = stack.pop();
					wizards.get(wizard).spawnParticles();
					break;
				default:
					throw new IllegalArgumentException("Invalid instruction value");
			}
			log.info("Executed " + instruction.name() + ", Stack contains " + getStack());
		}
	}
	
	public void setHealth(int wizard, int amount) {
	    wizards.get(wizard).setHealth(amount);
	}
	public int getHealth(int wizard) {
	    return wizards.get(wizard).getHealth();
	}

	public void setAgility(int wizard, int amount) {
	    wizards.get(wizard).setAgility(amount);
	  }
	public int getAgility(int wizard) {
		return wizards.get(wizard).getAgility();
	}
	 
	public void setWisdom(int wizard, int amount) {
	    wizards.get(wizard).setWisdom(amount);
	}
	public int getWisdom(int wizard) {
	    return wizards.get(wizard).getWisdom();
	}
	
	private int randomInt(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max+1);
	}
}
