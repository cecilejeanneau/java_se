package bo;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private String nom;
	private String prenom;
	private int age;
	
	private List<Empruntable> emprunts;
	
	public Client(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		emprunts = new ArrayList<Empruntable>();
	}
	
	public void emprunter(Empruntable e) {
		if(emprunts.size() >= 3)
			return;
		emprunts.add(e);
	}
//	public void rendre(Empruntable e) {
//		emprunts.remove(e);
//	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
