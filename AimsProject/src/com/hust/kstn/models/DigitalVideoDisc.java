package com.hust.kstn.models;

public class DigitalVideoDisc extends Disc {
	private int length;
	private double weight;
	
	public DigitalVideoDisc(String title, String category, String director, int length, double cost, double weight) {
		super(title, category, cost, new String[] {director});
		this.length = length;
		this.weight = weight;
	}

	public DigitalVideoDisc(String title, String category, String[] directors, int length, double cost, double weight) {
		super(title, category, cost, directors);
		this.length = length;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return super.toString()
				+ "[" + this.length + "]"
				+ "[" + this.weight + "]";

	}

	public int getLength() {
		return length;
	}
	public double getWeight() {
		return weight;
	}
}
