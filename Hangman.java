package hangman;
import java.util.Random;
import java.util.Scanner;

public class Hangman
{
    
    
    
       // explode method  
       public static char[] explode(String word) {
       char [] letters = new char[word.length()];
       int p;
       for (p = 0; p < word.length(); p++)
       {
            letters[p] = word.charAt(p);
            
       } 
            return letters;
            
       }
       
       
       public static int errors = 0;
       
       
       // method to create and display an array of blanks for the word being guessed
       public static char[] blanks(char[] letters) {
       char [] blank = new char[letters.length];
       int g;
       for (g = 0; g < letters.length; g++)
       {
           blank[g] = '_';
           System.out.print(blank[g]+ " ");
       }
           return blank;
       }
       
       
       
      
       // method for checking if the guessed letter is in the word
       public static boolean check(char in, char [] letters, char[] blank) {
       int c; 
       boolean wasRight;
       wasRight = false;
       for (c = 0; c < letters.length; c++)
       {
        if (letters[c] == in)        
       {
           blank[c] = in;
           wasRight = true;
       }
       
       }
           return wasRight; 

       }
       
       
       
       
       
       
       
       // method for taking the guessed letter out of the alphabet array
       public static void alphaCheck(char in, char [] letters, char [] alphabet) {
           int a;
           char r;
           r = '_';
           for (a= 0 ; a < alphabet.length; a++) {
               if (alphabet[a] == in)
               {
                   alphabet[a] = r; 
               }
               
           }
       }
       
       
       
       // methods for displaying gallow and dead body parts 
        public static void Start()
    {
        System.out.println("      _______   ");
        System.out.println("     |      |");
        System.out.println("     |");
        System.out.println("     |");
        System.out.println("     |");
        System.out.println("     |");
        System.out.println("     |");

    }
        
        
        
        
        
         public static void error1()
    {
        System.out.println("      _______   ");
        System.out.println("     |      |");
        System.out.println("     |      O");
        System.out.println("     |");
        System.out.println("     |");
        System.out.println("     |");
        System.out.println("     |");

    }
        
         
         
         public static void error2()
    {
        System.out.println("      _______   ");
        System.out.println("     |      |");
        System.out.println("     |      O");
        System.out.println("     |      |");
        System.out.println("     |");
        System.out.println("     |");
        System.out.println("     |");

    }
         
         
         
       public static void error3()
    {
        System.out.println("      _______   ");
        System.out.println("     |      |");
        System.out.println("     |      O");
        System.out.println("     |    / |");
        System.out.println("     |");
        System.out.println("     |");
        System.out.println("     |");

    }    
       
       
         public static void error4()
    {
        System.out.println("      _______   ");
        System.out.println("     |      |");
        System.out.println("     |      O");
        System.out.println("     |    / | \\");
        System.out.println("     |");
        System.out.println("     |");
        System.out.println("     |");

    }     
         
          public static void error5()
    {
        System.out.println("      _______   ");
        System.out.println("     |      |");
        System.out.println("     |      O");
        System.out.println("     |    / | \\");
        System.out.println("     |      |");
        System.out.println("     |");
        System.out.println("     |");

    }     
         
          
          public static void error6()
    {
        System.out.println("      _______   ");
        System.out.println("     |      |");
        System.out.println("     |      O");
        System.out.println("     |    / | \\");
        System.out.println("     |      |");
        System.out.println("     |     /");
        System.out.println("     |");

    }     
          
          
          
           public static void error7()
    {
        System.out.println("      _______   ");
        System.out.println("     |      |");
        System.out.println("     |      O");
        System.out.println("     |    / | \\");
        System.out.println("     |      |");
        System.out.println("     |     / \\");
        System.out.println("     |");

    }     
  
       
          

       
    public static void main(String[] args)
    {
        
        // read user input using scanner
        Scanner input;
        input = new Scanner(System.in);
        char in;
        
       // create word list and alphabet array
       String[] wordlist = {"javascript", "declaration", "object", "class", "failing"};
       char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
       String word;
       
       // get random word from wordlist array for user to guess
       word = wordlist[new Random().nextInt(wordlist.length)];
       int length;
       length = word.length();
       
       // Display starting gallows and alphabet to the user
        Start();
        
       System.out.println(" ");
       System.out.println(alphabet);
       System.out.println(" ");
       
       // run blanks and explode method on the random word selected from wordList
       char[] letters = explode(word);
       char[] blank = blanks(letters);
       System.out.println(" ");

       // Set up my while loop
       boolean isSolved;
       isSolved = false;
       boolean deadMan;
       deadMan = false; 
       
       while (!isSolved && !deadMan)
       {
        System.out.println(" ");   
        System.out.println("Enter a letter you'd like to guess:");
        // assign guess to variable g 
        in = input.next().charAt(0);

        boolean wasRight;
        wasRight = check(in, letters, blank);
        alphaCheck(in, letters, alphabet);
        
        if (wasRight == false){
            errors++;
        }
        
            switch (errors)
            {
                case 0:
                    System.out.println(" ");
                    Start();
                    System.out.println(" ");
                    break;
                case 1:
                    System.out.println(" ");
                    error1();
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println(" ");
                    error2();
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println(" ");
                    error3();
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println(" ");
                    error4();
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.println(" ");
                    error5();
                    System.out.println(" ");
                    break;
                case 6:
                    System.out.println(" ");
                    error6();
                    System.out.println(" ");
                    break;
                case 7:
                    System.out.println(" ");
                    error7();
                    System.out.println(" ");
                    break;
                default:
                    break;
            }
            
            if (wasRight){
                System.out.println("good job, that was a correct guess!");
            }    
            else 
                System.out.println("sorry, that was not a correct guess.");
            
            
        System.out.println(" ");
        System.out.println(blank);
        System.out.println(" ");
        System.out.println(alphabet);
        System.out.println(" ");
        
        int cg;
        boolean contains;
        contains = false;
        
        for (cg = 0; cg < blank.length; cg++){
            if (blank[cg] == '_'){
                contains = true;
                break;       
            }
        }
        
        if(contains == false){
            isSolved = true;
             System.out.println("YOU WIN!");
        }
        
        if (errors == 7){
            deadMan = true;
            System.out.println("YOU LOSE! The correct word is displayed: ");
            System.out.println(word);
        }
           
           }
           
       }

    }




    

       
       


    
       

    
    
          

           
                
       
       
    

