package bo;

public class PC implements Empruntable{
	private String marque;
	private String type;
	private String DisqueDur;
	private String Gpu;
	private String Cpu;
	
	public PC(String marque, String type, String disqueDur, String gpu, String cpu) {
		this.marque = marque;
		this.type = type;
		this.DisqueDur = disqueDur;
		this.Gpu = gpu;
		this.Cpu = cpu;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDisqueDur() {
		return DisqueDur;
	}

	public void setDisqueDur(String disqueDur) {
		DisqueDur = disqueDur;
	}

	public String getGpu() {
		return Gpu;
	}

	public void setGpu(String gpu) {
		Gpu = gpu;
	}

	public String getCpu() {
		return Cpu;
	}

	public void setCpu(String cpu) {
		Cpu = cpu;
	}
	
}
