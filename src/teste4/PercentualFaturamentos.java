package teste4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PercentualFaturamentos {
	public static void main(String[] args) {
		String [][] dados = {{"SP","RJ","MG","ES","outros"},{"67836.43","36678.66","29229.88","27165.48"}};
		BigDecimal percentual = new BigDecimal(0);
		BigDecimal faturamentoTotal = new BigDecimal(0);
		
		// somando faturamentos
		for(int i = 0; i < dados[1].length; i++) {
			faturamentoTotal = faturamentoTotal.add(new BigDecimal(dados[1][i]));
		}
		
		for(int i = 0; i < dados[1].length; i++) {
			percentual = (BigDecimal.valueOf(Double.parseDouble(dados[1][i])).divide(faturamentoTotal,10, RoundingMode.HALF_EVEN)).multiply(new BigDecimal(100));
			System.out.println("Percentual "+dados[0][i]+": "+percentual.setScale(2, RoundingMode.HALF_EVEN)+"%");
		}
	}
}
