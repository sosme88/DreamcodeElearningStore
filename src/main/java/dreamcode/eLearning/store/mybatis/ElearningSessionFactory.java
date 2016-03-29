package dreamcode.eLearning.store.mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ElearningSessionFactory {

	private static ElearningSessionFactory instance;
	private static SqlSessionFactory sqlSessionFactory;
	private final String resource = "mybatis-config.xml";
	
	private ElearningSessionFactory() {
		
	}
	
	public static ElearningSessionFactory getInstance() {
		if(instance == null) {
			instance = new ElearningSessionFactory();
		}
		
		return instance;
	}
	
	public SqlSession getSession() {
		if(sqlSessionFactory == null) {
			Reader reader = null;
			try {
				reader = Resources.getResourceAsReader(resource);
			}
			catch(IOException e) {
				e.printStackTrace();
				throw new RuntimeException("MyBatis 설정파일 로드중 오류가 발생했습니다.");
			}
			
			sqlSessionFactory = 
					new SqlSessionFactoryBuilder().build(reader);
		}
		
		return sqlSessionFactory.openSession(true);
	}
}
