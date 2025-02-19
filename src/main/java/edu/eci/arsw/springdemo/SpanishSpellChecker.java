package edu.eci.arsw.springdemo;

public class SpanishSpellChecker implements SpellChecker {

	@Override
	public String checkSpell(String text) {
		return "\nRevisando ( " + text + " ) con el verificador de sintaxis del español.\n";

	}

}
