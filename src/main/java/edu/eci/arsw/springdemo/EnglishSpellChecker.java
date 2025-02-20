package edu.eci.arsw.springdemo;

import org.springframework.stereotype.Component;

@Component("englishSpellChecker")
public class EnglishSpellChecker implements SpellChecker {

	@Override
	public String checkSpell(String text) {
		return "\nChecked with english checker:" + text + "\n";
	}

}
