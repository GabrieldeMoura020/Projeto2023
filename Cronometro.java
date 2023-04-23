import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Cronometro extends JFrame implements ActionListener {

	private Timer timer;
	private int segundos, milisegundos;
	private JLabel label;
	private JButton startJButton, stopButton, resetButton;

	public Cronometro() {

		segundos = 0;
		milisegundos = 0;
		label = new JLabel("0.00 segundos", JLabel.CENTER);
		startJButton = new JButton("start");
		stopButton = new JButton("stop");
		resetButton = new JButton("reset");
		startJButton.addActionListener(this);
		stopButton.addActionListener(this);
		resetButton.addActionListener(this);
		add(label);
		add(startJButton);
		add(stopButton);
		add(resetButton);

		timer = new Timer(1, new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				milisegundos++;

				if (milisegundos == 1000) {

					milisegundos = 0;
					segundos++;

				}

				label.setText(String.format("%02d.%03d segundos", segundos, milisegundos));

			}
		});

		setTitle("Crônometro");
		setLayout(new GridLayout(4, 1));
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == startJButton) {

			timer.start();

		} else if (e.getSource() == stopButton) {

			timer.stop();

		} else if (e.getSource() == resetButton) {

			timer.stop();
			segundos = 0;
			milisegundos = 0;
			label.setText("0.00 segundos");

		}

	}

	public static void main(String[] args) {

		new Cronometro();

	}

}
