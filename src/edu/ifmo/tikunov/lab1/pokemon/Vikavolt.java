package edu.ifmo.tikunov.lab1.pokemon;

import ru.ifmo.se.pokemon.*;
import edu.ifmo.tikunov.lab1.move.*;

public class Vikavolt extends Charjabug {
	protected static final double HP = 77.;
	protected static final double ATT = 70.;
	protected static final double DEF = 90.;
	protected static final double SP_ATT = 145.;
	protected static final double SP_DEF = 75.;
	protected static final double SPEED = 43.;

	public Vikavolt() {
		this("Безымянный", 1);
	}

	public Vikavolt(String name, int level) {
		super(name, level);
		setStats(HP, ATT, DEF, SP_ATT, SP_DEF, SPEED);
		addMove(new MirrorMove());
	}
}
