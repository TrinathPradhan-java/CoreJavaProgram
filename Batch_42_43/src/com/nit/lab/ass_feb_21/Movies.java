package com.nit.lab.ass_feb_21;

public class Movies {
private String movieName;
private int year;
private String genre;
public Movies(String movieName, int year, String genre) {
	super();
	this.movieName = movieName;
	this.year = year;
	this.genre = genre;
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
@Override
public String toString() {
	return "Movies [movieName=" + movieName + ", year=" + year + ", genre=" + genre + "]";
}


}
