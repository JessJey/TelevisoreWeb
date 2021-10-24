package it.televisoreweb.dao.televisore;

import java.sql.Connection;
import java.util.List;

import it.televisoreweb.dao.IBaseDAO;
import it.televisoreweb.model.Televisore;

public interface TelevisoreDAO extends IBaseDAO<Televisore> {
	
	public void setConnection(Connection connection);
	public List<Televisore> findByMarcaAndModello(String marca, String modello);
	public Televisore findById(Long id);


}
