//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String name = args[0];
            name = name.toUpperCase();
            int lenght = name.length();
            int num = Integer.parseInt(args[1]);
            String anLettrs = "AEFHILMNORSX";
            for(int i = 0; i < lenght ;i++){
                if (anLettrs.indexOf(name.charAt(i)) != -1) {
                        System.out.println("Give me an " + name.charAt(i) + ": " +name.charAt(i) + "!");
                }else{
                        System.out.println("Give me a  " + name.charAt(i) + ": " +name.charAt(i) + "!");
                }
            }
            System.out.println("What does that spell?");
            for(int i = 0 ; i < num ; i++){
                System.out.println(name + "!!!");
            }
        }
}
