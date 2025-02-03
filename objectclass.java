import java.util.Objects;

class Employee {
    int eid;
    String ename;
    Employee(int id , String name){
        eid = id;
        ename = name;
    }
    @Override
    public String toString(){
        return "Emp :" + ename + "id is" + eid;
    }
    
    public boolean equals(Object obj){
        if (this == obj) {return true;}
        if (obj == null || getClass() != obj.getClass()){ return false;}
        Employee e = (Employee) obj;
        return String.valueOf(this.eid).equals(String.valueOf(this.eid)) && this.ename.equals(e.ename);

    }

    public int hashCode(){
        return Objects.hash(eid,ename);
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

class test {
    public static void main(String []arg) throws CloneNotSupportedException {
        Employee e1 = new Employee(1, "Shivansh");
        Employee e2 = new Employee(2, "Prabin");
        Employee e3 = (Employee)e1.clone();
        System.out.println(e3);
        System.out.println(e1.toString());
        System.out.println(e1.equals(e2));
        System.out.println(e1.hashCode());
    }
}
