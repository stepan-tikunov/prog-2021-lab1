package edu.ifmo.tikunov.lab1.pokemon;

import ru.ifmo.se.pokemon.*;
import edu.ifmo.tikunov.lab1.move.*;

public class Charjabug extends Grubbin {
	protected static final double HP = 57.;
	protected static final double ATT = 82.;
	protected static final double DEF = 95.;
	protected static final double SP_ATT = 55.;
	protected static final double SP_DEF = 75.;
	protected static final double SPEED = 36.;

	public Charjabug() {
		this("No name", 1);
	}

	public Charjabug(String name, int level) {
		super(name, level);
		setStats(HP, ATT, DEF, SP_ATT, SP_DEF, SPEED);
		addMove(new Reflect());
	}
}
