package model;

import java.util.ArrayList;

public class Film {

    private String filmName;
    private int year;
    private String director;
    private int runTime;
    private double showTime;
    private double imdbPoint;

    private ArrayList<Platform> platformArrayList = new ArrayList<>();
    private ArrayList<Category> categoryArrayList = new ArrayList<>();

    public Film(String filmName, int year, String director, int runTime, double showTime, double imdbPoint) {
        this.filmName = filmName;
        this.year = year;
        this.director = director;
        this.runTime = runTime;
        this.showTime = showTime;
        this.imdbPoint = imdbPoint;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    public double getShowTime() {
        return showTime;
    }

    public void setShowTime(double showTime) {
        this.showTime = showTime;
    }

    public double getImdbPoint() {
        return imdbPoint;
    }

    public void setImdbPoint(double imdbPoint) {
        this.imdbPoint = imdbPoint;
    }

    public ArrayList<Platform> getPlatformArrayList() {
        return platformArrayList;
    }

    public void setPlatformArrayList(ArrayList<Platform> platformArrayList) {
        this.platformArrayList = platformArrayList;
    }

    public ArrayList<Category> getCategoryArrayList() {
        return categoryArrayList;
    }

    public void setCategoryArrayList(ArrayList<Category> categoryArrayList) {
        this.categoryArrayList = categoryArrayList;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmName='" + filmName + '\'' +
                ", year=" + year +
                ", director='" + director + '\'' +
                ", runTime=" + runTime +
                ", showTime=" + showTime +
                ", imdbPoint=" + imdbPoint +
                ", platformArrayList=" + platformArrayList +
                ", categoryArrayList=" + categoryArrayList +
                '}';
    }
}
