package dreamcode.eLearning.store;

import java.util.List;

import dreamcode.eLearning.domain.User;

/**
 * @author 09162 김범종
 * UserStore 입니다.
 */
public interface UserStore {

	/**
	 * 유저를 찾아주는 스토어 method
	 */
	User retrieve(String loginId);
	
	/**
	 * 모든 유저를 찾아주는 스토어 method
	 */
	List<User> retrieveAll();
	
	/**
	 * 유저를 생성해주는 스토어 method
	 */
	void create(User user);
	
	/**
	 * 유저를 업데이트 해주는 스토어 method
	 */
	void update(User user);
	
	/**
	 * 유저를 지워주는 스토어 method
	 */
	void delete(Integer id);
	
	/**
	 * 가장 큰 아이디(primary key)를 찾아주는 스토어 method
	 * 이 mothod를 service에서 호출하여
	 * (가장 큰 아이디)+1 하여 아이디를 지정해줍니다.
	 */
	Integer maxId();
}
