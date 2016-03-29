package dreamcode.eLearning.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import dreamcode.eLearning.domain.Lecture;
import dreamcode.eLearning.store.LectureStore;
import dreamcode.eLearning.store.mapper.LectureMapper;
import dreamcode.eLearning.store.mybatis.ElearningSessionFactory;

@Repository
public class LectureMybatisStore implements LectureStore {

	@Override
	public Lecture retrieve(Integer id) {
		SqlSession session = ElearningSessionFactory.getInstance().getSession();
		LectureMapper lectureMapper=session.getMapper(LectureMapper.class);
		Lecture lecture = lectureMapper.select(id);
		session.close();
		return lecture;
	}

	@Override
	public List<Lecture> retrieveAll() {
		SqlSession session = ElearningSessionFactory.getInstance().getSession();
		LectureMapper lectureMapper=session.getMapper(LectureMapper.class);
		List<Lecture> allLectures = lectureMapper.selectAll();
		session.close();
		return allLectures;
	}

	@Override
	public List<Lecture> retrieveAllByCategory(String category) {
		SqlSession session = ElearningSessionFactory.getInstance().getSession();
		LectureMapper lectureMapper=session.getMapper(LectureMapper.class);
		List<Lecture> lecturesByCategory = lectureMapper.selectByCategory(category);
		session.close();
		return lecturesByCategory;
	}

	@Override
	public void create(Lecture lecture) {
		SqlSession session = ElearningSessionFactory.getInstance().getSession();
		LectureMapper lectureMapper=session.getMapper(LectureMapper.class);
		lectureMapper.insert(lecture);
		session.close();
	}

	@Override
	public void update(Lecture lecture) {
		SqlSession session = ElearningSessionFactory.getInstance().getSession();
		LectureMapper lectureMapper=session.getMapper(LectureMapper.class);
		lectureMapper.update(lecture);
		session.close();
	}

	@Override
	public void delete(Integer id) {
		SqlSession session = ElearningSessionFactory.getInstance().getSession();
		LectureMapper lectureMapper=session.getMapper(LectureMapper.class);
		lectureMapper.delete(id);
		session.close();
	}
	
	@Override
	public Integer maxId(){
		SqlSession session = ElearningSessionFactory.getInstance().getSession();
		LectureMapper lectureMapper=session.getMapper(LectureMapper.class);
		Integer maxId = lectureMapper.maxId();
		session.close();
		return maxId;
	}

}

