package edu.ifmo.tikunov.lab1.pokemon;

import ru.ifmo.se.pokemon.*;
import edu.ifmo.tikunov.lab1.move.*;

public class Luvdisc extends Pokemon {
	static final double HP = 43.;
	static final double ATT = 30.;
	static final double DEF = 55.;
	static final double SP_ATT = 40.;
	static final double SP_DEF = 65.;
	static final double SPEED = 97.;

	public Luvdisc() {
		this("Безымянный", 1);
	}

	public Luvdisc(String name, int level) {
		super(name, level);
		setStats(HP, ATT, DEF, SP_ATT, SP_DEF, SPEED);
		setType(Type.WATER);
		setMove(new Bind(), new Twineedle(), new Cut(), new IcePunch());
	}
}
