package edu.ifmo.tikunov.lab1.move;

import ru.ifmo.se.pokemon.*;
import edu.ifmo.tikunov.lab1.util.Random;

public class Bind extends PhysicalMove {
	private int duration;
	
	private static final Type TYPE = Type.NORMAL;
	private static final double POW = 15.;
	private static final double ACC = .85;
	private static final double MAX_HP_DAMAGE = 1./16.;
	private static final int MIN_DURATION = 2;
	private static final int MAX_DURATION = 5;
	
	public Bind() {
		super(TYPE, POW, ACC);
		duration = Random.randomInt(MIN_DURATION, MAX_DURATION);
	}

	@Override
	protected void applyOppEffects(Pokemon p) {
		Effect eff = new Effect()
			.turns(duration)
			.condition(Status.PARALYZE)
			.stat(Stat.HP, (int)(MAX_HP_DAMAGE * p.getStat(Stat.HP)));
		p.addEffect(eff);
		duration = Random.randomInt(MIN_DURATION, MAX_DURATION);
	}

	@Override
	protected String describe() {
		return "binds and squeezes the foe for " + String.valueOf(duration) + " turns";
	}
}
