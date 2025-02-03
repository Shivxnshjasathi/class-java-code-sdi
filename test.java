class test{
    public static void main(String []arg){
        int i = 20;
        String bin = Integer.toBinaryString(i);
        System.out.println("Decimal: " + i + " -> Binary: " + bin);
        int decimal = Integer.parseInt(bin, 2);
        System.out.println("Binary: " + bin + " -> decimal: " + decimal);
        String octal = Integer.toOctalString(i); 
        System.out.println("Decimal: " + i + " -> Octal: " + octal);
        int decimal2 = Integer.parseInt(octal, 8);
        System.out.println("octal: " + octal + " -> decimal: " + decimal2);
        String hex = Integer.toHexString(i); 
        System.out.println("Decimal: " + i + " -> hex: " + hex);
        int decimal3 = Integer.parseInt(hex, 16);
        System.out.println("hex: " + hex + " -> decimal: " + decimal3);

        // float f = 20.5f;
        // Integer k = floatToIntBits(f);
        // String s = Integer.toBinaryString(k);
        // System.out.println(s); 
    }
}