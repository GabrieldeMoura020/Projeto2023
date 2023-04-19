import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Relogio {

	public static void main(String[] args) {

		String[] regioes = ZoneId.getAvailableZoneIds().toArray(new String[0]);

		Arrays.sort(regioes);

		String regiaoSelecionada = (String) JOptionPane.showInputDialog(null, "Selecione a região: ",
				"Selecionar Região", JOptionPane.PLAIN_MESSAGE, null, regioes, regioes[0]);

		LocalTime horaLocal = LocalTime.now(ZoneId.of(regiaoSelecionada));

		JOptionPane.showMessageDialog(null, "Hora local em " + regiaoSelecionada + ": " + horaLocal);

	}
}