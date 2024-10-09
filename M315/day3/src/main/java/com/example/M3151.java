// 1- Selecciona, crea o copia alguna bateria de tests que te permita probar el ordenamiento de ejecución de los tests, como @BeforeEach y @AfterEach por ejemplo


package com.example;

public class M3151 {
    public static void main(String[] args) {
        
        int resultadoMulti = multiplicar(10, 3);
        int resultadoDivi = dividir(4, 2);

        System.out.println("La multiplicación: " + resultadoMulti);
        System.out.println("La división: " + resultadoDivi);

    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }


}