package edu.poniperro.intercepting.clients;

import edu.poniperro.intercepting.administrador.ProgramadorTasques;

public class Mollapp implements Client {
	private ProgramadorTasques programador;

	public Mollapp() {
	};

	@Override
	public void setProgramadorTasques(ProgramadorTasques programador) {
		this.programador = programador;
	}

	@Override
	public void enviarPeticio(String name) {
		this.programador.executarTasques(name);
	}

}
