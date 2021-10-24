package it.televisoreweb.dao;

import it.televisoreweb.dao.televisore.TelevisoreDAO;
import it.televisoreweb.dao.televisore.TelevisoreDAOimpl;

public class MyDaoFactory {

	private static TelevisoreDAO TELEVISORE_DAO_INSTANCE = null;

	public static TelevisoreDAO getTelevisoreDAOInstance() {
		if (TELEVISORE_DAO_INSTANCE == null)
			TELEVISORE_DAO_INSTANCE = new TelevisoreDAOimpl();

		return TELEVISORE_DAO_INSTANCE;
	}

}
