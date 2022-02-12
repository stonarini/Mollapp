package edu.poniperro.intercepting.administrador;

import java.util.LinkedList;
import java.util.List;

import edu.poniperro.intercepting.filtres.Filtre;
import edu.poniperro.intercepting.targets.Target;

public class Tasques {
	private Target target;
	private List<Filtre> tasques;

	public Tasques() {
		this.tasques = new LinkedList<Filtre>();
	};

	public List<Filtre> getTasques() {
		return this.tasques;
	}

	public void setTarget(Target target) {
		this.target = target;
	}

	public Target getTarget() {
		return this.target;
	}

	public void afegitTasca(Filtre task) {
		this.getTasques().add(task);
	}

	public void execucio(String name) {
		try {
			this.getTasques().stream().forEach(t -> t.execucio(name));
			this.target.execucio(name);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
