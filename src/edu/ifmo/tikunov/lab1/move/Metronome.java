package edu.ifmo.tikunov.lab1.move;

import ru.ifmo.se.pokemon.*;
import edu.ifmo.tikunov.lab1.util.Random;

public class Metronome extends StatusMove {
	private int randomMoveId;

	private static final Type TYPE = Type.NORMAL;
	private static final double POW = .0;
	private static final double ACC = 1.;
	private static final String[] ALL_MOVE_NAMES = new String[]{
		"Bind",
		"Twineedle",
		"Cut",
		"Ice Punch",
		"Hypnosis",
		"Disable",
		"Frenzy Plant",
		"Psych Up",
		"Lock-On",
		"Reflect",
		"Mirror Move"
	};
		
	
	public Metronome(){
		super(TYPE, POW, ACC);
	 	randomMoveId = Random.randomInt(0, ALL_MOVE_NAMES.length - 1);
	}

	@Override
	protected void applySelfEffects(Pokemon p) {
	 	randomMoveId = Random.randomInt(0, ALL_MOVE_NAMES.length - 1);
	}
	
	@Override
	protected String describe() {
		return "waggles a finger and imagines that it's randomly using " + ALL_MOVE_NAMES[randomMoveId];
	}
}
