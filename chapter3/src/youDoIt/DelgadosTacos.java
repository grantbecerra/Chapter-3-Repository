package youDoIt;

import java.util.Scanner;

public class DelgadosTacos {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double classicTacos = 1.50;
		double burritos = 5.00;
		double carnitas = 3.50;
		double carneAsadaTacos = 4.50;
		double enchiladas = 7.00;
		double quesadillas = 5.00;
		double chimichangas = 4.00;
		double churros = 4.00;
		double tacosdeLengua = 8.00;
		double fajitas = 7.00;
		double tortas = 4.50;
		displayTacoTruck();
		Scanner keyboard = new Scanner (System.in);
		displayMenu();
		
		System.out.println("How many Classic Tacos");
		int classicTacosOrdered = keyboard.nextInt();
		
		System.out.println("How many Burritos ");
		int burritosOrdered = keyboard.nextInt();
		
		System.out.println("How many carnitas");
		int carnitasOrdered = keyboard.nextInt();
		
		System.out.println("How many carneAsadaTacos");
		int carneAsadaTacosOrdered = keyboard.nextInt();
		
		System.out.println("How many enchiladas");
		int enchiladasOrdered = keyboard.nextInt();
		
		System.out.println("How many quesadillas");
		int quesadillasOrdered = keyboard.nextInt();
		
		System.out.println("How many chimichangas");
		int chimichangasOrdered = keyboard.nextInt();
		
		System.out.println("How many churros");
		int churrosOrdered = keyboard.nextInt();
		
		System.out.println("How many tacosdeLengua");
		int tacosDeLenguaOrdered = keyboard.nextInt();
		
		System.out.println("How many fajitas");
		int fajitasOrdered = keyboard.nextInt();
		
		System.out.println("How many tortas");
		int tortasOrdered = keyboard.nextInt();
		
		
		double total = (classicTacosOrdered * classicTacos) + (burritosOrdered * burritos) +
				(carnitasOrdered * carnitas) + (carneAsadaTacos * carneAsadaTacosOrdered) + 
				(enchiladas * enchiladasOrdered) + (quesadillas * quesadillasOrdered) + 
				(chimichangas * chimichangasOrdered) + (churros * churrosOrdered) + 
				(tacosdeLengua * tacosDeLenguaOrdered) + (fajitas * fajitasOrdered) +
				(tortas * tortasOrdered);
		
		System.out.println("Your total is " + total);
		
		
	}
	public static void displayMenu()
	{
		System.out.println("Classic Tacos")
		classicTacos = 1.50;
		double burritos = 5.00;
		double carnitas = 3.50;
		double carneAsadaTacos = 4.50;
		double enchiladas = 7.00;
		double quesadillas = 5.00;
		double chimichangas = 4.00;
		double churros = 4.00;
		double tacosdeLengua = 8.00;
		double fajitas = 7.00;
		double tortas = 4.50;
		
	public static void displayTacoTruck() 
	{
	
	
	System.out.println("TacoTruckTacoTruckTacoTruckTacoTruckTacoT");
	System.out.println("TacoTruckTacoTruckTacoTruckTacoTruckTacoTru");
	System.out.println("TacoTruckTacoTruckTacoTruckTacoTruckTacoTruck");
	System.out.println("TacoTruck           Window   TruckTaco       Ta");
	System.out.println("TacoTruck   Menu    Window   TruckTaco       Taco");
	System.out.println("TacoTruck   Menu    Window   TruckTaco       TacoTru");
	System.out.println("TacoTruck           Window   coTruckTacoTruckTacoTruck");
	System.out.println("TacoTruckTacoTruckTacoTruckTacoTruckTacoTruckTacoTruck");
	System.out.println("TacoTruckTacoTruckTacoTruckTacoTruckTacoTruckTacoTruck");
	System.out.println("TacoTruckTacoTruckTacoTruckTacoTruckTacoTruckTacoTruck");
	System.out.println("TacoTruckTacoTruckTacoTruckTacoTruckTacoTruckTacoTruck");
	System.out.println("TacoTruckTacoTruckTacoTruckTacoTruckTacoTruckTacoTruck");
	System.out.println("         Taco  Truck                Taco  Truck");
	System.out.println("         TacoTruck                   TacoTruck");

			
			
			
			
			
			
			
			
			
			
}
}