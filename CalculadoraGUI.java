import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Iterator;

public class CalculadoraGUI extends JFrame implements ActionListener {

	public JTextField campoTexto;
	public JButton[] botoes;
	public String[] simbolos = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+" };
	public double v1, v2, resultado;
	public String operador;

	public CalculadoraGUI() {

		setTitle("Calculadora");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel painel = new JPanel(new GridLayout(4, 4));
		campoTexto = new JTextField();
		campoTexto.setEditable(false);
		add(campoTexto, BorderLayout.NORTH);

		botoes = new JButton[simbolos.length];
		for (int i = 0; i < simbolos.length; i++) {
			botoes[i] = new JButton(simbolos[i]);
			botoes[i].addActionListener(this);
			painel.add(botoes[i]);

		}

		add(painel, BorderLayout.CENTER);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		String entrada = e.getActionCommand();
		if (entrada.equals("C")) {

			campoTexto.setText("");

		} else if (entrada.equals("=")) {

			v2 = Double.parseDouble(campoTexto.getText());
			if (operador.equals("+")) {

				resultado = v1 + v2;

			} else if (operador.equals("-")) {

				resultado = v1 - v2;

			} else if (operador.equals("*")) {

				resultado = v1 * v2;

			} else if (operador.equals("/")) {

				resultado = v1 / v2;

			} else if (operador.equals("^")) {

				resultado = Math.pow(v1, v2);

			} else if (operador.equals("V2")) {

				resultado = Math.sqrt(v1);
				double resultado1 = Math.sqrt(v2);

			} else if (operador.equals("V3")) {

				resultado = Math.cbrt(v1);
				double resultado1 = Math.cbrt(v2);

			} else {
				campoTexto.setText(campoTexto.getText() + entrada);
			}
		}
	}

	public static void main(String[] args) {

		new CalculadoraGUI();

	}
}
