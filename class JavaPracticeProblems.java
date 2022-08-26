import java.util.*;

class JavaPracticeProblems
{        
    public static void main(String[] args)
    {
        Random rand = new Random();                                //declare Random object that returns a random question from the list
        
        ArrayList<String> questions = new ArrayList<String>();     //declare arraylist to store questions

        String question1 = "QUESTION 1" + "\n Write a program called \"CheckPassFail\" which prints \"PASS\" if the int variable \"mark\" is more than or equal to 50 or prints \"FAIL\" otherwise " + "\n" + 
                            "The program shall always print \"DONE!\" before exiting. \n";
        String question2 = "QUESTION 2" + "\n Write a program called \"CheckOddEven\" which prints \"Odd Number\" if the int variable \"number\" is odd, or \"Even Number\" otherwise."  + "\n" +
                            "The program shall always print \"BYE!\" before exiting. \n";
        String question3 = "QUESTION 3" + "\n Write a program called \"PrintNumberInWord\" which prints \"ONE\", \"TWO\", \"...\" , \"NINE\", or \"OTHER\", if the int variable \"number\" is 1, 2,... , 9, or other, respectively. " + "\n" + 
                            "Use (a) a \"nested-if\" statement and (b) a \"switchcase\" statement. \n";  
        String question4 = "QUESTION 4" + "\n White a program that finds the minimum and maximum int element on an array. \n"; 
        String question5 = "QUESTION 5" + "\n Write a program to reverse a string (use iteration) \n";
        String question6 = "QUESTION 6" + "\n Write a program to reverse a string (use recursion) \n";
        String question7 = "QUESTION 7" + "\n Write a program that checks if a string is palindrome (use iterative method) \n";
        String question8 = "QUESTION 8" + "\n Write a fizz-buzz program (if a number in a range of numbers is multiple of 3 output \"fizz\", if multiple of 5 print \"buzz\", if multiple of 3 and 5 write \"fizz-buzz\"). \n";
        String question9 = "QUESTION 9" + "\n Write a method that prints Fibonacci Series. \n";
        String question10 = "QUESTION 10" + "\n Write a method that checks if a number is prime or not. \n";
        String question11 = "QUESTION 11" + "\n Write a method that swaps 2 numbers. \n";
        String question12 = "QUESTION 12" + "\n Write a method that swaps 2 numbers without using TEMP variable. \n";
        String question13 = "QUESTION 13" + "\n Write a method that reverses an array. \n";
        String question14 = "QUESTION 14" + "\n Write a method that reverses a number. \n";
        String question15 = "QUESTION 15" + "\n Write a program that calculates factorial of a number. \n";
        String question16 = "QUESTION 16" + "\n Write a program that prints the sums of digits of a number (Ex: SumDigits(443) = 11 ). \n";
        String question17 = "QUESTION 17" + "\n Write a program to sort map by value. \n";
        String question18 = "QUESTION 18" + "\n Write a program to find if a number is perfect or not. \n";
        String question19 = "QUESTION 19" + "\n Write an implementation of buble sort. \n";
        String question20 = "QUESTION 20" + "\n Write program to check if a number is binary or not. \n";
        String question21 = "QUESTION 21" + "\n Write program to find armstrong number. \n";
        String question22 = "QUESTION 22" + "\n Write program to find armstrong number. \n";
        String question23 = "QUESTION 23" + "\n Write program to find common elements in 2 arrays. \n";
        String question24 = "QUESTION 24" + "\n Write program to check if 2 strings are anagram or not. \n";
        String question25 = "QUESTION 25" + "\n Write implementation of a deadlock between 2 threads in Java. \n";
        String question26 = "QUESTION 26" + "\n Write a program that finds the factors of a number from 1-100. \n";
        String question27 = "QUESTION 27" + "\n Write a program that finds the 2nd largest element on an array. \n";
        String question28 = "QUESTION 28" + "\n Write a program to find duplicate number in an array. \n";
        String question29 = "QUESTION 29" + "\n Write a program to find duplicate string in an array. \n";
        String question30 = "QUESTION 30" + "\n Write a program to remove duplicate string in an array. \n";
        String question31 = "QUESTION 31" + "\n Write a program to count the vowels in a string. \n";
        String question32 = "QUESTION 32" + "\n Write a program that prints Floyds triangle. \n";
        String question33 = "QUESTION 33" + "\n Write implementation of binary search of a number. \n";

        //add questions to arraylist
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        questions.add(question6);
        questions.add(question7);
        questions.add(question8);
        questions.add(question9);
        questions.add(question10);
        questions.add(question11);
        questions.add(question12);
        questions.add(question13);
        questions.add(question14);
        questions.add(question15);
        questions.add(question16);
        questions.add(question17);
        questions.add(question18);
        questions.add(question19);
        questions.add(question20);
        questions.add(question21);
        questions.add(question22);
        questions.add(question23);
        questions.add(question24);
        questions.add(question25);
        questions.add(question26);
        questions.add(question27);
        questions.add(question28);
        questions.add(question29);
        questions.add(question30);
        questions.add(question31);
        questions.add(question32);
        questions.add(question33);

        //# of questions
        System.out.println("Number of Questions: " +questions.size());

        //shuffle the list of questions
        Collections.shuffle(questions);

        //return shuffled array list of questions
        //System.out.println("The list: \n" + questions);

        //declare arryaylist iterator
        //Iterator<String> iterator = questions.iterator();

        //return shuffled ITERATED array list of questions (note the output compared w/out using iterator)
        // while(iterator.hasNext())
        // {
        //     System.out.println(iterator.next() + " ");
        // }

        //declare a random index
        int index = rand.nextInt(questions.size());

        //return random question
        System.out.println(questions.get(index));
        


    }

}