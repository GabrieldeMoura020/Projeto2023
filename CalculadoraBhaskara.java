import javax.swing.JOptionPane;

public class CalculadoraBhaskara {

	public static void main(String[] args) {
		
		CalculadoraBhaskara bhaskara = new CalculadoraBhaskara();
		
		Integer a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de 'a': "));
		Integer b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de 'b': "));
		Integer c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de 'c': "));
		
		double Delta = Math.pow(b, 2) - 4 * a * c;
		
		if (Delta < 0) {
			
			System.out.println("A equação não possui raízes reais.");
			
		} else if (Delta == 0) {
			
			double x = -b / (2 * a);
			System.out.println("A equação possui uma única raiz real: " + x);
			
		} else {
			
			double x1 = (-b + Math.sqrt(Delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(Delta)) / (2 * a);
			
			System.out.println("A equação possui duas raízes reais: " + x1 + " e " + x2);
			
		}
		
	}

}
