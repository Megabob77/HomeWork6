package Excercise1;

/**
В классе Vehicle, создайте внутренние, приватные классы Wheel и Door,
которые содержат поле color(содержит цвет).
 Создайте методы printWheelColor, printDoorColor
y класса Vehicle - выведите цвета в консоль в классе Main.
*/
 class Vehicle {
	public void printWheelColor() {
	}

	public void printDoorColor() {
	}

	public  Wheel getWheelColor() {
		return new Wheel();
	}

	public  Door getDoorColor() {
		return new Door();
	}


	private static class Wheel  {
		String color = "Grin";
	}

	private static class Door  {
		String color = "Red";
	}


	public  class Main {
		public void main(String[] args) {
			Vehicle vehicle = new Vehicle();

			Vehicle.Wheel instance = vehicle.getWheelColor();
			Vehicle.Door instance1 = vehicle.getDoorColor();

			System.out.println(getWheelColor());
			System.out.println(getDoorColor());
		}
	}
}

