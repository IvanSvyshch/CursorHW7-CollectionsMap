package HW7;

public class HW7Runner {
    public static void main(String[] args) {
        StringParser parser = new StringParser("Ababagalamaga12345 - - -");
        System.out.println(parser.getCountOfAllLetters());
        System.out.println(parser.getCountOfNumbers());
        System.out.println(parser.getCountOfSpaces());
        System.out.println(parser.getAllLetters());
    }
}
