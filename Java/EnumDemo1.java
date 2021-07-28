package com.ust.example;

 enum Directions1 {
	EAST,
	WEST,
	NORTH,
	SOUTH
}
public class EnumDemo1 {

	Directions1 dir;
	public EnumDemo1(Directions1 dir) {
		this.dir = dir;
	}
	 void getMyDirection() {
		switch (dir) {
		case EAST:
			System.out.println("In EAST Direction");
			break;
		case WEST:
			System.out.println("In WEST Direction");
			break;
		case NORTH:
			System.out.println("In NORTH Direction");
			break;
		case SOUTH:
			System.out.println("In SOUTH Direction");
			break;
		}
	}
	 public static void main(String[] args) {
		 EnumDemo1 obj1 = new EnumDemo1(Directions1.EAST);
		 obj1.getMyDirection();
		 EnumDemo1 obj2 = new EnumDemo1(Directions1.EAST);
		 obj2.getMyDirection();
	 }
}
