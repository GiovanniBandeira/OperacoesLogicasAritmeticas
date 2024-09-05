package Matriz;

public class Main {
    public static void main(String[] args) {

        int[][] z = new int[6][6];

        int[][] x = {
            {46, 227, 180, 24, 115, 186},
            {147, 77, 71, 36, 85, 60},
            {122, 47, 70, 172, 116, 182},
            {139, 207, 146, 97, 26, 195},
            {86, 175, 72, 164, 59, 92},
            {16, 62, 141, 208, 102, 105}
        };

        int[][] y = {
                {118, 136, 69, 183, 110, 135},
                {46, 227, 180, 251, 167, 62},
                {46, 209, 185, 143, 231, 153},
                {467, 26, 70, 68, 152, 184},
                {76, 170, 32, 64, 180, 68},
                {197, 150, 69, 167, 69, 113}
        };

        System.out.print("Operação que ignora o overflow:\n");
        for (int w = 0; w < x.length; w++){
            System.out.print("\n");
            for (int h = 0; h < x.length; h++){
                z[w][h] = x[w][h] + y[w][h];
                System.out.printf("%d, ", z[w][h]);
            }
        }

        System.out.print("\n\nOperação que ajusta os valores acima de 255:\n");
        for (int w = 0; w < x.length; w++){
            System.out.print("\n");
            for (int h = 0; h < x.length; h++){
                z[w][h] = x[w][h] + y[w][h];
                if (z[w][h] > 255){
                    z[w][h] = 255;
                    System.out.printf("%d, ", z[w][h]);
                }else {
                    System.out.printf("%d, ", z[w][h]);
                }
            }
        }

        System.out.print("\n\nOperação que ajusta os valores acima de 255:\n");
        for (int w = 0; w < x.length; w++){
            System.out.print("\n");
            for (int h = 0; h < x.length; h++){
                z[w][h] = x[w][h] + y[w][h];
                z[w][h] = (int) Math.round(((z[w][h] - 99) * 0.91));
                System.out.printf("%d, ", z[w][h]);
            }
        }
    }
}