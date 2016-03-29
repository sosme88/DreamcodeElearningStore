package dreamcode.eLearning.store.mapper;

import java.util.List;

import dreamcode.eLearning.domain.User;

/**
 * @author 09162 김범종
 * UserMapper 입니다.
 */
public interface UserMapper {

	User select(String loginId);
	List<User> selectAll();
	void insert(User user);
	void update(User user);
	void delete(Integer id);
	Integer maxId();
}
