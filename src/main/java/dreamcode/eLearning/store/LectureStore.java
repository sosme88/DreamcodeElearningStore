package dreamcode.eLearning.store;

import java.util.List;

import dreamcode.eLearning.domain.Lecture;

/**
 * @author 09162 김범종
 * LectureStore 입니다.
 */
public interface LectureStore {

	/**
	 * 강의를 찾아주는 스토어 method
	 */
	Lecture retrieve(Integer id);
	
	/**
	 * 모든 강의를 찾아주는 스토어 method
	 */
	List<Lecture> retrieveAll();
	
	/**
	 * 카테고리(앱인벤터, 파이썬)에 따라
	 * 해당 강의를 전부 찾아주는 스토어 method
	 */
	List<Lecture> retrieveAllByCategory(String category);
	
	/**
	 * 강의를 생성해주는 스토어 method
	 */
	void create(Lecture lecture);
	
	/**
	 * 강의를 업데이트 해주는 스토어 method
	 */
	void update(Lecture lecture);
	
	/**
	 * 강의를 지워주는 스토어 method
	 */
	void delete(Integer id);
	
	/**
	 * 가장 큰 아이디(primary key)를 찾아주는 스토어 method
	 * 이 mothod를 service에서 호출하여
	 * (가장 큰 아이디)+1 하여 아이디를 지정해줍니다.
	 */
	Integer maxId();
}
