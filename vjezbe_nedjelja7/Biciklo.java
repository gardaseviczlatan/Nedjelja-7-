package vjezbe_nedjelja7;

class Biciklo extends VoziloAps implements Ekonomican{
	
	@Override
	public double potrosnjaPoKm() {
		return 0;
	}

	public Biciklo(int id, double maxBrzina) {
		super(id, 20);
	}
	
	@Override
	public double izracunajVrijemeDostave(double udaljenostKm) {
		return udaljenostKm/maxBrzina;
	}
}
