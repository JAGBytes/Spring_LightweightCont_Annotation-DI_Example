package edu.eci.arsw.springdemo;

public class EnglishSpellChecker implements SpellChecker {

	@Override
	public String checkSpell(String text) {
		return "\nChecked with english checker:" + text + "\n";
	}

}
