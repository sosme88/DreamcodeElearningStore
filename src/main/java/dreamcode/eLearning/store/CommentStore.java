package dreamcode.eLearning.store;

import java.util.List;

import dreamcode.eLearning.domain.Comment;
import dreamcode.eLearning.domain.User;

/**
 * @author 09162 김범종
 * CommentStore 입니다.
 */
public interface CommentStore {

	/**
	 * 코멘트를 찾아주는 스토어 method
	 */
	Comment retrieve(Integer id);
	
	/**
	 * 강의에 따라
	 * 해당 코멘트를 전부 찾아주는 스토어 method
	 */
	List<Comment> retrieveAllByLecture(Integer lectureId);
	
	/**
	 * 코멘트를 전부 찾아주는 스토어 method
	 */
	List<Comment> retrieveAll();
	
	/**
	 * 코멘트를 생성해주는 스토어 method
	 */
	void create(Comment comment);
	
	/**
	 * 코멘트를 업데이트 해주는 스토어 method
	 */
	void update(Comment comment);
	
	/**
	 * 코멘트를 지워주는 스토어 method
	 */
	void delete(Integer id);
	
	/**
	 * 강의 삭제에 따라
	 * 해당 코멘트들을 전부 지워주는 스토어 method
	 */
	void deleteByLecture(Integer lectureId);
	
	/**
	 * 회원 탈퇴에 따라
	 * 해당 코멘트들을 전부 지워주는 스토어 method
	 */
	void deleteByUser(String userId);
	
	/**
	 * 유저정보가 바뀜에 따라
	 * 코멘트 정보를 업데이트 해주는 스토어 method
	 */
	void updateByUser(User user);
	
	/**
	 * 가장 큰 아이디(primary key)를 찾아주는 스토어 method
	 * 이 mothod를 service에서 호출하여
	 * (가장 큰 아이디)+1 하여 아이디를 지정해줍니다.
	 */
	Integer maxId();

}
