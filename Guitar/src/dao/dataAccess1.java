package dao;


import sqliteDao.UserDaoImpl;
public class dataAccess1 {

	private static String daoName = "aqliteDao";
	

	public static UserDao createUserDao(){
		UserDao result = null ;
		try{
			Object o = Class.forName(daoName+ "." + "InstrumentDaoImpl").newInstance();
			result = (UserDaoImpl)o ;
		}catch(InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return result ;
	}
	}

