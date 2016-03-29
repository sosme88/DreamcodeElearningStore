package dreamcode.eLearning.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import dreamcode.eLearning.domain.Comment;
import dreamcode.eLearning.domain.User;
import dreamcode.eLearning.store.CommentStore;
import dreamcode.eLearning.store.mapper.CommentMapper;
import dreamcode.eLearning.store.mybatis.ElearningSessionFactory;

@Repository
public class CommentMybatisStore implements CommentStore {

	@Override
	public Comment retrieve(Integer id) {
		SqlSession session = ElearningSessionFactory.getInstance().getSession();
		CommentMapper commentMapper = session.getMapper(CommentMapper.class);
		Comment comment = commentMapper.select(id);
		session.close();
		return comment;
	}

	@Override
	public List<Comment> retrieveAll(){
		SqlSession session = ElearningSessionFactory.getInstance().getSession();
		CommentMapper commentMapper = session.getMapper(CommentMapper.class);
		List<Comment> comments = commentMapper.selectAll();
		session.close();
		return comments;
	}
	
	@Override
	public List<Comment> retrieveAllByLecture(Integer lectureId) {
		SqlSession session = ElearningSessionFactory.getInstance().getSession();
		CommentMapper commentMapper = session.getMapper(CommentMapper.class);
		List<Comment> comments = commentMapper.selectByLecture(lectureId);
		session.close();
		return comments;
	}

	@Override
	public void create(Comment comment) {
		SqlSession session = ElearningSessionFactory.getInstance().getSession();
		CommentMapper commentMapper = session.getMapper(CommentMapper.class);
		commentMapper.insert(comment);
		session.close();
	}

	@Override
	public void update(Comment comment) {
		SqlSession session = ElearningSessionFactory.getInstance().getSession();
		CommentMapper commentMapper = session.getMapper(CommentMapper.class);
		commentMapper.update(comment);
		session.close();
	}

	@Override
	public void delete(Integer id) {
		SqlSession session = ElearningSessionFactory.getInstance().getSession();
		CommentMapper commentMapper = session.getMapper(CommentMapper.class);
		commentMapper.delete(id);
		session.close();
	}

	@Override
	public void deleteByLecture(Integer lectureId){
		SqlSession session = ElearningSessionFactory.getInstance().getSession();
		CommentMapper commentMapper = session.getMapper(CommentMapper.class);
		commentMapper.deleteByLecture(lectureId);
		session.close();
	}
	
	@Override
	public void deleteByUser(String userId){
		SqlSession session = ElearningSessionFactory.getInstance().getSession();
		CommentMapper commentMapper = session.getMapper(CommentMapper.class);
		commentMapper.deleteByUser(userId);
		session.close();
	}
	
	@Override
	public void updateByUser(User user){
		SqlSession session = ElearningSessionFactory.getInstance().getSession();
		CommentMapper commentMapper = session.getMapper(CommentMapper.class);
		commentMapper.modifyByUser(user);
		session.close();
	}
	
	@Override
	public Integer maxId(){
		SqlSession session = ElearningSessionFactory.getInstance().getSession();
		CommentMapper commentMapper = session.getMapper(CommentMapper.class);
		Integer maxId = commentMapper.maxId();
		session.close();
		return maxId;
	}
}
