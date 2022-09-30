package Login;

import java.sql.SQLException;

import Admin.AdminDAO;
import Admin.AdminUtil;

public class login {
	String id;
	String pwd;
	
	public login(String id,String pwd) {
		this.id=id; this.pwd = AdminUtil.pwdEncrypt(pwd);
	}
	
	public boolean chk() throws SQLException {
		return new AdminDAO().selectAdmin(id, pwd);
	}
	
}
