import java.util.Scanner;

public class validemail {

        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Email ID : ");
        String gmail = sc.nextLine();
        if(gmail.endsWith(".com"))
        {
            String userid = gmail.substring(0, gmail.indexOf("@"));
            String domain=gmail.substring(gmail.indexOf("@")+1,gmail.length()-4);
            System.out.println(isvaliduserid(userid) && isvaliduserdomain(domain));
        }
        else
        {
            System.out.println(false);
        }

        
        
    }

    public static boolean isvaliduserdomain(String domain) 
    {

        for (int i = 0; i < domain.length(); i++) 
        {

            if (!Character.isLetterOrDigit(domain.charAt(i)) || Character.isWhitespace(domain.charAt(i)) || domain.length() == 0  || Character.isUpperCase(domain.charAt(i)) || Character.isDigit(domain.charAt(i)))
            {
                return false;
            }
            
        }


        return true;

    }

    public static boolean isvaliduserid(String userid) 
    {
        if (userid.length() < 5 || userid.length() >20 || userid.length() == 0 || Character.isDigit(userid.charAt(0))) 
        {
            return false;
        }


        for (int i = 0; i < userid.length(); i++) 
        {

            if ((!Character.isLetterOrDigit(userid.charAt(i)) && userid.charAt(i) != '_' ) || Character.isWhitespace(userid.charAt(i))) 
            {
                return false;
            }
            
        }


        return true;
    }
    
}
