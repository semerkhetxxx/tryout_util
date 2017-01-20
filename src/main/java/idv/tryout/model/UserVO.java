package idv.tryout.model;

import java.io.Serializable;



public class UserVO implements Serializable {

	private static final long serialVersionUID = 4872640461000241018L;

	Integer userNo;
	String userName;
	String userPw;
	String userPic;
	
	public Integer getUserNo() {
		return userNo;
	}
	public void setUserNo(Integer userNo) {
		this.userNo = userNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserPic() {
		return userPic;
	}
	public void setUserPic(String userPic) {
		this.userPic = userPic;
	}	


	
}
