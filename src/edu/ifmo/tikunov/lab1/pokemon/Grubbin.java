package edu.ifmo.tikunov.lab1.pokemon;

import ru.ifmo.se.pokemon.*;
import edu.ifmo.tikunov.lab1.move.*;

public class Grubbin extends Pokemon {
	protected static final double HP = 47.;
	protected static final double ATT = 62.;
	protected static final double DEF = 45.;
	protected static final double SP_ATT = 55.;
	protected static final double SP_DEF = 45.;
	protected static final double SPEED = 46.;

	public Grubbin() {
		this("Безымянный", 1);
	}

	public Grubbin(String name, int level) {
		super(name, level);
		setStats(HP, ATT, DEF, SP_ATT, SP_DEF, SPEED);
		setType(Type.BUG);
		setMove(new Metronome(), new LockOn());
	}
}
