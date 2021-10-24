package it.televisoreweb.service.televisore;

import java.util.List;

import it.televisoreweb.dao.televisore.TelevisoreDAO;
import it.televisoreweb.model.Televisore;

public class TelevisoreServiceImpl implements TelevisoreService {

	private TelevisoreDAO televisoreDAO;

	public void setTelevisoreDAO(TelevisoreDAO televisoreDAO) {
		this.televisoreDAO = televisoreDAO;
	}

	@Override
	public List<Televisore> cercaPerMarcaEModello(String marca, String modello) {
		// abitanteDAO.setConnection(MyConnection.getConnection());
		return televisoreDAO.findByMarcaAndModello(marca, modello);
	}
	
	public Televisore cercaPerId(Long id){
		return televisoreDAO.findById(id);
	}

	@Override
	public int inserimento(Televisore televisore) throws Exception {
		return televisoreDAO.insert(televisore);
	}

	@Override
	public List<Televisore> lista() throws Exception {
		return televisoreDAO.list();
	}

	@Override
	public int rimuovi(Televisore televisore) throws Exception {
		return televisoreDAO.delete(televisore);
	}

	@Override
	public int modifica(Televisore televisore) throws Exception {
		return televisoreDAO.update(televisore);
	}

}
