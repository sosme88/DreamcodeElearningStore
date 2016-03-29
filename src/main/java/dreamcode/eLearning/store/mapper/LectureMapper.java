package dreamcode.eLearning.store.mapper;

import java.util.List;

import dreamcode.eLearning.domain.Lecture;

/**
 * @author 09162 김범종
 * LectureMapper 입니다.
 */
public interface LectureMapper {

	Lecture select(Integer id);
	List<Lecture> selectAll();
	List<Lecture> selectByCategory(String category);
	void insert(Lecture lecture);
	void update(Lecture lecture);
	void delete(Integer id);
	Integer maxId();
}
