package edu.ifmo.tikunov.lab1.move;

import ru.ifmo.se.pokemon.*;
import edu.ifmo.tikunov.lab1.util.Random;

public class Hypnosis extends StatusMove {
	private static final Type TYPE = Type.PSYCHIC;
	private static final double POW = .0;
	private static final double ACC = .6;
	
	public Hypnosis() {
		super(TYPE, POW, ACC);
	}
	
	@Override
	protected String describe() {
		return "employs hypnotic suggestion to make the target to fall into a deep sleep";
	}
}
