public class ConversionDeNumeros {

    // Conversion de Numero decimal a otros sistemas Numericos
    public static String decimal_Binario(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static String decimal_Octal(int decimal){
        return Integer.toOctalString(decimal);
    }

    public static String decimal_Hexadecimal(int decimal){
        return Integer.toHexString(decimal);
    }


    // Conversion de Numero binario a otros Sistemas Numericos
    public static int binario_Decimal(String binario){
        return Integer.parseInt(binario,2);
    }

    public static String binario_Octal(String binario) {
        int decimal = binario_Decimal(binario);
        return decimal_Octal(decimal);
    }

    public static String binario_Hexadecimal(String binario) {
        int decimal = binario_Decimal(binario);
        return decimal_Hexadecimal(decimal);
    }


    // Conversion de Numero octal a otros Sistemas Numericos
    public static int octal_Decimal(String octal){
        return Integer.parseInt(octal,8);
    }

    public static String octal_Binario(String octal){
        int decimal = octal_Decimal(octal);
        return decimal_Binario(decimal);
    }

    public static String octal_Hexadecimal(String octal){
        int decimal = octal_Decimal(octal);
        return decimal_Hexadecimal(decimal);
    }


    // Conversion de Numero hexadecimal a otros Sistemas Numericos
    public static int hexadecimal_Decimal(String hexadecimal){
        return Integer.parseInt(hexadecimal,16);
    }

    public static String hexadecimal_Binario(String hexadecimal){
        int decimal = hexadecimal_Decimal(hexadecimal);
        return decimal_Binario(decimal);
    }

    public static String hexadecimal_Octal(String hexadecimal){
        int decimal = hexadecimal_Decimal(hexadecimal);
        return decimal_Octal(decimal);
    }
}





