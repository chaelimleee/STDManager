package Admin;

import java.sql.SQLException;

import DB.STDManager;

public class AdminDAO {
	STDManager stdM;
	
	public AdminDAO() throws SQLException {
		stdM = STDManager.getInstance();
	}
	
	public int createAdminTBL() {
		return stdM.run("CREATE TABLE AdminTBL(adminId VARCHAR(15) PRIMARY KEY, adminPwd VARCHAR(64))");
	}
	
	public int insertAdmin(String id,String pwd) {
		pwd = AdminUtil.pwdEncrypt(pwd);
		return stdM.run("INSERT INTO AdminTBL VALUES('"+id+"','"+pwd+"')");
	}
	
	public boolean selectAdmin(String id,String pwd) {
		return stdM.selectAdmin("SELECT * FROM AdminTBL WHERE adminId = '"+id+"' and adminPwd= '"+pwd+"'");
	}
}