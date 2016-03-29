package dreamcode.eLearning.store.mapper;

import java.util.List;

import dreamcode.eLearning.domain.LectureDetail;

/**
 * @author 09162 김범종
 * LectureDetailMapper 입니다.
 */
public interface LectureDetailMapper {

	LectureDetail select(Integer id);
	List<LectureDetail> selectByLecture(Integer id);
	void insert(LectureDetail lectureDetail);
	void update(LectureDetail lectureDetail);
	void delete(Integer id);
	void deleteByLecture(Integer lectureId);
	Integer maxId();
}