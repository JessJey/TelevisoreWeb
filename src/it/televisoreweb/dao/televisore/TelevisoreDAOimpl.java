package it.televisoreweb.dao.televisore;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import it.televisoreweb.dao.DB_Mock;
import it.televisoreweb.model.Televisore;


public class TelevisoreDAOimpl implements TelevisoreDAO {

	private Connection connection;

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	@Override
	public List<Televisore> findByMarcaAndModello(String marca, String modello) {
		List<Televisore> result = new ArrayList<>();

		for (Televisore televisoreItem : DB_Mock.LISTA_TELEVISORI) {
			if (televisoreItem.getMarca().startsWith(marca) && televisoreItem.getModello().startsWith(modello))
				result.add(televisoreItem);
		}
		return result;
	}

	@Override
	public List<Televisore> list() throws Exception {
		return DB_Mock.LISTA_TELEVISORI;
	}

	@Override
	public Televisore get(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Televisore input) throws Exception {
		
			for (Televisore televisoreItem : DB_Mock.LISTA_TELEVISORI) {
					if(televisoreItem.getId() == input.getId()) {
				televisoreItem.setMarca(input.getMarca());
				televisoreItem.setModello(input.getModello());
				televisoreItem.setPrezzo(input.getPrezzo());
				televisoreItem.setNumeroSeriale(input.getNumeroSeriale());
				return 1;
			}
		}
		return 0;
}

	@Override
	public int insert(Televisore input) throws Exception {
		input.setId(DB_Mock.getNexIdAvailable());
		return DB_Mock.LISTA_TELEVISORI.add(input)?1:0;
	}
	
	@Override
	public int delete(Televisore input) throws Exception {
		return DB_Mock.LISTA_TELEVISORI.remove(input)?1:0;
	}

	@Override
	public Televisore findById(Long id) {
		Televisore result = new Televisore();

		for (Televisore televisoreItem : DB_Mock.LISTA_TELEVISORI) {
			if (televisoreItem.getId() == id)
				result=televisoreItem;
		}
		return result;
	}
}
