package vjezbe_nedjelja7;

public class Motor extends VoziloAps implements Ekonomican{

	@Override
	public double izracunajVrijemeDostave(double udaljenostKm) {
		return 0;
	}

	public Motor(int id, double maxBrzina) {
		super(id, 60);
	}
	
	@Override
	public double potrosnjaPoKm() {
		return 0.03;
	}
	

}
