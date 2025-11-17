package com.hust.kstn.models;


public class DigitalVideoDisc {
	private static int nbDigitalVideoDiscs = 0;
	private int id;
	private String title;
	private String category;
	private String director;
	private int length;
	private double cost;
	private double weight;
	private static final double DEFAULT_WEIGHT = 1.0;
	
	public DigitalVideoDisc(String title) {
		this.title = title;
		this.weight = DEFAULT_WEIGHT;
		this.id = ++nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc( String title, String category) {
		this.title = title;
		this.category = category;
		this.weight = DEFAULT_WEIGHT;
		this.id = ++nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, String director, double cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		this.weight = DEFAULT_WEIGHT;
		this.id = ++nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		this.length = length;
		this.weight = DEFAULT_WEIGHT;
		this.id = ++nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, double cost, double weight) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		this.length = length;
		this.weight = weight;
		this.id = ++nbDigitalVideoDiscs;
	}

	@Override
	public String toString() {
		return "DVD" + "[" + this.id + "]"
				+ "[" + this.title + "]"
				+ "[" + this.cost + "]"
				+ "[" + this.director + "]"
				+ "[" + this.length + "]"
				+ "[" + this.category + "]";

	}
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public double getCost() {
		return cost;
	}
	public double getWeight() {
		return weight;
	}
	public int getID() {
		return id;
	}
	
}
