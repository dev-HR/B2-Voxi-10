package fr.voxilud.eval;


public class AudioBook {
	
	private int numero ;
	private String titre ;
	private boolean gratuit ;
	
	public AudioBook(int numero, String titre, boolean gratuit) {
		super();
		this.numero = numero;
		this.titre = titre;
		this.gratuit = gratuit;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public boolean isGratuit() {
		return gratuit;
	}

	public void setGratuit(boolean gratuit) {
		this.gratuit = gratuit;
	}
	
	public boolean evaluer( Auditeur auditeur , Evaluation evaluation ) {
		// Q8
		return true ;
	}

	@Override
	public String toString() {
		return "AudioBook [numero=" + numero + ", titre=" + titre + ", gratuit=" + gratuit + "]";
	}
	

}
