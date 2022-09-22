import java.util.*;
import java.time.LocalDate;

public class BasicIO {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		
		int year = now.getYear();
		int month = now.getMonthValue();
		int day = now.getDayOfMonth();
		Scanner stdin = new Scanner(System.in);
		// get first input
		System.out.print("Enter your name: ");
		String name = stdin.nextLine();
		System.out.print("Enter your age: ");
		int age = stdin.nextInt();
		System.out.print("Enter your height: ");
		int height = stdin.nextInt();
		System.out.printf("%d년 %d월 %d일 현재 %s(%d)의 키는 %d cm 입니다.",year,month,day,name,age,height);
	}

}
