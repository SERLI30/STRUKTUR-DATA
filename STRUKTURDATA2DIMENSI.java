
package struktur.data.pkg2dimensi;

public class STRUKTURDATA2DIMENSI {

    public static void main(String[] args) {
        System.out.println("array 2 dimensi integer");
        int[][] arraya = new int[3][3];
        arraya[0][0] = 1;
        arraya[0][1] = 2;
        arraya[0][2] = 3;
        arraya[1][0] = 4;
        arraya[1][1] = 5;
        arraya[1][2] = 6;
        arraya[2][0] = 7;
        arraya[2][1] = 8;
        arraya[2][2] = 9;
        for (int i = 0; i < arraya.length; i++) {
            for (int j = 0; j < arraya[i].length; j++) {
                System.out.println(arraya[i][j]);

            }
            System.out.println("array 2 dimensi char");
            char[][] chara = {{'S', 'E', 'R'}, {'L', 'I', 'I'}};
            for (char[] nilai : chara) {
                for (char nilaia : nilai) {
                    System.out.println(nilaia);
                }
                System.out.println();

            }
            System.out.println("array 2 dimensi double");
            double[][] doublea = {{1.2, 8.5}, {3.6, 4.5}, {28.0, 30.0}};
            for (double[] nilaia : doublea) {
                for (double nilai : nilaia) {
                    System.out.println(nilai);

                }
                System.out.println();
            }
            System.out.println("array 2 dimensi long");
            long[][] longa = {{5678, 8907, 7860}, {5678, 8907, 7860}, {5678, 8907, 7860}};
            for (int j = 0; j < longa.length; j++) {
                for (int k = 0; k < longa.length; k++) {
                    System.out.println(longa[j][k]);

                }
                System.out.println("array 2 dimensi short");
                short[][] shorta = new short[2][2];
                shorta[0][0] = 1;
                shorta[0][1] = 2;
                shorta[1][0] = 3;
                shorta[1][1] = 4;
                for (int k = 0; k < shorta.length; k++) {
                    for (int l = 0; l < shorta[i].length; l++) {
                        System.out.println(l + shorta[i][j]);

                    }
                    System.out.println("array 2 dimensi float");
                    float[][] floata = {{10.897f, 1.345f}, {34.567f, 8.76f}, {4.56f, 8.65f}};
                    for (float[] b : floata) {
                        for (float c : b) {
                            System.out.println(c);

                        }
                        System.out.println("array 2 dimensi byte");
                        byte[][] bytea = new byte[2][2];
                        bytea[0][0] = 2;
                        bytea[0][1] = 3;
                        bytea[1][0] = 4;
                        bytea[1][1] = 3;
                        for (int l = 0; l < bytea.length; l++) {
                            for (int m = 0; m < bytea[i].length; m++) {
                                System.out.println(l + bytea[l][m]);

                            }
                            System.out.println("array 2 dimensi boolean");
                            boolean[][] booleana = new boolean[2][2];
                            booleana[0][0] = true;
                            booleana[0][1] = false;
                            booleana[1][0] = true;
                            booleana[1][1] = false;
                            for (boolean[] n : booleana) {
                                for (boolean m : n) {
                                    System.out.println(m);

                                }

                            }
                        }

                    }

                }

            }
        }
    }

}
