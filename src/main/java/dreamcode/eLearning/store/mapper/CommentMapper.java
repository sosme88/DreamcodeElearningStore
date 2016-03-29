package dreamcode.eLearning.store.mapper;

import java.util.List;

import dreamcode.eLearning.domain.Comment;
import dreamcode.eLearning.domain.User;

/**
 * @author 09162 김범종
 * CommentMapper 입니다.
 */
public interface CommentMapper {

	Comment select(Integer id);
	List<Comment> selectAll();
	List<Comment> selectByLecture(Integer lectureId);
	void insert(Comment comment);
	void update(Comment comment);
	void delete(Integer id);
	void deleteByLecture(Integer lectureId);
	void deleteByUser(String userId);
	void modifyByUser(User user);
	Integer maxId();
	
}
