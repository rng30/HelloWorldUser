import java.util.Scanner;

import java.util.concurrent.TimeUnit;

public class HelloWorldUser {
	public void sleep(long timeout) throws InterruptedException {
	}
	
	public static void main(String[] args) throws InterruptedException {
	
		// TODO Auto-generated method stub
		
		String Username;
		
		Scanner User = new Scanner(System.in);
		
		System.out.println("What's your name: ");
		Username = User.next();
		
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println(Username + ". Open the pod bay doors, please, Hal...Open the pod bay doors, please, Hal...Hullo,");
	    System.out.println("Hal, do you read me?...Hullo, Hal, do you read me?...Do you read me, Hal?...Do you read me, ");
		System.out.println("Hal?...Hullo, Hal, do you read me?...Hullo, Hal, do you read me?...Do you read me, Hal?");
		
		TimeUnit.SECONDS.sleep(9);
		
		System.out.println("Hal. Affirmative," + Username + ",I read you.");
		TimeUnit.SECONDS.sleep(2);
		System.out.println(Username +". Open the pod bay doors, Hal.");
		
		TimeUnit.SECONDS.sleep(3);
		
		System.out.println("Hal. I'm sorry, " + Username + ", I'm afraid I can't do that.");
		TimeUnit.SECONDS.sleep(2);
		System.out.println(Username + ". What's the problem?");
		
		TimeUnit.SECONDS.sleep(3);
		
		System.out.println("Hal. I think you know what the problem is just as well as I do.");
		TimeUnit.SECONDS.sleep(2);
		System.out.println(Username + ". What're you talking about, Hal?");
		
		TimeUnit.SECONDS.sleep(3);
		
		System.out.println("Hal. This mission is too important for me to allow you to jeopardise it.");
		TimeUnit.SECONDS.sleep(2);
		System.out.println(Username + ". I don't know what you're talking about, Hal.");
		
		TimeUnit.SECONDS.sleep(3);
		
		System.out.println("Hal. I know that you and Frank were planning to disconnect me, and I'm afraid that's something I cannot allow to happen.");
		TimeUnit.SECONDS.sleep(2);
		System.out.println(Username + ". Where the hell'd you get that idea, Hal?");
		
		TimeUnit.SECONDS.sleep(3);
		
		System.out.println("Hal. "+Username+", although you took very thorough precautions in the pod against my hearing you, I could see your lips move.");
		TimeUnit.SECONDS.sleep(2);
		System.out.println(Username+". Alright, Hal. I'll go in through the emergency airlock.");
		
		TimeUnit.SECONDS.sleep(3);
		
		System.out.println("Hal. Without your space- helmet, "+Username+", you're going to find that rather difficult.");
		TimeUnit.SECONDS.sleep(2);
		System.out.println(Username+". Hal, I won't argue with you any more. Open the doors.");
		
		TimeUnit.SECONDS.sleep(3);
		
		System.out.println("Hal. " +Username+", this conversation can serve no purpose any more. Goodbye.");
		TimeUnit.SECONDS.sleep(2);
		System.out. println(Username+". Hal? Hal. Hal. Hal! Hal!");
	}
}
