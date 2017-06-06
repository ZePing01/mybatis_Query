package cn.lizeping.po;
/**
 * 成绩的扩展类
 * @author Administrator
 *
 */
public class ScoreCustom {
  /**添加学生属性
   *  db_student.`sclass`,
	  db_student.`sname`,
	  db_student.`sno` 
   */
	private String sno;
	private String sname;
	private String sclass;
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	
	
}
