import utili.scanner;
public class random{
    public static void main(String[] args) {
        int num = (int) (Math.random() * 100 + 1);
        while(guess!=num){
            System.out.println("Guess a number between 1 and 100");
            Scanner input = new Scanner(System.in);
            int guess = input.nextInt();
            if(guess>num)
                System.out.println("Too high");

            else if(guess<num)
                System.out.println("Too low");
            
            else
                System.out.println("You guessed it!");
        }
    }
}