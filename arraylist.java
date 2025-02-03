import java.util.*;


class arraylist {
    public static void main (String [] args){
        ArrayList <Integer> number = new ArrayList<>();
        number.add(10);
        number.add(10);
        number.add(10);
        number.add(10);
        Iterator i = number.iterator();
        while (i.hasNext()){
            System.out.println(i.next()); 
        }
        System.out.println(number.get(2));

    }
}
