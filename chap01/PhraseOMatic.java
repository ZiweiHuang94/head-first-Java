// create my own word lists
package chap01;

public class PhraseOMatic {
    public static void main(String[] args){
        String[] wordListOne = {"morning", "afternoon", "evening", "weekday", "weekend", "spring", "summer", "autumn", "winter"};
        String[] wordListTwo = {"mom", "dad", "girl", "boy", "dog", "cat", "bird"};
        String[] wordListThree = {"read", "dance", "cook", "study", "swim", "sleep", "eat", "walk"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int)(Math.random() * oneLength);
        int rand2 = (int)(Math.random() * twoLength);
        int rand3 = (int)(Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("The mix is: " + phrase);
    }
}