package Problem_1;

public class RoomOccupancy {
	
	 public int numberInRoom;
	 public static int totalNumber;

	public RoomOccupancy() {
		numberInRoom = 0;
		totalNumber = 0;
	}
	
	public int getNumberInRoom() {
		return numberInRoom;
	}
	public void setNumberInRoom(int numberInRoom) {
		this.numberInRoom = numberInRoom;
	}
	public static int getTotalNumber() {
		return totalNumber;
	}
	public static void setTotalNumber(int totalNumber) {
		RoomOccupancy.totalNumber = totalNumber;
	}

	public void addOneToRoom() {
		numberInRoom++;
	}
	
	public void removeOneFromRoom() {
		if (numberInRoom > 0) {
		numberInRoom--;}
		else { System.out.println("No One Left in Room!");}
	}
	
	public int getNumber() {
		totalNumber = totalNumber + numberInRoom;
		return numberInRoom;
	}
	
	public static int getTotal() {
		return totalNumber;
	}	

}