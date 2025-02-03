class candd {

    candd(){
        System.out.println("Construtor");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is beign finalized");
    }

   
    static public void main(String []arg){
        candd obj = new candd();
        obj=null;
        System.gc();
    }
    
}
