package cn.lzp.mapper;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import cn.lizeping.po.Score;
import cn.lizeping.po.ScoreCustom;

public class ScoreMapperCustomTest {
	
    public SqlSessionFactory sqlSessionFactory;
    
	@Before
	public void setUp() throws Exception {
		//创建sqlSessionFactory
		
		// mybatis配置文件
		String resource="SqlMapConfig.xml";	
		// 得到配置文件流
		InputStream inputStream=Resources.getResourceAsStream(resource);
		       
		// 创建会话工厂，传入mybatis的配置文件信息
		 sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);	
	}
	
	//查询成绩关联学生表
	@Test
	public void testFindScoreStudent() throws Exception {
		//打开会话
		SqlSession sqlSession=sqlSessionFactory.openSession();
				
		//创建StudentMapper的对象
		ScoreMapperCustom scoreMapperCustom=sqlSession.getMapper(ScoreMapperCustom.class);
        
		//调用mapper方法
		List<ScoreCustom> list=scoreMapperCustom.findScoreStudent();
	    
		System.out.println(list);
		
		sqlSession.close();	
	}
    
	//查询成绩表关联学生表，用resultMapper
	@Test
	public void testFindScoreStudentResultMapper() throws Exception {
		//打开会话
		SqlSession sqlSession=sqlSessionFactory.openSession();
				
		//创建StudentMapper的对象
		ScoreMapperCustom scoreMapperCustom=sqlSession.getMapper(ScoreMapperCustom.class);
        
		//调用mapper方法
		List<Score> list=scoreMapperCustom.findScoreStudentResultMapper();
	    
		System.out.println(list);
		
		sqlSession.close();	
	} 
}
