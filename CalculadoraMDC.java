import java.math.BigInteger;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class CalculadoraMDC {

	public static void main(String[] args) {

		String v1Str = JOptionPane.showInputDialog("Digite o 1° valor: ");
		int v1 = Integer.parseInt(v1Str);
		String v2Str = JOptionPane.showInputDialog("Digite o 2° valor: ");
		int v2 = Integer.parseInt(v2Str);
		String v3Str = JOptionPane.showInputDialog("Digite o 3° valor: ");
		int v3 = Integer.parseInt(v3Str);
		
		int mdc = calcularMDC(v1, v2, v3);
		String mensagem = "O MDC de "+ v1 + ", " + 
				v2 + " e " + v3 + " é: " + mdc;
		
		JOptionPane.showMessageDialog(null, mensagem);
					
		}

		public static int calcularMDC(int v1, int v2, int v3) {

		int menor = Math.min(Math.min(v1, v2), v3);
		int mdc = 1;
		
		for (int i = 2;  i < menor; i++) {
			
			if (v1 % i == 0 && v2 % i == 0 && v3 % i == 0) {

				menor = i;

			}
		}
		return menor;
	}
}		