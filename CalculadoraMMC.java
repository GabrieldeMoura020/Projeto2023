import java.math.BigInteger;

import javax.swing.JOptionPane;

public class CalculadoraMMC {

	public static void main(String[] args) {

		Integer v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° valor: "));
		Integer v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° valor: "));
		Integer v3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3° valor: "));
		Integer maior, mmc;

		if (v1 > v2 && v1 > v3) {

			maior = v1;

		} else if (v2 > v1 && v2 > v3) {

			maior = v2;

		} else {

			maior = v3;

		}

		while (true) {

			if (maior % v1 == 0 && maior % v2 == 0 && maior % v3 == 0) {

				mmc = maior;
				break;

			}

			maior++;

		}

		System.out.println("O MMC de " + v1 + ", " + v2 + " e " + v3 + " é: " + mmc);

	}
}
