package com.bancolombia.myextra.objects;

public class TargetMyExtra {

	private String name;
	private int row,col,lenght;

	public TargetMyExtra(String name) {
		this.name=name;
	}
	
	public static TargetMyExtra the(String name) {
		return new TargetMyExtra(name);
	}
	
	public TargetMyExtra called(String name) {
		this.name=name;
		return this;
	}
	
	public TargetMyExtra locatedBy(int row, int col, int lenght) {
		this.row=row;
		this.col=col;
		this.lenght=lenght;
		return this;
	}

	public String getName() {
		return name;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	public int getLenght() {
		return lenght;
	}
	
	
}


