package com.hust.kstn.models;

import java.util.Random;

public class DigitalVideoDisc {
	private String id;
	private String title;
	private String category;
	private String director;
	private int length;
	private double cost;
	private double weight;
	private static final double DEFAULT_WEIGHT = 1.0;
	
	public DigitalVideoDisc(String title) {
		this.title = title;
		this.id = generateRandomString(10);
		this.weight = DEFAULT_WEIGHT;
	}
	public DigitalVideoDisc( String title, String category) {
		this.title = title;
		this.category = category;
		this.id = generateRandomString(10);
		this.weight = DEFAULT_WEIGHT;
	}
	public DigitalVideoDisc(String title, String category, String director, double cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		this.id = generateRandomString(10);
		this.weight = DEFAULT_WEIGHT;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		this.length = length;
		this.id = generateRandomString(10);
		this.weight = DEFAULT_WEIGHT;
	}
	
	public DigitalVideoDisc(String id, String title, String category, String director, int length, double cost, double weight) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		this.length = length;
		this.id = id;
		this.weight = weight;
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
	public String getID() {
		return id;
	}
	public double getWeight() {
		return weight;
	}
	
	private String generateRandomString(int length) {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder s = new StringBuilder(length);
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			s.append(characters.charAt(random.nextInt(characters.length())));
		}
		return s.toString();
	}
	
}
