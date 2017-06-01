package dao;

public class dataAccess {

	private static String db = "sqlite";

	public static UserDao createGuitarDao() {
		UserDao result = null;
		switch (db) {
		case "sqlite":
			result = new sqliteDao.UserDaoImpl();
			break;
		case "mysql":
			result = new mysqlDao.UserDaoImpl();
			break;

		}
		return result;
	}
}
