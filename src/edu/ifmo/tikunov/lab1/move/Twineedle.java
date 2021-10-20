package edu.ifmo.tikunov.lab1.move;

import ru.ifmo.se.pokemon.*;
import edu.ifmo.tikunov.lab1.util.Random;

public class Twineedle extends PhysicalMove {
	private boolean poisoned;
	
	private static final Type TYPE = Type.BUG;
	private static final double POW = 25.;
	private static final double ACC = 1.;
	private static final double POISON_CHANCE = .2;
	private static final int PRIORITY = 0;
	private static final int HITS = 2;
	
	public Twineedle() {
		super(TYPE, POW, ACC, PRIORITY, HITS);
		poisoned = Random.chance(POISON_CHANCE);
	}

	@Override
	protected void applyOppEffects(Pokemon p) {
		if (poisoned) {
			Effect.poison(p);
		}
		poisoned = Random.chance(POISON_CHANCE);
	}

	@Override
	protected String describe() {
		if (poisoned) {
			return "jabs the foe twice using stingers. It also poisons the target";
		}
		return "jabs the foe twice using stingers";
	}
}
