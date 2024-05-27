public class powerof2 {
    public static boolean ispoweroftwo(int n) {
        int power = 2;

        while (power<=n) {

            if(n == power){
                return true;
            }
            
            power = power * 2;
            
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(ispoweroftwo(2)); 
        System.out.println(ispoweroftwo(20)); 
        System.out.println(ispoweroftwo(32)); 
        System.out.println(ispoweroftwo(84)); 
    }
}
