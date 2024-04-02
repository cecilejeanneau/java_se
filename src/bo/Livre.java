package bo;

public class Livre extends Document implements Empruntable{
	private int nombrePages;
	
	public Livre(String titre, int nombrePages) {
		super(titre);
		this.nombrePages = nombrePages;
	}

	public int getNombrePages() {
		return nombrePages;
	}

	public void setNombrePages(int nombrePages) {
		this.nombrePages = nombrePages;
	}
	
}
