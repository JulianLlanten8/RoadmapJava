package Logica_De_La_Programacion;

import java.util.Scanner;

public class SIEsiguala10Contar {

    public static void main(String[] args) {
        int N1, N2;

        Scanner num = new Scanner(System.in);

        System.out.println("Ingrese El Primer Numero ");

        N1 = num.nextInt();

        System.out.println("Ingrese El Segundo Numero  ");

        N2 = num.nextInt();

        if (N1 > N2) {

            if (N1 - N2 <= 10) {
                N2 = N2 + 1;

                System.out.println(N2);

                if (N1 - N2 <= 10) {
                    N2 = N2 + 1;

                    System.out.println(N2);
                }

                if (N1 - N2 <= 10) {
                    N2 = N2 + 1;

                    System.out.println(N2);
                }

                if (N1 - N2 <= 10) {
                    N2 = N2 + 1;

                    System.out.println(N2);

                    if (N1 - N2 <= 10) {
                        N2 = N2 + 1;

                        System.out.println(N2);

                        if (N1 - N2 <= 10) {
                            N2 = N2 + 1;

                            System.out.println(N2);

                            if (N1 - N2 <= 10) {
                                N2 = N2 + 1;

                                System.out.println(N2);

                                if (N1 - N2 <= 10) {
                                    N2 = N2 + 1;

                                    System.out.println(N2);

                                    if (N1 - N2 <= 10) {
                                        N2 = N2 + 1;

                                        System.out.println(N2);

                                        if (N1 - N2 <= 10) {
                                            N2 = N2 + 1;

                                            System.out.println(" Los Numeros Del Numero " + N2 + " Al numero " + N1 + " Son ");

                                            System.out.println(N2);

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (N2 > N1) {

                System.out.println(" los numeros del numero " + N1 + " al numero " + N2 + " son ");

                if (N2 - N1 <= 10) {
                    N1 = N1 + 1;

                    System.out.println(N1);

                    if (N2 - N1 <= 10) {
                        N1 = N1 + 1;

                        System.out.println(N1);
                    }

                    if (N2 - N1 <= 10) {
                        N1 = N1 + 1;

                        System.out.println(N1);
                    }

                    if (N2 - N1 <= 10) {
                        N1 = N1 + 1;

                        System.out.println(N1);

                        if (N2 - N1 <= 10) {
                            N1 = N1 + 1;

                            System.out.println(N1);

                            if (N2 - N1 <= 10) {
                                N1 = N1 + 1;

                                System.out.println(N1);

                                if (N2 - N1 <= 10) {
                                    N1 = N1 + 1;

                                    System.out.println(N1);

                                    if (N2 - N1 <= 10) {
                                        N1 = N1 + 1;

                                        System.out.println(N1);

                                        if (N2 - N1 <= 10) {
                                            N1 = N1 + 1;

                                            System.out.println(N1);

                                            if (N2 - N1 <= 10) {
                                                N1 = N1 + 1;

                                                System.out.println(N1);

                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
