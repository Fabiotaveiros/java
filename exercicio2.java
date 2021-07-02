package Lista2;
import java.util.Scanner;

public class exercicio2 {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int a,b,c;
	
	System.out.println("Leia A: ");
	a=ler.nextInt();
	System.out.println("Leia B: ");
	b=ler.nextInt();
	System.out.println("Leia C: ");
	c=ler.nextInt();
	if(a == b && b == c) {
		System.out.printf("Primeiro - %d Segundo  %d Terceiro - %d\n", a,b,c);}
	else if(a>=b && b>=c) {
		System.out.printf("Primeiro - %d Segundo - %d Terceiro - %d\n", c,b,a);}
	else if(a<=b && b<=c) {
		System.out.printf("Primeiro - %d Segundo - %d Terceiro - %d\n", a,b,c);}
	else if(a>=b && b<=c) {
		System.out.printf("Primeiro - %d Segundo - %d Terceiro - %d\n", b,a,c);}
	else if(a<=b && b>=c) {
		System.out.printf("Primeiro - %d Segundo - %d Terceiro - %d\n", a,c,b);}
	}
}

