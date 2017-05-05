package Problem_3;

public class Movie {
	
	public enum MPAArating {
		G,
		PG,
		PG13,
		R
	}
	
	private String movieName;
	protected MPAArating rating;
	private int people_1;
	private int people_2;
	private int people_3;
	private int people_4;
	private int people_5;
	
	private static double numOFRatings = 0;
	public double average;
	
	//default constructor
	public Movie() {
		movieName = "";
		rating = MPAArating.G;
		people_1 = 0;
		people_2 = 0;
		people_3 = 0;
		people_4 = 0;
		people_5 = 0;
		}
		
	//accessors and mutators 
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String newMovieName) {
		movieName = newMovieName;
	} 
	public MPAArating getRating() {
		return rating;
	}
	public void setRating(MPAArating newrating) {		
		this.rating = newrating;
	}
	
	
	//gets and sets
	public int getPeople_1() {
		return people_1;
	}
	public void setPeople_1(int people_1) {
		this.people_1 = people_1 + 1;
	}
	public int getPeople_2() {
		return people_2;
	}
	public void setPeople_2(int people_2) {
		this.people_2 = people_2 + 2;
	}
	public int getPeople_3() {
		return people_3;
	}
	public void setPeople_3(int people_3) {
		this.people_3 = people_3 + 3;
	}
	public int getPeople_4() {
		return people_4;
	}
	public void setPeople_4(int people_4) {
		this.people_4 = people_4 + 4;
	}
	public int getPeople_5() {
		return people_5;
	}
	public void setPeople_5(int people_5) {
		this.people_5 = people_5 + 5;
	}
	
	//methods
	public void addRating (int user_rating) {
		numOFRatings = numOFRatings + 1;
		switch (user_rating) {
		case 1:
			setPeople_1(people_1);
			break;
		case 2:
			setPeople_2(people_2);
			break;
		case 3:
			setPeople_3(people_3);
			break;
		case 4:
			setPeople_4(people_4);
			break;
		case 5:
			setPeople_5(people_5);
			break;
			default:
			System.out.print("Rating must be between 1 and 5");	
			System.exit(0);
		}
		
	}

	public double getAverage() {
		average = (getPeople_1() + getPeople_2() + getPeople_3() + getPeople_4() + getPeople_5()) / numOFRatings;
		numOFRatings = 0;
		return(average);
	}
	public int randomNumber() {
		int number =(int)(Math.random() * 5 + 1);
		return number;
		
	}

}