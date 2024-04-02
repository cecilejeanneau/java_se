package bo;

import java.time.LocalDate;

public class Journal extends Document {
	private LocalDate dateParution;
	
	public Journal(String titre, LocalDate dateParution) {
		super(titre);
		this.dateParution = dateParution;
	}

	public LocalDate getDateParution() {
		return dateParution;
	}

	public void setDateParution(LocalDate dateParution) {
		this.dateParution = dateParution;
	}
	
}
