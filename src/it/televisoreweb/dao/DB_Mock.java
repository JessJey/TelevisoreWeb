package it.televisoreweb.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import it.televisoreweb.model.Televisore;

public class DB_Mock {
	public static final List<Televisore> LISTA_TELEVISORI = new ArrayList<>();

	static {
		// preparo una lista mock perché ancora non ho il collegamento alla
		// base dati
		LISTA_TELEVISORI.add(new Televisore(1l, "Sony", "Next", "183S", 600));
		LISTA_TELEVISORI.add(new Televisore(2l, "HiSense", "Light", "mrs222", 400));
		LISTA_TELEVISORI.add(new Televisore(3l, "Samsung", "Plus", "mrs333", 290));
		LISTA_TELEVISORI.add(new Televisore(4l, "Phiplips", "White", "pppbbb4", 230));
		LISTA_TELEVISORI.add(new Televisore(5l, "Samsung", "Mini", "plros", 170));
		LISTA_TELEVISORI.add(new Televisore(6l, "Lg", "Different", "99I",200));
		LISTA_TELEVISORI.add(new Televisore(7l, "HiSense", "One", "1111s", 707));
	}

	public static Long getNexIdAvailable() {
		Long resultId = null;
		if (LISTA_TELEVISORI == null || LISTA_TELEVISORI.isEmpty()) {
			resultId = 1L;
		}
		resultId=LISTA_TELEVISORI.stream().max(Comparator.comparing(Televisore::getId)).get().getId();
		return ++resultId;
	}

}
