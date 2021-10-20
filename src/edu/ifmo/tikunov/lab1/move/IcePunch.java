package edu.ifmo.tikunov.lab1.move;

import ru.ifmo.se.pokemon.*;
import edu.ifmo.tikunov.lab1.util.Random;

public final class IcePunch extends PhysicalMove {
	private boolean frozen;

	private static final Type TYPE = Type.ICE;
	private static final double POW = 75;
	private static final double ACC = 1.;
	private static final double FREEZE_CHANCE = .1;

	public IcePunch() {
		super(TYPE, POW, ACC);
		frozen = Random.chance(FREEZE_CHANCE);		
	}

	@Override
	protected void applyOppEffects(Pokemon p) {
		if (frozen) {
			Effect.freeze(p);
		}
		frozen = Random.chance(FREEZE_CHANCE);
	}

	@Override
	protected String describe() {
		if (frozen) {
			return "punches the foe with an icy fist and leaves it frozen";
		}
		return "punches the foe with an icy fist";
	}
}
