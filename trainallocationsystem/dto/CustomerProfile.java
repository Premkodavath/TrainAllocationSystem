package trainallocationsystem.dto;

public class CustomerProfile {
	private String name;
	private int age;
	private String loginId;
	private String trainName;
	private int bogiNum;
	private int seatNum;

	public CustomerProfile(String name, int age, String loginId, String trainName, int bogiNum, int seatNum) {
		super();
		this.name = name;
		this.age = age;
		this.loginId = loginId;
		this.trainName = trainName;
		this.bogiNum = bogiNum;
		this.seatNum = seatNum;
	}

	public CustomerProfile(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public CustomerProfile(String name, int age, String loginId) {
		super();
		this.name = name;
		this.age = age;
		this.loginId = loginId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public int getBogiNum() {
		return bogiNum;
	}

	public void setBogiNum(int bogiNum) {
		this.bogiNum = bogiNum;
	}

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}

	@Override
	public String toString() {
		return "CustomerProfile [name=" + name + ", age=" + age + ", loginId=" + loginId + ", trainName=" + trainName
				+ ", bogiNum=" + bogiNum + ", seatNum=" + seatNum + "]\n";
	}

	public CustomerProfile() {

	}

}
