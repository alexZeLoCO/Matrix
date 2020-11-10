
public class Matrix {

	public static void main(String[] args) {

		int [] [] matriz = new int [4][6];		
		//TIPO [] [] NOMBRE = NEW TIPO [A][B] | A FILAS B COLUMNAS

		int [] [] m = { { 1,2,3,4},		//CREA UNA MATRIZ DE VECTORES - FILA 1
				{ 1,2,3,4},			//FILA 2
				{ 1,2,3,4},			//FILA 3
				{ 1,2,3,4}			//FILA 4
		};
		//UNA MATRIZ SE ALMACENA COMO 'UN VECTOR DE VECTORES'. UN VECTOR ALMACENA VECTORES, CADA UNO DE LOS VECTORES ALMACENADOS ES UNA FILA. EL VECTOR MAYOR ES LA MATRIZ.

		System.out.println(m[2][3]);		//IMPRIMIR VALOR EN POSICIÓN 2,3
		
		for (int i=0;i<=3;i++) {		//PARA 3 VECES
			System.out.print(m[3][i]);		//IMPRIMIR VALOR {UNA FILA COMPLETA}
		}	
		
		System.out.println();		//SALTO DE LÍNEA
		
		System.out.printf("La matriz tiene un tamaño de: %dx%d.",m.length,m[1].length);		//TAMAÑO DE MATRIZ
															//FILAS		//COLUMNAS
		
		int [] [] m2 = { {4,3,2,1},			//FILA 1
				{3,4,2,1},			//FILA 2
				{2,3,4,1},			//FILA 3
				{1,2,3,4} };		//FILA 4

		System.out.println("La matriz suma es: ");
		int [] [] msuma = new int [m.length][m2[1].length];		//CREA MATRIZ SUMA

		for (int i=0;i<msuma.length;i++) {		//PARA TANTAS VECES COMO FILAS HAYA
			for (int j=0;j<msuma[i].length;j++) {		//TANTAS VEES COMO COLUMNAS HAYA
				msuma[i][j] = m[i][j]+m2[i][j];		//SUMAR POSICIONES DE MATRICES
			}
		}
		for (int i=0;i<msuma.length;i++) {		//PARA CADA FILA
			for (int j=0;j<msuma[1].length;j++) {		//PARA CADA COLUMNA
				System.out.print(msuma[i][j]);		//IMPRIMIR VALOR EN POSICIÓN
			}
			System.out.println();		//SALTO DE LÍNEA
		}
	}
}

