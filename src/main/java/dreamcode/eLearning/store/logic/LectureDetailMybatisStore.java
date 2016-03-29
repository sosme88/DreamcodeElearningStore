package dreamcode.eLearning.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import dreamcode.eLearning.domain.LectureDetail;
import dreamcode.eLearning.store.LectureDetailStore;
import dreamcode.eLearning.store.mapper.LectureDetailMapper;
import dreamcode.eLearning.store.mybatis.ElearningSessionFactory;

@Repository
public class LectureDetailMybatisStore implements LectureDetailStore {

	@Override
	public LectureDetail retrieve(Integer id) {
		SqlSession session = ElearningSessionFactory.getInstance().getSession();
		LectureDetailMapper lectureDetailMapper = session.getMapper(LectureDetailMapper.class);
		LectureDetail lectureDetail = lectureDetailMapper.select(id);
		session.close();
		return lectureDetail;
	}

	@Override
	public List<LectureDetail> retrieveAllByLecture(Integer lectureId) {
		SqlSession session = ElearningSessionFactory.getInstance().getSession();
		LectureDetailMapper lectureDetailMapper = session.getMapper(LectureDetailMapper.class);
		List<LectureDetail> lectureDetails = lectureDetailMapper.selectByLecture(lectureId);
		session.close();
		return lectureDetails;
	}

	@Override
	public void create(LectureDetail lectureDetail) {
		SqlSession session = ElearningSessionFactory.getInstance().getSession();
		LectureDetailMapper lectureDetailMapper = session.getMapper(LectureDetailMapper.class);
		lectureDetailMapper.insert(lectureDetail);
		
		session.close();
	}

	@Override
	public void update(LectureDetail lectureDetail) {
		SqlSession session = ElearningSessionFactory.getInstance().getSession();
		LectureDetailMapper lectureDetailMapper = session.getMapper(LectureDetailMapper.class);
		lectureDetailMapper.update(lectureDetail);
		session.close();
	}

	@Override
	public void delete(Integer id) {
		SqlSession session = ElearningSessionFactory.getInstance().getSession();
		LectureDetailMapper lectureDetailMapper = session.getMapper(LectureDetailMapper.class);
		lectureDetailMapper.delete(id);
		session.close();
	}

	@Override
	public void deleteByLecture(Integer lectureId){
		SqlSession session = ElearningSessionFactory.getInstance().getSession();
		LectureDetailMapper lectureDetailMapper = session.getMapper(LectureDetailMapper.class);
		lectureDetailMapper.deleteByLecture(lectureId);
		session.close();
	}
	
	@Override
	public Integer maxId(){
		SqlSession session = ElearningSessionFactory.getInstance().getSession();
		LectureDetailMapper lectureDetailMapper = session.getMapper(LectureDetailMapper.class);
		Integer maxId = lectureDetailMapper.maxId();
		session.close();
		return maxId;
	}
}


