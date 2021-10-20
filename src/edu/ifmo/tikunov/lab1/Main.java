package edu.ifmo.tikunov.lab1;

import ru.ifmo.se.pokemon.*;
import edu.ifmo.tikunov.lab1.pokemon.*;

public class Main {
	public static void main(String[] args) {
		Battle battle = new Battle();
		
		Luvdisc ivan = new Luvdisc("Иван", 1);
		Morelull pyotr = new Morelull("Пётр", 2);
		Shiinotic andrey = new Shiinotic("Андрей", 3);
		
		Grubbin john = new Grubbin("John", 1);
		Charjabug peter = new Charjabug("Peter", 2);
		Vikavolt andrew = new Vikavolt("Andrew", 3);

		battle.addAlly(ivan);
		battle.addAlly(pyotr);
		battle.addAlly(andrey);
		
		battle.addFoe(john);
		battle.addFoe(peter);
		battle.addFoe(andrew);

		battle.go();
	}
}
