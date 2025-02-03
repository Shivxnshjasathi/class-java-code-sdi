
class emp {
    String name;
    int number;
    emp(String s, int n) {
        this.name = s;
        this.number = n;
    }
}
class objarr {
    public static void main(String[] arg) {
        emp[] employe = {
                new emp("Shivansh", 12),
                new emp("Aditya", 15)
        };
        for (int i = 0; i < employe.length; i++) {
            emp e=employe[i];
            System.out.println(String.format("Eid : %s,Ename : %s",e.name,e.number));
            
        }
        for (emp employee : employe) {
            System.out.println(employee);
        }
    }
}
