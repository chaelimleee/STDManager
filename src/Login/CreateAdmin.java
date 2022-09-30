package Login;

import java.sql.SQLException;

import Admin.AdminDAO;

public class CreateAdmin {

	public int create(String id,String pwd) throws SQLException {
		return new AdminDAO().insertAdmin(id,pwd);
	}
	
}
