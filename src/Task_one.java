import java.util.Scanner;

public class Task_one {

    public static void main(String[] args) {

                // Task2  I study Basic Java!
                Scanner scan = new Scanner(System.in);
                System.out.println("Write the phrase");
                String thePhrase = scan.nextLine();
                //iStudyBasicJava(thePhrase);


               // Task22
                System.out.println("Your phrase is "+thePhrase);
                int lengthThePhrase = thePhrase.length()-1;
                System.out.println("The length of the Phrase-1="+lengthThePhrase);
                int theLastLetter = thePhrase.charAt(lengthThePhrase);
                System.out.println("The last letter is "+ theLastLetter);
                //дает код 33 из ASCII для ! не осилил
                String aA = "Java";
                System.out.println(thePhrase.contains(aA));
                System.out.println(thePhrase.replace("a", "o"));
                System.out.println(thePhrase.toUpperCase());
                System.out.println(thePhrase.toLowerCase());
                String allExeptJava = thePhrase.replaceAll("Java", "");
                System.out.println(allExeptJava);


                //System.out.println(thePhrase.substring(wJava, wJava+4);

            }//public static void iStudyBasicJava


        }



