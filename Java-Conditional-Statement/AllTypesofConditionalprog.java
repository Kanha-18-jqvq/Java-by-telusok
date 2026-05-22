// package Java-Conditional-Statement;

public class AllTypesofConditionalprog {
    public static void main(String[] args) {
        int a=90;
        int marks=70;
        int day=3;
        
        
        System.out.println("if conditional statement");
        if (a>78) {
            System.out.println("True");
        }


        System.out.println("if-else conditional statement");
        if (a<67) {
            System.out.println("a is grater");
        }else{
            System.out.println("a is less");
        }

        System.out.println("else-if conditional statement");
        // else-if ladder
        if(marks >= 90){
            System.out.println("Grade A");
        }
        else if(marks >= 60){
            System.out.println("Grade B");
        }
        else{
            System.out.println("Grade C");
        }

         System.out.println("Switch conditional statement");
           switch(day){

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid Day");
        }
        
    }
}
