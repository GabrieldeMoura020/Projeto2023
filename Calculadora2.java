import javax.swing.JOptionPane;

public class Calculadora2 {

	public static void main(String[] args) {

		Calculadora2 calculadora2 = new Calculadora2();

		String opcoes;

		// Obtem os números e a operação a ser realizada
		Integer v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° valor: "));
		opcoes = JOptionPane.showInputDialog("Digite a opção desejada(+, -, /, X, ^, √√, √√√): ");
		Integer v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° valor: "));

		// Realiza o cálculo de acordo com a operação selecionada

		switch (opcoes) {

		case "+": {

			Integer resultado = Math.addExact(v1, v2);
			JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
			break;

		}

		case "-": {

			Integer resultado = Math.subtractExact(v1, v2);
			JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
			break;

		}

		case "/": {

			Integer resultado = Math.floorDiv(v1, v2);
			JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
			break;

		}

		case "x": {

			Integer resultado = Math.multiplyExact(v1, v2);
			JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
			break;

		}

		case "^": {

			Integer resultado = (int) Math.pow(v1, v2);
			JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
			break;

		}

		case "√√": {

			Integer resultado = (int) Math.sqrt(v1);
			Integer resultado1 = (int) Math.sqrt(v2);
			JOptionPane.showMessageDialog(null, "Resultado: " + resultado, null, resultado1);
			break;

		}

		case "√√√": {

			Integer resultado = (int) Math.cbrt(v1);
			Integer resultado1 = (int) Math.cbrt(v2);
			JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
			break;

		}

		default:
			System.out.println("Opcao não encontrada");
		}
	}
}
