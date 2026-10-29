package vjezbe_nedjelja7;

public abstract class VoziloAps {
	protected int id;
	protected double maxBrzina;
	
	public void info() {
		System.out.println("ID je: " + id + " Max brzina je: " + maxBrzina);
	}
	
	public VoziloAps(int id, double maxBrzina) {
		super();
		this.id = id;
		this.maxBrzina = maxBrzina;
	}


	public abstract double izracunajVrijemeDostave(double udaljenostKm);
	
	
}
