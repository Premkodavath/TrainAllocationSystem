package trainallocationsystem.dto;

public class TrainStatus {
	private String trainName;
	private int seatRemaining;
	private int seatAllocated;
	private int bogieNumber;
	public TrainStatus(String trainName, int seatRemaining, int seatAllocated, int bogieNumber) {
		super();
		this.trainName = trainName;
		this.seatRemaining = seatRemaining;
		this.seatAllocated = seatAllocated;
		this.bogieNumber = bogieNumber;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public int getSeatRemaining() {
		return seatRemaining;
	}
	public void setSeatRemaining(int seatRemaining) {
		this.seatRemaining = seatRemaining;
	}
	public int getSeatAllocated() {
		return seatAllocated;
	}
	public void setSeatAllocated(int seatAllocated) {
		this.seatAllocated = seatAllocated;
	}
	public int getBogieNumber() {
		return bogieNumber;
	}
	public void setBogieNumber(int bogieNumber) {
		this.bogieNumber = bogieNumber;
	}
	@Override
	public String toString() {
		return "TrainStatus [trainName=" + trainName + ", seatRemaining=" + seatRemaining + ", seatAllocated="
				+ seatAllocated + ", bogieNumber=" + bogieNumber + "]\n";
	}
	

}
