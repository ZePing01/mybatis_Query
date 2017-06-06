package cn.lzp.mapper;

import cn.lizeping.po.Student;


public interface StudentMapper {
	//根据Id查询用户
	Student findStudentBySid(int sid)throws Exception;
}
