package dreamcode.eLearning.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import dreamcode.eLearning.domain.User;
import dreamcode.eLearning.store.UserStore;
import dreamcode.eLearning.store.mapper.UserMapper;
import dreamcode.eLearning.store.mybatis.ElearningSessionFactory;

@Repository
public class UserMybatisStore implements UserStore {
	
	@Override
	public User retrieve(String loginId) {
		SqlSession session = ElearningSessionFactory.getInstance().getSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		User user = userMapper.select(loginId);
		session.close();
		return user;
	}

	@Override
	public List<User> retrieveAll() {
		SqlSession session = ElearningSessionFactory.getInstance().getSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		List<User> allUsers = userMapper.selectAll();
		session.close();
		return allUsers;
	}

	@Override
	public void create(User user) {
		SqlSession session = ElearningSessionFactory.getInstance().getSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		userMapper.insert(user);
		session.close();
	}

	@Override
	public void update(User user) {
		SqlSession session = ElearningSessionFactory.getInstance().getSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		userMapper.update(user);
		session.close();
	}

	@Override
	public void delete(Integer id) {
		SqlSession session = ElearningSessionFactory.getInstance().getSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		userMapper.delete(id);
		session.close();
	}
	
	@Override
	public Integer maxId(){
		SqlSession session = ElearningSessionFactory.getInstance().getSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		Integer maxId = userMapper.maxId();
		session.close();
		return maxId;
	}

}