package almacenPago;

class AlmacenPago {
	public static double[] calcularInversionAnual(double monto, double interesAnual, int anios) {
		double interesMensual = interesAnual / 12;
		double saldosAnuales[] = new double[anios]; // array que guarda el monto total mes a mes
		double saldosMensuales[] = new double[anios * 12]; // array que guarda el monto año a año
		double dineroAcumuladoTotal = monto;

		// itero saldosMensuales y voy guardando las ganancias correspondiente a cada
		// mes
		for (int i = 0; i < saldosMensuales.length; i++) {
			saldosMensuales[i] = dineroAcumuladoTotal * (1 + interesMensual);
			dineroAcumuladoTotal *= (1 + interesMensual);
		}

		// itero saldosAnuales y voy guardando el valor correspondiente al doceavo mes
		// de saldosMensuales
		for (int i = 0; i < saldosAnuales.length; i++) {
			saldosAnuales[i] = saldosMensuales[(i + 1) * 12 - 1];
			System.out.println(saldosAnuales[i]);
		}
		return saldosAnuales;

	}

	public static int calcularTiempoInversion(double monto, double interesAnual, double montoMinimo) {
		double interesMensual = interesAnual / 12;
		int meses = 0;
		double dineroAcumuladoTotal = monto;

		while (dineroAcumuladoTotal < montoMinimo) {
			dineroAcumuladoTotal = dineroAcumuladoTotal * (1 + interesMensual);
			meses++;
		}
		return meses;
	}

}
