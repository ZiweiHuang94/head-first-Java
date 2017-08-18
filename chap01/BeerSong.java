package chap01;

public class BeerSong {
    public static  void main(String[] args){
        int totalBeerNum = 3;
        int beerNum = totalBeerNum;
        String word = "bottles";
        while(beerNum >0){
            System.out.println(beerNum + " " + word + " of beer on the wall,");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Pass one down and pass it around,");
            beerNum = beerNum - 1;
            if(beerNum == 1){
                word = "bottle";
                System.out.println(beerNum + " " +word + " of beer on the wall.\n");
            }else if(beerNum == 0){
                System.out.println("no more bottles of beer on the wall.\n");
            }else {
                System.out.println(beerNum + " " +word + " of beer on the wall.\n");
            }
        }
        System.out.println("No more bottles of beer on the wall,");
        System.out.println("no more bottles of beer.");
        System.out.println("Go to the store and buy some more,");
        System.out.println(totalBeerNum + " bottles of beer on the wall.");
    }
}
