package Problem_3;

public class runMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie reviewOne = new Movie();
		reviewOne.setMovieName("Rio 2");
		reviewOne.setRating(Movie.MPAArating.PG);

		Movie reviewTwo = new Movie();
		reviewTwo.setMovieName("Guardians Of The Galaxy");
		reviewTwo.setRating(Movie.MPAArating.G);

		// variables for output format
		String comma = ", ";
		String averageOut = " - Average rating: ";

		for (int counter = 0; counter < 5; counter++) {
			reviewOne.addRating(reviewOne.randomNumber());
		}

		StringBuffer strBuff1 = new StringBuffer();
		strBuff1.append(reviewOne.getMovieName());
		strBuff1.append(comma);
		strBuff1.append(reviewOne.getRating());
		strBuff1.append(averageOut);
		strBuff1.append(reviewOne.getAverage());
		System.out.println(strBuff1);

		reviewTwo.addRating(4);
		reviewTwo.addRating(3);
		reviewTwo.addRating(5);
		reviewTwo.addRating(4);
		reviewTwo.addRating(2);

		StringBuffer strBuff2 = new StringBuffer();
		strBuff2.append(reviewTwo.getMovieName());
		strBuff2.append(comma);
		strBuff2.append(reviewTwo.getRating());
		strBuff2.append(averageOut);
		strBuff2.append(reviewTwo.getAverage());
		System.out.println(strBuff2);

	}

}
