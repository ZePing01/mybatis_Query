package cn.lizeping.po;
/**
 * 学生个人信息
 * @author Administrator
 *
 */
public class Student {
   	//序号
    private int sid;
    //学生姓名
    private String sname;
    //学号
    private String sno;
    //班级
    private String sclass;
    
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sno=" + sno
				+ ", sclass=" + sclass + "]";
	}
       
}
