package com.javatests;

import java.util.HashMap;

public class Welcome
{
	static HashMap<String, String> locations = new HashMap<String, String>() {
		{
			put("english", "Welcome");
			put("czech", "Vitejte");
			put("danish", "Velkomst");
			put("dutch", "Welkom");
			put("estonian", "Tere tulemast");
			put("finnish", "Tervetuloa");
			put("flemish", "Welgekomen");
			put("french", "Bienvenue");
			put("german", "Willkommen");
			put("irish", "Failte");
			put("italian", "Benvenuto");
			put("latvian", "Gaidits");
			put("lithuanian", "Laukiamas");
			put("polish", "Witamy");
			put("spanish", "Bienvenido");
			put("swedish", "Valkommen");
			put("welsh", "Croeso");
		}
	};

	public static String greet(String language) {
		System.out.println("language = " + language);
		if(locations.containsKey(language))
		{
			System.out.println("locations.get(language) = " + locations.get(language));
			return locations.get(language);
		}
		System.out.println("locations.containsKey(language) is " + locations.containsKey(language));
		return "Welcome";
	}


}
