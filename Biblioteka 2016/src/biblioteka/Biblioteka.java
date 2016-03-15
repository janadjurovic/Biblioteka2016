package biblioteka;

import java.util.LinkedList;

import bibliotekainterfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {
	
	private LinkedList<Knjiga> knjige = new LinkedList<>();
	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		knjige.add(knjiga);

	}

	@Override
	public void obrisi(Knjiga knjiga) {
		knjige.remove(knjiga);

	}

	@Override
	public LinkedList<Knjiga> vratiSveKnjige() {
	
		return knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadji(Autor autor, long isbn, String naziv, String izdavac) {
		LinkedList<Knjiga> rezultat = new LinkedList<>();
		
		for(int i = 0; i<knjige.size();i++){
			if(knjige.get(i).getNaslov().contains(naziv))
				rezultat.add(knjige.get(i));
		}
		return rezultat;
	}

}
