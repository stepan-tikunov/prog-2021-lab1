package edu.ifmo.tikunov.lab1.move;

import ru.ifmo.se.pokemon.*;
import edu.ifmo.tikunov.lab1.util.Random;

public class Disable extends StatusMove {
	private static final Type TYPE = Type.NORMAL;
	private static final double POW = .0;
	private static final double ACC = 1.;
	
	public Disable() {
		super(TYPE, POW, ACC);
	}
	
	@Override
	protected String describe() {
		return "tries to disable the foe's most recent move but something went wrong..";
	}
}
