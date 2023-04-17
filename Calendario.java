import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Calendario {

	public static void main(String[] args) {

		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano desejado: "));
		Calendar cal = new GregorianCalendar(ano, Calendar.JANUARY, 1);
		
		System.out.printf("Calendário de :\n", ano);

		for (int mes = Calendar.JANUARY; mes <= Calendar.DECEMBER; mes++) {
			
			int diasNoMes = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			System.out.printf("\n%s\n", cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()));
			System.out.println("Dom Seg Ter Qua Qui Sex Sab");
			int diasDaSemana = cal.get(Calendar.DAY_OF_WEEK) - 1;

			for (int i = 0; i <= diasDaSemana; i++) {

				System.out.println(" ");
				
			}

				for (int dia = 1; dia <= diasNoMes; dia++) {
					
					System.out.printf("%3d", dia);
					
					if (((dia + diasDaSemana) & 7) == 0 || dia == diasNoMes) {
						
						System.out.println();
						
					}
				}
			
					cal.add(Calendar.MONTH, 1);
			}
		}
	}