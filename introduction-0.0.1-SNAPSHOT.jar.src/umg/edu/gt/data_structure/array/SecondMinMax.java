package umg.edu.gt.data_structure.array;

public class SecondMinMax {

    public static void findSecondMinMax(int[] arr) {
        int mayor = Integer.MIN_VALUE;
        int segundoMayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int segundoMenor = Integer.MAX_VALUE;

        for (int x : arr) {

            if (x > mayor) {
                segundoMayor = mayor;
                mayor = x;
            } else if (x > segundoMayor && x != mayor) {
                segundoMayor = x;
            }

            if (x < menor) {
                segundoMenor = menor;
                menor = x;
            } else if (x < segundoMenor && x != menor) {
                segundoMenor = x;
            }
        }

        System.out.println("Segundo mayor: " + segundoMayor);
        System.out.println("Segundo menor: " + segundoMenor);
    }
}