package edu.ifmo.tikunov.lab1.move;

import ru.ifmo.se.pokemon.*;
import edu.ifmo.tikunov.lab1.util.Random;

public class MirrorMove extends StatusMove {
	private static final Type TYPE = Type.NORMAL;
	private static final double POW = .0;
	private static final double ACC = 1.;
	
	public MirrorMove() {
		super(TYPE, POW, ACC);
	}

	@Override
	protected void applySelfEffects(Pokemon p) {
	}
	
	@Override
	protected String describe() {
		return "is supposed to counter the foe by mimicking its last move, but does nothing instead";
	}
}
