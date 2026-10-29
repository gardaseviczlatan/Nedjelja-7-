package vjezbe_nedjelja7;
import java.util.ArrayList;
public class testAps {

	public static void main(String[] args) {
		
		VoziloAps[] vozila = new VoziloAps[3];
		
		vozila[0] = new Biciklo(321,20);
		vozila[1] = new Motor(543,60);
		vozila[2] = new Automobil(999,80);
		
		double udaljenost = 10.0;
			
		for(VoziloAps v: vozila) {
			v.info();
			
			if(v instanceof Ekonomican) {
				Ekonomican e = (Ekonomican) v;
				
				double ukupnaPotrosnja = e.potrosnjaPoKm * udaljenost;
				System.out.println("Potrosnja na: " + udaljenost + " km je: " + ukupnaPotrosnja);
			}
		}
		

		
		
	}

}
