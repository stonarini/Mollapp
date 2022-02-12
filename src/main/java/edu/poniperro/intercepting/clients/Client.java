package edu.poniperro.intercepting.clients;

import edu.poniperro.intercepting.administrador.ProgramadorTasques;

public interface Client {
	public void setProgramadorTasques(ProgramadorTasques programador);

	public void enviarPeticio(String name);
}
