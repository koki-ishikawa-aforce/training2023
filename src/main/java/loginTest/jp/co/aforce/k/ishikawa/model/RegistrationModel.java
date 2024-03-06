package loginTest.jp.co.aforce.k.ishikawa.model;

import loginTest.jp.co.aforce.k.ishikawa.dao.UsersDao;
import loginTest.jp.co.aforce.k.ishikawa.dto.UsersDto;

public class RegistrationModel {
	public UsersDto checkExistsUser(String id) {
		UsersDao dao = new UsersDao();
		UsersDto result = dao.selectById(id);
		
	return result;
	}
	

	
	
	
	
	/**
	 * @param id
	 * @param password
	 * @return 
	 */
	
}
