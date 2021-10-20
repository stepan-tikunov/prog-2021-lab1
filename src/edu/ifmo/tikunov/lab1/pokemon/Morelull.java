package edu.ifmo.tikunov.lab1.pokemon;

import ru.ifmo.se.pokemon.*;
import edu.ifmo.tikunov.lab1.move.*;

public class Morelull extends Pokemon {
	protected static final double HP = 40.;
	protected static final double ATT = 35.;
	protected static final double DEF = 55.;
	protected static final double SP_ATT = 65.;
	protected static final double SP_DEF = 75.;
	protected static final double SPEED = 15.;

	public Morelull() {
		this("Безымянный", 1);
	}

	public Morelull(String name, int level) {
		super(name, level);
		setStats(HP, ATT, DEF, SP_ATT, SP_DEF, SPEED);
		setType(Type.GRASS, Type.FAIRY);
		setMove(new Hypnosis(), new Disable(), new FrenzyPlant());
	}
}
