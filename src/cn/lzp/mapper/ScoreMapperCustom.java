package cn.lzp.mapper;

import java.util.List;

import cn.lizeping.po.Score;
import cn.lizeping.po.ScoreCustom;

public interface ScoreMapperCustom {
	//查询成绩关联学生表
	 public List<ScoreCustom> findScoreStudent() throws Exception;
	 
	 //查询成绩表关联学生表，用resultMapper
	 public List<Score> findScoreStudentResultMapper()throws Exception;
}
