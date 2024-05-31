import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Calculadora De Conversión De Sistemas Numéricos:");

        while (true) {
            System.out.println();
            System.out.println("¿Desea realizar alguna operación?");
            System.out.println("1. Sí");
            System.out.println("2. No");
            System.out.print("Ingrese su opción: ");

            int operacion = scanner.nextInt();
            scanner.nextLine();

            if (operacion != 1) {
                System.out.println("Gracias por usar nuestra APP!!");
                break;
            }

            System.out.println();
            System.out.println("Seleccione una operación:");
            System.out.println("1. Número Decimal a Binario");
            System.out.println("2. Número Decimal a Octal");
            System.out.println("3. Número Decimal a Hexadecimal");
            System.out.println("4. Número Binario a Decimal");
            System.out.println("5. Número Binario a Octal");
            System.out.println("6. Número Binario a Hexadecimal");
            System.out.println("7. Número Octal a Decimal");
            System.out.println("8. Número Octal a Binario");
            System.out.println("9. Número Octal a Hexadecimal");
            System.out.println("10. Número Hexadecimal a Decimal");
            System.out.println("11. Número Hexadecimal a Binario");
            System.out.println("12. Número Hexadecimal a Octal");
            System.out.println("13. Salir");
            System.out.println();
            System.out.print("Ingrese el número de la operación que desea realizar: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                // Conversiones decimales
                case 1:
                    System.out.println();
                    System.out.print("Ingrese un número decimal: ");
                    int decimal = scanner.nextInt();
                    System.out.println("Número Binario: " + ConversionDeNumeros.decimal_Binario(decimal));
                    break;
                case 2:
                    System.out.println();
                    System.out.print("Ingrese un número decimal: ");
                    decimal = scanner.nextInt();
                    System.out.println("Número Octal: " + ConversionDeNumeros.decimal_Octal(decimal));
                    break;
                case 3:
                    System.out.println();
                    System.out.print("Ingrese un número decimal: ");
                    decimal = scanner.nextInt();
                    System.out.println("Número Hexadecimal: " + ConversionDeNumeros.decimal_Hexadecimal(decimal));
                    break;


                // Conversiones Binarias
                case 4:
                    System.out.println();
                    System.out.print("Ingrese un número binario: ");
                    String binario = scanner.nextLine();
                    System.out.println("Número Decimal: " + ConversionDeNumeros.binario_Decimal(binario));
                    break;
                case 5:
                    System.out.println();
                    System.out.print("Ingrese un número binario: ");
                    binario = scanner.nextLine();
                    System.out.println("Número Octal: " + ConversionDeNumeros.binario_Octal(binario));
                    break;
                case 6:
                    System.out.println();
                    System.out.print("Ingrese un número binario: ");
                    binario = scanner.nextLine();
                    System.out.println("Número Hexadecimal: " + ConversionDeNumeros.binario_Hexadecimal(binario));
                    break;


                // Conversiones Octales
                case 7:
                    System.out.println();
                    System.out.print("Ingrese un número octal: ");
                    String octal = scanner.nextLine();
                    System.out.println("Número Decimal: " + ConversionDeNumeros.octal_Decimal(octal));
                    break;
                case 8:
                    System.out.println();
                    System.out.print("Ingrese un número octal: ");
                    octal = scanner.nextLine();
                    System.out.println("Número Binario: " + ConversionDeNumeros.octal_Binario(octal));
                    break;
                case 9:
                    System.out.println();
                    System.out.print("Ingrese un número octal: ");
                    octal = scanner.nextLine();
                    System.out.println("Número Hexadecimal: " + ConversionDeNumeros.octal_Hexadecimal(octal));
                    break;


                // Conversiones hexadecimales
                case 10:
                    System.out.println();
                    System.out.print("Ingrese un número hexadecimal: ");
                    String hexadecimal = scanner.nextLine();
                    System.out.println("Número Decimal: " + ConversionDeNumeros.hexadecimal_Decimal(hexadecimal));
                    break;
                case 11:
                    System.out.println();
                    System.out.print("Ingrese un número hexadecimal: ");
                    hexadecimal = scanner.nextLine();
                    System.out.println("Número Binario: " + ConversionDeNumeros.hexadecimal_Binario(hexadecimal));
                    break;
                case 12:
                    System.out.println();
                    System.out.print("Ingrese un número hexadecimal: ");
                    hexadecimal = scanner.nextLine();
                    System.out.println("Número Octal: " + ConversionDeNumeros.hexadecimal_Octal(hexadecimal));
                    break;


                case 13:
                    System.out.println();
                    System.out.println("Saliendo....");
                    scanner.close();
                    return;
                default:
                    System.out.println();
                    System.out.println("Ingrese una opción válida. ");
                    break;
            }
        }
        scanner.close();
    }
}
