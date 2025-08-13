package com.nit.lab.ass_feb_21;

public class MovieDetail {

	public static void main(String[] args) {
		Movies movie = new Movies("Avenger",2018,"Science Fiction");
		System.out.println(movie);
		
		movie.setMovieName("Avenger2");
		movie.setYear(2020);
		movie.setGenre("Normal");
		System.out.println(movie);

	}

}
