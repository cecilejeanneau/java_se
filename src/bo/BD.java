package bo;

public class BD extends Document {
	private String dessinateur;
	
	public BD(String titre, String dessinateur) {
		super(titre);
		this.dessinateur = dessinateur;
	}

	public String getDessinateur() {
		return dessinateur;
	}

	public void setDessinateur(String dessinateur) {
		this.dessinateur = dessinateur;
	}
	
}
