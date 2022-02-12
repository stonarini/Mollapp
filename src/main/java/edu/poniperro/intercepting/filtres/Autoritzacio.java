package edu.poniperro.intercepting.filtres;

public class Autoritzacio implements Filtre {
	public Autoritzacio() {
	}

	@Override
	public void execucio(String name) {
		System.out.println("Autoritzacio OK para " + name);
	}
}
