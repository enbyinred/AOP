package tiergen;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.*;
public class Main 
{

	
	public static void main(String[] args) throws Exception 
	{
		//Pfad anpassen!
		File f = new File("./Tiere.txt");
		OutputStream ostream = new FileOutputStream(f);
		
		PrintWriter writer = new PrintWriter(ostream);
		Random zufall = new Random();
		Scanner reader = new Scanner(System.in);
		
		List<Feloidea> katzen = new ArrayList<>();
		List<Canoidea> hunde = new ArrayList<>();
		
		System.out.print("Anzahl > ");
		int anzahl = reader.nextInt();
		
		for(int i = 0; i < anzahl; i++){
			switch(zufall.nextInt(8)){
				case 0:
					writer.println("Amurtiger");
					katzen.add(new Amurtiger());
					break;
				case 1:
					writer.println("Maine-Coon");
					katzen.add(new MaineCoon("Saine"));
					break;
				case 2:
					writer.println("Beagle");
					hunde.add(new Beagle("Berni"));
					break;
				case 3:
					writer.println("Erdmaennchen");	
					katzen.add(new Erdmaennchen());
					break;
				case 4:
					writer.println("Wolf");		
					hunde.add(new Wolf());
					break;
				case 5:
					writer.println("Tuerkisch Van");	
					katzen.add(new TuerkischVan("Bernhard"));
					break;
				case 6:
					writer.println("Bernhardiner");	
					hunde.add(new Bernhardiner("Karsten"));
					break;
				case 7:
					writer.println("Kodiakbaer");	
					hunde.add(new Kodiakbaer());
					break;
				default:
			}
		}
		reader.close();
		writer.close();
		
		System.out.println(katzen);
		System.out.println(hunde);
	}

}
