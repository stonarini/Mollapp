package edu.poniperro.intercepting.administrador;

import edu.poniperro.intercepting.filtres.Filtre;
import edu.poniperro.intercepting.targets.Target;

public class ProgramadorTasques {
	private Tasques tasques;

	public ProgramadorTasques(Target target) {
		this.tasques = new Tasques();
		this.getTasques().setTarget(target);
	}

	public Tasques getTasques() {
		return this.tasques;
	}

	public void setTasca(Filtre task) {
		this.getTasques().afegitTasca(task);
	}

	public void executarTasques(String name) {
		this.getTasques().execucio(name);
	}
}
