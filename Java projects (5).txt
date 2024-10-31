class james {
    public int eee = 0;
    void talk() {
        System.out.println("hi");
    }
    void e() {
        if(eee == 1){
            System.out.println("n");
        } else{
            System.out.println("m");
        }
        }
    }
    
    public class test {
        public static void main(String[] args) {
        String[] james = new String[3];
        james[1] = "hi";
        System.out.println(james[1]);
        james[2] = james[0];
        System.out.print(james[2]); 
        james[0].eee = 1;
    }
}