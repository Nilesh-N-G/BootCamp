public class Armstrong {
    public static boolean isArmstrong(int n) {

        int temp = n;
        int sum = 0;
        int digits = Integer.toString(n).length();
        while (temp != 0) {
            int remainder = temp % 10;
            sum += Math.pow(remainder, digits);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(2));     
        System.out.println(isArmstrong(221));   
        System.out.println(isArmstrong(370));   
        System.out.println(isArmstrong(93084)); 
    }
}
