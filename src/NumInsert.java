import java.util.HashSet;
import java.util.List;

public class NumInsert {

	public static void main(String[] args) {

		HashSet listaInt = new HashSet();

		long ini = System.currentTimeMillis();
		System.out.println(ini);
		

		for (int i = 0; i <= 10000000; i++) {
			listaInt.add(i);
		}
		long fim = System.currentTimeMillis();
		System.out.println(fim);

		long tempo = fim - ini;

		System.out.println(tempo);

	}

}
