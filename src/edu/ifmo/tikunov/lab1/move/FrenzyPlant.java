package edu.ifmo.tikunov.lab1.move;

import ru.ifmo.se.pokemon.*;
import edu.ifmo.tikunov.lab1.util.Random;

public class FrenzyPlant extends SpecialMove {
	private static final Type TYPE = Type.GRASS;
	private static final double POW = 150.;
	private static final double ACC = .9;
	
	public FrenzyPlant() {
		super(TYPE, POW, ACC);
	}

	@Override
	protected void applySelfEffects(Pokemon p) {
		Effect eff = new Effect()
			.turns(1)
			.condition(Status.SLEEP)
			.attack(.0);
		p.addEffect(eff);
	}
	
	@Override
	protected String describe() {
		return "slams the foe with enormous tree but cannot move on the next turn";
	}
}
