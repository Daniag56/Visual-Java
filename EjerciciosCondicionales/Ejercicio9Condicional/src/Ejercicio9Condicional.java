import java.util.Scanner;

public class Ejercicio9Condicional {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);


        int dia, mes;
        System.out.print("Introduzca el mes: ");
        mes = sc.nextInt();
        System.out.print("Introduzca el dia: ");
        dia = sc.nextInt();


        if ((mes == 1) && (dia < 31) && (dia > 1)) {
            System.out.println("El mes es Enero y su signo es acuario");
        } else {
            if ((mes == 2) && (dia < 28) && (dia > 1)) {
                System.out.println("El mes es febrero y su signo es Piscis");
            } else {
                if ((mes == 3) && (dia < 31) && (dia > 1)) {
                    System.out.println("El mes es marzo y su signo es Piscis");
                } else {
                    if ((mes == 4) && (dia < 30) && (dia > 1)) {
                        System.out.println("El mes es abril y su signo es Tauro");
                    } else {
                        if ((mes == 5) && (dia < 31) && (dia > 1)) {
                            System.out.println("El mes es mayo y su signo es Tauro");
                        } else {
                            if ((mes == 6) && (dia < 30) && (dia > 1)) {
                                System.out.println("El mes es junio y su signo es Cancer");
                            } else {
                                if ((mes == 7) && (dia < 31) && (dia > 1)) {
                                    System.out.println("El mes es julio y su signo es cancer");
                                }else{
                                    if ((mes == 8) && (dia < 31) && (dia > 1)) {
                                        System.out.println("El mes es Agosto y su signo es leo");
                                    }else{
                                        if ((mes == 9) && (dia < 31) && (dia > 1)) {
                                            System.out.println("El mes es Septiembre y su signo es Virgo");
                                        }else{
                                            if ((mes == 10) && (dia < 31) && (dia > 1)) {
                                                System.out.println("El mes es Octubre y su signo es Libra");
                                            }else{
                                                if ((mes == 11) && (dia < 31) && (dia > 1)) {
                                                    System.out.println("El mes es Noviembre y su signo es Escorpio");
                                                }else{
                                                    if ((mes == 12) && (dia < 31) && (dia > 1)) {
                                                        System.out.println("El mes es Diciembre y su signo es sagitario");
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
    }
}

 
