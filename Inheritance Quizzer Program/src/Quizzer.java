import java.util.Calendar;
import java.util.Scanner;

public class Quizzer
	{
		static String name;
		static double points = 0.0;
		public static void main(String[] args)
			{
				greeting();
				start();
				keepgoing();
			}
		
		public static void greeting(){
			Calendar cal = Calendar.getInstance();
			int hour = cal.get(Calendar.HOUR_OF_DAY);
			String phrase;
			if (hour < 12){
				phrase = "Good morning";
			} else if (hour < 17){
				phrase = "Good afternoon";
			} else {
				phrase = "Good evening";
			}
			Scanner userInput = new Scanner(System.in);
		    System.out.println(phrase + ", what is your name?");
		    name = userInput.nextLine();
		    System.out.println("Hello, " + name + "!");	    
		}	
		
		public static void start(){
			System.out.println( name + ", you are about to get tested on Inheritance(JAVA)! Type \"Start\" to show you are ready to take the quiz!");
			Scanner userInput = new Scanner(System.in);
		    String readyness = userInput.nextLine();
			if (readyness.equalsIgnoreCase("Start")){
				quiz();
			} else {
				start();
			}
		}
		
		public static void quiz(){
			int userAnswer = 0;
			String choices = "1) Eat; 2) Drink; 3) Teach; 4) Grade; 5) does not work.";
			String Initializer1 = "People p1 = new People();";
			String Initializer2 = "People p2 = new Teacher();";
			String Initializer3 = "Teacher t1 = new People();";
			String Initializer4 = "Teacher t2 = new Teacher();";
			String questionType1 = "peopleM1();";
			String questionType2 = "peopleM2();";
			String questionType3 = "teachersM1();";
			
			System.out.println(name + ", use the code on the sheet to help you answer the questions! To answer a question, type the number of the choice that you think is correct.");
			System.out.println("Given \"" + Initializer1 +"\" and predict the output of the following questions.");
			
			System.out.println("Q1: p1." + questionType1);
			System.out.println("1) Eat; 2) Drink; 3) Teach; 4) Grade; 5) does not work.");
			Scanner userInput = new Scanner(System.in);
		    userAnswer = userInput.nextInt();
			if (userAnswer == 1){
				points++;
				System.out.println("You are right, " + name + "! :) Your current score is " + points + "/12.0.");
			} else {
				System.out.println("You got it wrong, " + name + ". :( Your current score is " + points + "/12.0.");
			}
			
			System.out.println("Q2: p1." + questionType2);
			System.out.println("1) Eat; 2) Drink; 3) Teach; 4) Grade; 5) does not work.");
		    userAnswer = userInput.nextInt();
			if (userAnswer == 2){
				points++;
				System.out.println("You are right, " + name + "! :) Your current score is " + points + "/12.0.");
			} else {
				System.out.println("You got it wrong, " + name + ". :( Your current score is " + points + "/12.0.");
			}
			
			System.out.println("Q3: p1." + questionType3);
			System.out.println("1) Eat; 2) Drink; 3) Teach; 4) Grade; 5) does not work.");
		    userAnswer = userInput.nextInt();
			if (userAnswer == 5){
				points++;
				System.out.println("You are right, " + name + "! :) Your current score is " + points + "/12.0.");
			} else {
				System.out.println("You got it wrong, " + name + ". :( Your current score is " + points + "/12.0.");
			}
			
			System.out.println("Given \"" + Initializer2 +"\" and predict the output of the following questions.");
			System.out.println("Q4: p2." + questionType1);
			System.out.println("1) Eat; 2) Drink; 3) Teach; 4) Grade; 5) does not work.");
		    userAnswer = userInput.nextInt();
			if (userAnswer == 1){
				points++;
				System.out.println("You are right, " + name + "! :) Your current score is " + points + "/12.0.");
			} else {
				System.out.println("You got it wrong, " + name + ". :( Your current score is " + points + "/12.0.");
			}
			
			System.out.println("Q5: p2." + questionType2);
			System.out.println("1) Eat; 2) Drink; 3) Teach; 4) Grade; 5) does not work.");
		    userAnswer = userInput.nextInt();
			if (userAnswer == 4){
				points++;
				System.out.println("You are right, " + name + "! :) Your current score is " + points + "/12.0.");
			} else {
				System.out.println("You got it wrong, " + name + ". :( Your current score is " + points + "/12.0.");
			}
			
			System.out.println("Q6: p2." + questionType3);
			System.out.println("1) Eat; 2) Drink; 3) Teach; 4) Grade; 5) does not work.");
		    userAnswer = userInput.nextInt();
			if (userAnswer == 5){
				points++;
				System.out.println("You are right, " + name + "! :) Your current score is " + points + "/12.0.");
			} else {
				System.out.println("You got it wrong, " + name + ". :( Your current score is " + points + "/12.0.");
			}
			
			System.out.println("Given \"" + Initializer3 +"\" and predict the output of the following questions.");
			System.out.println("Q7: t1." + questionType1);
			System.out.println("1) Eat; 2) Drink; 3) Teach; 4) Grade; 5) does not work.");
		    userAnswer = userInput.nextInt();
			if (userAnswer == 5){
				points++;
				System.out.println("You are right, " + name + "! :) Your current score is " + points + "/12.0.");
			} else {
				System.out.println("You got it wrong, " + name + ". :( Your current score is " + points + "/12.0.");
			}
			
			System.out.println("Q8: t1." + questionType2);
			System.out.println("1) Eat; 2) Drink; 3) Teach; 4) Grade; 5) does not work.");
		    userAnswer = userInput.nextInt();
			if (userAnswer == 5){
				points++;
				System.out.println("You are right, " + name + "! :) Your current score is " + points + "/12.0.");
			} else {
				System.out.println("You got it wrong, " + name + ". :( Your current score is " + points + "/12.0.");
			}
			
			System.out.println("Q9: t1." + questionType3);
			System.out.println("1) Eat; 2) Drink; 3) Teach; 4) Grade; 5) does not work.");
		    userAnswer = userInput.nextInt();
			if (userAnswer == 5){
				points++;
				System.out.println("You are right, " + name + "! :) Your current score is " + points + "/12.0.");
			} else {
				System.out.println("You got it wrong, " + name + ". :( Your current score is " + points + "/12.0.");
			}
			
			System.out.println("Given \"" + Initializer4 +"\" and predict the output of the following questions.");
			System.out.println("Q10: t2." + questionType1);
			System.out.println("1) Eat; 2) Drink; 3) Teach; 4) Grade; 5) does not work.");
		    userAnswer = userInput.nextInt();
			if (userAnswer == 1){
				points++;
				System.out.println("You are right, " + name + "! :) Your current score is " + points + "/12.0.");
			} else {
				System.out.println("You got it wrong, " + name + ". :( Your current score is " + points + "/12.0.");
			}
			
			System.out.println("Q11: t2." + questionType2);
			System.out.println("1) Eat; 2) Drink; 3) Teach; 4) Grade; 5) does not work.");
		    userAnswer = userInput.nextInt();
			if (userAnswer == 4){
				points++;
				System.out.println("You are right, " + name + "! :) Your current score is " + points + "/12.0.");
			} else {
				System.out.println("You got it wrong, " + name + ". :( Your current score is " + points + "/12.0.");
			}
			
			System.out.println("Q12: t2." + questionType3);
			System.out.println("1) Eat; 2) Drink; 3) Teach; 4) Grade; 5) does not work.");
		    userAnswer = userInput.nextInt();
			if (userAnswer == 3){
				points++;
				System.out.println("You are right, " + name + "! :) Your current score is " + points + "/12.0.");
			} else {
				System.out.println("You got it wrong, " + name + ". :( Your current score is " + points + "/12.0.");
			}			
		}
		
		public static void keepgoing(){
			double percentage = points/12.0*100;
			if (percentage > 80) {
			    System.out.println("Good job! " + name + ", you got "  + percentage +  "%.");
			    } else {
			    System.out.println("Keep studying, " + name + ". You got "  + percentage +  "%.");
			    }
			System.out.println("Would you like to practice more? (Type \"Yes\"to restart the quiz.)");
			Scanner userInput = new Scanner(System.in);
			String readyness = userInput.nextLine();
			if (readyness.equalsIgnoreCase("Yes")){
				quiz();
			} else {
				System.out.println("Thanks for using the quizzer, " + name + ". Good bye!");
				 System.exit(0);
			}
		}

	}
