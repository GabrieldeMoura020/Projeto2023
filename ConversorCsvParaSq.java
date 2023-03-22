import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConversorCsvParaSq {

	private static final String fileReader = "/Users/User/Downloads/meuarquivo.csv";
	private static final String sqlReader = "/Users/User/Downloads/meuarquivo.sql";
	private static final String nome_Tabela = "my_table";

	public static void main(String[] args) {

		BufferedReader csvReader = null;
		FileWriter sqlWriter = null;

		try {

			csvReader = new BufferedReader(new FileReader(fileReader));
			sqlWriter = new FileWriter(sqlReader);

			int id = 1;

			String linha;

			while ((linha = csvReader.readLine()) != null) {

				String[] valor = linha.split(";");

				// the CSV file will two columns: id, nome, and codbarras
				String nome = valor[0];
				String codBarras = valor[0];

				// Gera instrução SQL INSERT com id incremental
				String sql = String.format("INSERT INTO %s (id, nome, codBarras) " + "VALUES (%d, '%s', '%s');",
						nome_Tabela, id, nome, codBarras);

				// Grava instrução SQL no arquivo
				sqlWriter.write(sql + "\n");

				id++;

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {

				if (csvReader != null) {
					csvReader.close();
				}

				if (sqlWriter != null) {
					sqlWriter.close();
				}

			} catch (Exception e) {
				// TODO: handle exception
			}

		}

	}

}
