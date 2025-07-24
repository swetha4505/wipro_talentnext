package live;

import music.playable;
import music.string.Veena;
import music.Wind.Saxophone;

public class Test {
	public static void main(String[] args) {
		Veena veena = new Veena();
		veena.play();
		Saxophone sax = new Saxophone();
		sax.play();
		playable p1 = veena;
		playable p2 = sax;

		p1.play();
		p2.play();
	}
}
