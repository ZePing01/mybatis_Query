package cn.lizeping.po;

public class Login {
    private int uid;
    private String password;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [uid=" + uid + ", password=" + password + "]";
	}
    
}
