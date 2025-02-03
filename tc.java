class tc{
    public static void main (String []arg){
        byte a =20;
        byte b= 30;
        byte c = (byte)(a+b);
        System.out.println(c);

        short s =300;
        byte k = (byte)s; // only take the value of right side data as 1 byte
        System.out.println(k);

        int i = 20; // impixit conversion
        float f = i;
        System.out.println(i);
    }
}