package edu.ifmo.tikunov.lab1.move;

import ru.ifmo.se.pokemon.*;
import edu.ifmo.tikunov.lab1.util.Random;

public class PsychUp extends StatusMove {
	private static final Type TYPE = Type.NORMAL;
	private static final double POW = .0;
	private static final double ACC = 1.;
	
	public PsychUp() {
		super(TYPE, POW, ACC);
	}

	@Override
	protected void applySelfEffects(Pokemon p) {
		for (Stat stat: Stat.values()) {
			p.setMod(stat, 0);
		}
	}
	
	@Override
	protected String describe() {
		return "discards its stat changes and tries to copy the foe's stat changes but fails";
	}
}
