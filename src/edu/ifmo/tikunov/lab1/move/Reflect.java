package edu.ifmo.tikunov.lab1.move;

import ru.ifmo.se.pokemon.*;
import edu.ifmo.tikunov.lab1.util.Random;

public class Reflect extends StatusMove {
	private static final Type TYPE = Type.NORMAL;
	private static final double POW = .0;
	private static final double ACC = 1.;
	
	public Reflect() {
		super(TYPE, POW, ACC);
	}

	@Override
	protected void applySelfEffects(Pokemon p) {
		Effect eff = new Effect()
			.turns(5)
			.stat(Stat.DEFENSE, 2);
		p.addEffect(eff);
	}
	
	@Override
	protected String describe() {
		return "puts up a wondrous wall of light to reduce damage from physical attacks for five turns";
	}
}
