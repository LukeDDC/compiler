import java.util.Scanner;

public class Program {
	static Scanner in = new Scanner(System.in);
	static int algo = 7;

	public static int fibonacci(int x) {
		if (x == 1 || x == 0) {
			return 1;
		}
		return fibonacci(x - 1) + fibonacci(x - 2);
	}

	public static int outra_funcao_legal(String argumento, int numero) {
		System.out.print(argumento);
		if (numero == 10) {
			return 666;
		}
		return 7;
	}

	public static void main(String[] args) {
		int x = 10;
		double y = 10.0;
		String nome = "DAMAZIO E YVES";
		if (x == 10) {
			System.out.print("ME AJUDA ISIDRO\n");
		}
		while (x > 0) {
			System.out.print(x);
			System.out.print("\n");
			x = x - 1;
		}
		do {
			y = y + 1.0;
		} while (y < 20);
		x = 10;
		x = x / 2;
		System.out.print(x);
		System.out.print("\n");
		y = 20.0;
		y = y * 2;
		System.out.print(y);
		System.out.print("\n");
		nome = in.nextLine();
		System.out.print(nome);
		System.out.print("\n");
		System.out.print("\n");
		System.out.print(fibonacci(10));
		System.out.print("\n");
		if (x == 20) {
			x = 10;
		} else {
			y = 666;
		}
		x = fibonacci(10);
		System.out.print(x);
		System.out.print("\n");
	}
}
