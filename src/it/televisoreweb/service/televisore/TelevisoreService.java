package it.televisoreweb.service.televisore;

import java.util.List;

import it.televisoreweb.dao.televisore.TelevisoreDAO;
import it.televisoreweb.model.Televisore;

public interface TelevisoreService {
	
	public void setTelevisoreDAO(TelevisoreDAO televisoreDAO);

	public List<Televisore> cercaPerMarcaEModello(String marca, String modello);

	public Televisore cercaPerId(Long id);

	public int inserimento(Televisore Televisore) throws Exception;

	public List<Televisore> lista() throws Exception;

	public int rimuovi(Televisore Televisore) throws Exception;

	public int modifica(Televisore Televisore) throws Exception;

}
