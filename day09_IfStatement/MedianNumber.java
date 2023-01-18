package day09_IfStatement;

public class MedianNumber {
    public static void main(String[] args) {
        int a=10,
                b=15,
                c=20;
        boolean aIsMedian= a>b && c>a || a>c && b>a;
        boolean bIsMedian =b>a && c>b || b>c && a>b;
        boolean cIsMedian= c>a && b>c || c>b && a>c;
        if(bIsMedian){
            System.out.println(b+ " is the median number");
        }



    }
}

// N O T ; VEYA OR == if(b>a && c>b || b>c && a>b;) bu şekilde de kısa yol.

/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number


 */