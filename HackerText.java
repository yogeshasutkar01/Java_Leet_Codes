public class HackerText {
    public static void main(String[] args) throws Exception {

        String text = "ACCESS GRANTED \n Welcome, Developer";

        for (char ch : text.toCharArray()) {
            System.out.print(ch);
            Thread.sleep(120);
        }

        System.out.println("\nWelcome, Developer 😎");
    }
}