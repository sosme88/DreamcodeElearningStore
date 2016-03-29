package dreamcode.eLearning.store;

import java.util.List;

import dreamcode.eLearning.domain.LectureDetail;

/**
 * @author 09162 김범종
 * LectureDetailStore 입니다.
 */
public interface LectureDetailStore {

	/**
	 * 강의 디테일을 찾아주는 스토어 method
	 */
	LectureDetail retrieve(Integer id);
	
	/**
	 * 강의에 따라
	 * 해당 강의 디테일을 전부 찾아주는 스토어 method
	 */
	List<LectureDetail> retrieveAllByLecture(Integer lectureId);
	
	/**
	 * 강의 디테일을 생성해주는 스토어 method
	 */
	void create(LectureDetail lectureDetail);
	
	/**
	 * 강의 디테일을 업데이트 해주는 스토어 method
	 */
	void update(LectureDetail lectureDetail);
	
	/**
	 * 강의 디테일을 지워주는 스토어 method
	 */
	void delete(Integer id);
	
	/**
	 * 강의에 따라
	 * 해당 강의 디테일을 전부 지워주는 스토어 method
	 */
	void deleteByLecture(Integer lectureId);
	
	/**
	 * 가장 큰 아이디(primary key)를 찾아주는 스토어 method
	 * 이 mothod를 service에서 호출하여
	 * (가장 큰 아이디)+1 하여 아이디를 지정해줍니다.
	 */
	Integer maxId();
}
