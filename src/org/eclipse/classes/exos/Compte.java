package org.eclipse.classes.exos;

public class Compte {
	
	private int solde = 100;

	public int getSolde() {
		return this.solde;
	}

	public void retirer(int retrait) {
		solde = solde - retrait;
		System.out.println("Solde = " + solde);
	}
}
