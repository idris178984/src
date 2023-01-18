package day09_IfStatement;

public class ChooseLanguageTask1 {
    public static void main(String[] args) {

        int num=3;
        String result="";

        if(num==1) {
            result = "Hello, thank for your call";
        }else if(num==2){
            result="Hola, gracias para llamar"  ;
            }else if(num==3){
            result="Merhaba, aradiginiz icin tesekkurler";
        }else{
            result="Merci ,pour votre appel";
        }

        System.out.println(result);



    }
}
/*
Creata a class called ChooseLanguage, Given an integer variable named selection that has a number between 1~5, Write a program that can select the language based on the number that's given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel
 */