package org.eclipse.classes;

public class MyThreadRunnable implements Runnable {

	private String nom;

	public MyThreadRunnable() {
	}

	public MyThreadRunnable(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.print(this.getNom() + " ");
		}
	}

}
