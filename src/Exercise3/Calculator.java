package Exercise3;

/**
 * Создать класс Calculator, с методами для выполнения основных арифметических операций.
 * Написать программу, которая выводит на экран основные арифметические операции.
 */

public class Calculator {

	 static final double a = 9;
	 static final double b = 7;

	public static void main(String[] args) {


		Calculator calculator = new Calculator();
		calculator.addition();
		calculator.multiply();
		calculator.division();
		calculator.subtract();
	}
	
		public void addition() {
			System.out.println("Прибавление: " + (a + b));
		}

		public void multiply() {
			System.out.println("Умножение: " + (a * b));
		}

		public void division() {
			System.out.println("Деление: " + (a / b));
		}

		public void subtract() {
			System.out.println("Отнимание: " + (a - b));
		}
}


