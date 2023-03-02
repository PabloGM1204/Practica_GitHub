<<<<<<<<<<< HEAD
public class S08Ejercicio56 {

  public static void main(String[] args) {
    hola();
    // Creo el arrayBidimensional
    int[][] a = {
      {20, 18, 10, 13, 70, 50},
      {80, 87, 60, 89, 75, 43},
      {32, 42, 69, 23, 31, 29},
      {99, 45, 94, 11, 18, 48}
    };
    // Funcion que muestra el array
    muestraArrayBiInt(a);

    System.out.print("\ncorteza: ");
    
    bucle(a);
  }
  // Metodo que muestra el resultado
  private static void bucle(int [][] n){
     for(int numero : corteza(n)){
        System.out.print(numero + " ");
    }
  }

  // Metodo que elimina el borde
  private static int[] corteza(int[][] n) {
    // Array ayudante
    int filas = n.length;
    // Creacion del array cogiendo la longitud
    int columnas = n[0].length;
    
    int[] resultado = new int[2 * filas + 2 * columnas - 4];
    
    int j = 0;
    
    // Fila superior
    for (int i = 0; i < columnas - 1; i++) {
      resultado[j++] = n[0][i];
    }
    
    // Columna derecha
    for (int i = 0; i < filas - 1; i++) {
      resultado[j++] = n[i][columnas - 1];
    }
    
    // Fila inferior
    for (int i = columnas - 1; i > 0; i--) {
      resultado[j++] = n[filas - 1][i];
    }
    
    // Columna izquierda
    for (int i = filas - 1; i > 0; i--) {
      resultado[j++] = n[i][0];
    }
    return resultado;
  }
  //Este método muestras arrays
  private static void muestraArrayBiInt(int x[][]) {
    // El tamaño de la columna será igual al tamaño del número máximo del array
    String formatoNumero = "%" + matematicas.Varias.digitos(maximoArrayBiInt(x)) + "d";
    // Este bucle recorre todo
    for (int f = 0; f < x.length; f++) {
      for (int c = 0; c < x[0].length; c++) {
        System.out.printf(formatoNumero + " ", x[f][c]);
      }
      System.out.println();
    }
  private static void hola(){
    System.out.print("Este es tu nuevo programa");
  }
  }
}

