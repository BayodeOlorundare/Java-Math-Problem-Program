import java.util.Scanner;
import java.util.Random;
public class Main {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			String inputAnswer;
			System.out.println("What problems would you like to practice (+, -, /, *)?");
			inputAnswer = input.nextLine();
			while(true){
				if(inputAnswer.equals("+") || inputAnswer.equals("-") || inputAnswer.equals("/") || inputAnswer.equals("*"))
					break;
				else{
					System.out.println("Invalid input, please enter one operation (+, -, /, *)");
					inputAnswer = input.nextLine();
				}
			}
			int counter = 0;
			int num1;
			int num2;
			int answer;
			int userAnswer;
			int answerRemainder;
			int useranswerRemainder;
			Random random = new Random();
			while(counter != 5){
				if(inputAnswer.equals("+")){
					num1 = random.nextInt(13);
					num2 = random.nextInt(13);
					answer = num1 + num2;
					System.out.println(num1 + " + " + num2);
					userAnswer = input.nextInt();
					if(userAnswer == answer){
						System.out.println("You got it right!");
						counter++;
					}
					else{
						System.out.println("You got it wrong!");
					}
					
				}
				else if(inputAnswer.equals("-")){
					num1 = random.nextInt(13);
					num2 = random.nextInt(13);
					answer = num1 - num2;
					System.out.println(num1 + " - " + num2);
					userAnswer = input.nextInt();
					if(userAnswer == answer){
						System.out.println("You got it right!");
						counter++;
					}
					else{
						System.out.println("You got it wrong!");
					}
					
				}
				else if(inputAnswer.equals("/")){
					num1 = random.nextInt(13);
					num2 = random.nextInt(13);
					
					while(num2 == 0)
						num2 = random.nextInt(13);
					while(num1 < num2)
						num1 = random.nextInt(13);
					
					answer = num1 / num2;
					answerRemainder = num1 % num2;
					
					System.out.println(num1 + " / " + num2);
					userAnswer = input.nextInt();
					System.out.println("Please enter the remainder");
					useranswerRemainder = input.nextInt();
					
					if(userAnswer == answer && useranswerRemainder == answerRemainder){
						System.out.println("You got it right!");
						counter++;
					}
					else{
						System.out.println("You got it wrong!");
					}
					
				}
				else{
					num1 = random.nextInt(13);
					num2 = random.nextInt(13);
					answer = num1 * num2;
					System.out.println(num1 + " * " + num2);
					userAnswer = input.nextInt();
					if(userAnswer == answer){
						System.out.println("You got it right!");
						counter++;
					}
					else{
						System.out.println("You got it wrong!");
					}
					
				}
				
		}
		System.out.println("Congrads, you've answered all questions correctly!");
		input.close();
	}
	
}
