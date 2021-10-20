package edu.ifmo.tikunov.lab1.move;

import ru.ifmo.se.pokemon.*;
import edu.ifmo.tikunov.lab1.util.Random;

public class Cut extends PhysicalMove {
	private static final Type TYPE = Type.NORMAL;
	private static final double POW = 50.;
	private static final double ACC = .95;
	
	public Cut() {
		super(TYPE, POW, ACC);
	}
	
	@Override
	protected String describe() {
		return "cuts the foe using claws, scythe, etc";
	}
}
