package edu.poniperro.intercepting.filtres;

public class Autenticacio implements Filtre {
	public Autenticacio() {
	}

	@Override
	public void execucio(String name) {
		System.out.println("Autenticacio OK para " + name);
	}
}
