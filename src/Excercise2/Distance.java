package Excercise2;

/**
 * Создать класс Distance с полем distance типа double и методом print.
 * В классе Distance, создайте вложенный класс Converter со статическими методами, которые будут конвертировать расстояние
 * в разные единицы измерения (к примеру, из метров в километры, из километров в мили, и так далее).
 */


class Distance {

	static final double distance = 1;

	public static void main(String[] args) {

		Distance distance = new Distance();
		Distance.print();


		Distance.Converter.Kml();
		Distance.Converter.Sajen();
		Distance.Converter.Fut();
		Distance.Converter.Mil();


	}

	private static void print() {
		System.out.println(distance);
	}

	public static class Converter {


		public static void Kml() {
			System.out.println("Kilometr " + distance * 1000);
		}

		public static void Sajen() {
			System.out.println("Sajen " + distance * 1093.6);
		}

		public static void Fut() {
			System.out.println("Fut " + distance * 3280.8);
		}

		public static void Mil() {
			System.out.println("Mili " + distance * 0.62137);
		}
	}
}


