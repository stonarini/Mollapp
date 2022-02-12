package edu.poniperro.intercepting.targets;

public class Vehicle implements Target {
	public Vehicle() {
	}

	@Override
	public void execucio(String name) {
		System.out.println("Puertas abiertas para " + name + "!");
	}
}
