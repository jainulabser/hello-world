package challenge;
import java.util.Scanner;

public class TwoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	char []charArr= {'a','e','i','o','u'};
	Scanner sc= new Scanner(System.in);
	char getchar=sc.next().charAt(0);
	for(char start='a';start<='z';start++)
	{
		if(getchar==charArr[0])
		{
		System.out.print("vowel");
		break;
		}
		else
			System.out.print("constant");
	}

	}

}
