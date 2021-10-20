package edu.ifmo.tikunov.lab1.pokemon;

import ru.ifmo.se.pokemon.*;
import edu.ifmo.tikunov.lab1.move.*;

public class Shiinotic extends Morelull {
	protected static final double HP = 60.;
	protected static final double ATT = 45.;
	protected static final double DEF = 80.;
	protected static final double SP_ATT = 90.;
	protected static final double SP_DEF = 100.;
	protected static final double SPEED = 30.;

	public Shiinotic() {
		this("Безымянный", 1);
	}

	public Shiinotic(String name, int level) {
		super(name, level);
		addMove(new PsychUp());
	}
}
