package kr.koreait.vo;

public class Member {
	
//	회원 필드
	
	private int idx;			// 회원번호 Seq
	private String id;			// 아이디
	private String password;	// 비밀번호
	private String name;		// 이름
	private String BirthDay;	// 생년월일
	private String phoneNumber;	// 전화번호
	private String gender;		// 성별
	private String submitDate;	// 가입일시
	private int coupleNo;		// Connect 수락시 상대방의 idx가 담김 *-1 일시 거절메세지 띄우고 0 셋팅 *0 초과시 상대방의 프로필정보를 띄우고 적당한 효과를 줌
	private boolean coupleFlag;	// Couple Connection 시에 신호값 true = 신청 들어옴
	private String coupleDate;  // 서로의 시작일을 사용자가 Connect 신청시 직접 입력한 값이 들어가 추후 만난 일수 계산에 쓰임
	
	
	
//	회원 Getter, Setter
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthDay() {
		return BirthDay;
	}
	public void setBirthDay(String birthDay) {
		BirthDay = birthDay;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSubmitDate() {
		return submitDate;
	}
	public void setSubmitDate(String submitDate) {
		this.submitDate = submitDate;
	}
	public int getCoupleNo() {
		return coupleNo;
	}
	public void setCoupleNo(int coupleNo) {
		this.coupleNo = coupleNo;
	}
	public boolean isCoupleFlag() {
		return coupleFlag;
	}
	public void setCoupleFlag(boolean coupleFlag) {
		this.coupleFlag = coupleFlag;
	}
	public String getCoupleDate() {
		return coupleDate;
	}
	public void setCoupleDate(String coupleDate) {
		this.coupleDate = coupleDate;
	}
	
	
	@Override
	public String toString() {
		return "=========================================@ Member Info @==============================================="
				+ "Idx : " + idx
				+ "Password : " + password
				+ "Name : " + name
				+ "Gender : " + gender
				+ "PhoneNumber : " + phoneNumber
				+ "BirthDay : " + BirthDay
				+ "SubmitDate : " + submitDate
				+ "CoupleNo : " + coupleNo
				+ "CoupleFlag : " + coupleFlag
				+ "CoupleDate : " + coupleDate
				+ "====================================================================================================";
	}
	
	
	
	
}
