package Problem_1;

public class runRoomOccupancy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RoomOccupancy firstRoom = new RoomOccupancy();
		RoomOccupancy secondRoom = new RoomOccupancy();
				
		for(int x = 0; x < 3; x++ )
		{
			firstRoom.addOneToRoom();
		}
		
		for(int x = 0; x < 7; x++ )
		{
			firstRoom.removeOneFromRoom();
		}
		
		for(int x = 0; x < 4; x++ )
		{
			secondRoom.addOneToRoom();
		}
		
		for(int x = 0; x < 3; x++ )
		{
			firstRoom.addOneToRoom();
		}
		
		System.out.println("Number of people in the first room: " 
				+ firstRoom.getNumber());
		System.out.println("Number of people in the second room: " 
				+ secondRoom.getNumber());
		System.out.println("Total number of people in all rooms: " 
				+ RoomOccupancy.getTotal());
	}

}