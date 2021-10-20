package edu.ifmo.tikunov.lab1.move;

import ru.ifmo.se.pokemon.*;
import edu.ifmo.tikunov.lab1.util.Random;

public class LockOn extends StatusMove {
	private static final Type TYPE = Type.NORMAL;
	private static final double POW = .0;
	private static final double ACC = 1.;
	
	public LockOn() {
		super(TYPE, POW, ACC);
	}

	@Override
	protected void applySelfEffects(Pokemon p) {
		Effect eff = new Effect()
			.turns(1)
			.stat(Stat.ACCURACY, 6);
		p.addEffect(eff);
	}
	
	@Override
	protected String describe() {
		return "ensures its next attack will hit";
	}
}
