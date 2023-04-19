import java.util.Calendar;
import java.util.TimeZone;

import javax.swing.JOptionPane;

public class RelogioMundial {

	public static void main(String[] args) {

		String[] opcoes = TimeZone.getAvailableIDs();

		String opcaoSelecionada = (String) JOptionPane.showInputDialog(null, 
				"Selecione o país para exibir o horário: ","Relógio Mundial", JOptionPane.PLAIN_MESSAGE,
				null, opcoes, opcoes[0]);

		if (opcaoSelecionada != null) {

			TimeZone zonaHoraria = TimeZone.getTimeZone(opcaoSelecionada);
			
			Calendar zona = Calendar.getInstance(zonaHoraria);
			int hora = zona.get(Calendar.HOUR_OF_DAY);
			int minuto = zona.get(Calendar.MINUTE);
			int segundo = zona.get(Calendar.SECOND);

			JOptionPane.showMessageDialog(null, "A hora atual em " + zonaHoraria.getDisplayName() + " é:\n "
			+ String.format("%02d:%02d:%02d", hora, minuto, segundo) + " " + zonaHoraria.getID(),
			"Relógio Mundial", JOptionPane.INFORMATION_MESSAGE);

		}
	}
}