using System;

class PClass {
    public int i = 100;
    public virtual void show(){
        Console.WriteLine("hello P");
    }
}

class CClass : PClass {
    public new int i = 200; 
    public override void show(){
        Console.WriteLine("hello C");
    }
}

public class HelloWorld
{
    public static void Main(string[] args)
    {
        PClass pobj = new CClass();
        pobj.show();
        Console.WriteLine(pobj.i); 
    }
}
