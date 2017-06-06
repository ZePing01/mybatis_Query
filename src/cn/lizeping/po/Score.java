package cn.lizeping.po;
/**
 * 成绩
 * @author Administrator
 *
 */
public class Score {
    private int cid;
    private int sid;
    private int score;
    
    //关联的信息映射在score对象的student
    private Student student;
    
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Score [cid=" + cid + ", sid=" + sid + ", score=" + score + "]";
	}
    
}
