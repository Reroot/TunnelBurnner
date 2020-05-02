package DropBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


/**
 * => count vowels and consonants in String,
 * => iterate ArrayList using for-loop, while-loop, and advance for-loop.
 * => find the duplicate characters in a string.
 * => check Armstrong number.
 * => remove all white spaces from a string without using replace()
 * => print Fibonacci Series using Recursion.
 * => iterate HashMap using While and advance for loop
 * => count the number of words in a string using HashMap
 *
 * @author Durgasankar Mishra
 * @version 1.8
 * @created 2020-03-31
 */
public class BasicStringQuestions {

    private void countVowelsConsonantsWhiteSpacesInString(String inputString) {
        int vowels = 0, consonants = 0, whiteSpaces = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char fetchedCharacter = inputString.toLowerCase().charAt(i);
            if (fetchedCharacter == 'a' || fetchedCharacter == 'e' || fetchedCharacter == 'i'
                    || fetchedCharacter == 'o' || fetchedCharacter == 'u')
                vowels++;
            else if ((fetchedCharacter >= 'a' && fetchedCharacter <= 'z'))
                consonants++;
            else if (fetchedCharacter == ' ')
                whiteSpaces++;
        }
        System.out.println("Total vowels count : " + vowels + ", Consonants count : "
                + consonants + ", Blank spaces : " + whiteSpaces);
    }

    private void iterateUsingForLoop(List<Person> personList) {
        List<String> forLoopPersonList = new ArrayList<>(personList.size());
        List<String> advancedLoopPersonList = new ArrayList<>(personList.size());
        List<String> whileLoopPersonList = new ArrayList<>(personList.size());

        System.out.println("Adding all names to for loop...");
        for (int index = 0; index < personList.size(); index++) {
            forLoopPersonList.add(personList.get(index).getName());
        }
        System.out.println("Adding all names to advanced for loop...");
        for (Person fetchedPerson : personList) {
            advancedLoopPersonList.add(fetchedPerson.getName());
        }
        System.out.println("Adding all names to while loop...");
        int counter = 0;
        while (personList.size() > counter) {
            whileLoopPersonList.add(personList.get(counter).getName());
            counter++;
        }
        System.out.println("Printing all names : ");
        System.out.println("For loop all names : " + forLoopPersonList.toString());
        System.out.println("Advanced for loop all names : " + advancedLoopPersonList.toString());
        System.out.println("While loop all names : " + whileLoopPersonList.toString());
    }

    private void printDuplicateCharactersInString(String inputString) {
        int counter = 0;
        char[] chars = inputString.toCharArray();
        for (int i = 0; i < inputString.length(); i++) {
            for (int j = i + 1; j < inputString.length(); j++) {
                if (chars[i] == chars[j]) {
                    System.out.print(chars[j] + ", ");
                    counter++;
                    break;
                }
            }
        }
        System.out.println("\nTotal duplicates : " + counter);
    }

    private boolean isArmStrongNumber(int inputNumber) {
        int transferredNumber, tempValue, total = 0;
        transferredNumber = inputNumber;
        while (transferredNumber != 0) {
            tempValue = transferredNumber % 10;
            total += tempValue * tempValue * tempValue;
            transferredNumber /= 10;
        }
        return total == inputNumber;
    }

    private String replaceAllSpaces(String inputString) {
        char[] chars = inputString.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] != ' ') && (chars[i] != '\t')) {
                stringBuffer.append(chars[i]);
            }
        }
        return stringBuffer.toString();
    }

    public int fibonacciRecursion(int number) {
        if (number == 0)
            return 0;
        if (number == 1 || number == 2)
            return 1;
        return fibonacciRecursion(number - 2) + fibonacciRecursion(number - 1);
    }

    public void countNumberOfWordsInStringUsingHashMap(String inputString) {
        String[] words = inputString.split(" ");
        Map<String, Integer> wordsMap = new HashMap<>();
//        Adding data to set
        for (String word : words) {
            String fetchedWord = word.toLowerCase();
            if (wordsMap.containsKey(fetchedWord)) {
                int count = wordsMap.get(fetchedWord);
                wordsMap.put(fetchedWord, count + 1);
            } else {
                wordsMap.put(fetchedWord, 1);
            }
        }
//        displaying data and count.
        Set<String> keys = wordsMap.keySet(); // list of unique words because it's a Set
        TreeSet<String> sortedKeys = new TreeSet<>(keys); // ascending order of words
        for (String value : sortedKeys) {
            System.out.println(" Word : " + value + " & its count = " + wordsMap.get(value));
        }

    }

    public static void main(String[] args) throws IOException {
        BasicStringQuestions questions = new BasicStringQuestions();
        System.out.println("count vowels and consonants in String -> ");
        questions.countVowelsConsonantsWhiteSpacesInString("Hy this is counting practise lets test.");

        System.out.println("Iterate ArrayList using for-loop, while-loop, and advance for-loop : ");
        List<Person> personList = Arrays.asList(new Person(10, "Ramesh", "IN", "Karnataka"),
                new Person(30, "Durgasankar", "IN", "Goa"),
                new Person(20, "John", "USA", "New York"),
                new Person(55, "Mic", "USA", "Chicago"),
                new Person(20, "Stanley", "USA", "Alaska"),
                new Person(50, "Jack", "AUS", "Sydney"),
                new Person(40, "Chang", "CHI", "Wuhan"));
        questions.iterateUsingForLoop(personList);

        System.out.println("The duplicate characters in a string : ");
        //questions.printDuplicateCharactersInString("Duplicate characters in a string");

        System.out.println("Please Enter a number for checking Armstrong : ");
        //System.out.println("result : " + questions.isArmStrongNumber(Util.scanner.nextInt()));

        System.out.println("Please enter a String to remove space : ");
        System.out.println("Processed String : "
                + questions.replaceAllSpaces(new BufferedReader(new InputStreamReader(System.in)).readLine()));


        System.out.println("Enter the number of terns in fibonacci series : ");
        //int terms = Util.scanner.nextInt();
		/*
		 * System.out.println("Series of " + terms + " numbers : "); for (int i = 0; i <
		 * terms; i++) { System.out.print(questions.fibonacciRecursion(i) + " "); }
		 */

        System.out.println("\n\nIterating a hash map using foreach : ");
        Map<String, String> map = new HashMap<>();
        map.put("key1", "Ramesh");
        map.put("key2", "Sam");
        map.put("key3", "Jack");
        map.forEach((key, value) -> System.out.println(key + " = " + value));

        System.out.println("\nIterating a hash map using advanced for loop : ");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println("\nIterating a hash map using while and iterator : ");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }

        System.out.println("\nCount the number of words in a string using HashMap : ");
        questions.countNumberOfWordsInStringUsingHashMap(
                new BufferedReader(new InputStreamReader(System.in)).readLine());

    }
}