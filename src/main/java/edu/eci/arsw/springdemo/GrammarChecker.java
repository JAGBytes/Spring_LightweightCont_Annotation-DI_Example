package edu.eci.arsw.springdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class GrammarChecker {

	SpellChecker sc;

	String x;
	@Autowired
	public GrammarChecker(@Qualifier("spanishSpellChecker") SpellChecker spellChecker) {
		this.sc = spellChecker;
	}

	public SpellChecker getSpellChecker() {
		return sc;
	}

	public void setSpellChecker(SpellChecker sc) {
		this.sc = sc;
	}

	public String check(String text) {
		StringBuffer sb = new StringBuffer();
		sb.append("Spell checking output:" + sc.checkSpell(text));
		sb.append("Plagiarism checking output: Not available yet");
		return sb.toString();
	}

}
