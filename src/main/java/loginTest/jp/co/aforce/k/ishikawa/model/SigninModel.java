package loginTest.jp.co.aforce.k.ishikawa.model;

import loginTest.jp.co.aforce.k.ishikawa.dao.UsersDao;
import loginTest.jp.co.aforce.k.ishikawa.dto.UsersDto;

public class SigninModel {
	public UsersDto checkExistsUser(String id, String password) {
		UsersDao dao = new UsersDao();
		UsersDto result = dao.selectByIdAndPassword(id, password);
		
	return result;
	}
}
