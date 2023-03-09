package CruzVita;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
	private List<Cartas> cartas;

	public Baralho() {
		cartas = new ArrayList<>();

		String[] naipes = { "Ouros", "Paus", "Espadas", "Copas" };
		String[] nomes = { "Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Rainha", "Rei" };

		for (String naipe : naipes) {
			for (String nome : nomes) {
				cartas.add(new Cartas(nome, naipe));
			}
		}
		
		for (int i = 0; i < 4; i++) {
			cartas.add(new Cartas("Curinga", "Curinga"));
		}
	}

	public void embaralha() {
		for (int i = 0; i < cartas.size(); i++) {
			int numRandom1 = (int)(Math.random() * cartas.size());
			int numRandom2 = (int)(Math.random() * cartas.size());
			Collections.swap(cartas, numRandom1, numRandom2);
		}
	}

	public boolean temCarta() {
		return !cartas.isEmpty();
	}

	public Cartas darCarta() {
		if (temCarta()) {
			return cartas.remove(cartas.size() - 1);
		} else {
			return null;
		}
	}

	public void imprimeBaralho() {
		for (Cartas carta : cartas) {
			System.out.println(carta.getNome() + " de " + carta.getNaipe());
		}
	}
}