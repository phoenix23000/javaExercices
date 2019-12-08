package exoville;

public class Ville {
	
		
			String nomVille;
			String nomPays ;
			int nbreHabitants;
			public Ville() {
				System.out.println("Creation d'une ville ! ");
				nomVille = "inconnu";
				nomPays = "inconnu";
				nbreHabitants = 0;
			
			}
public Ville(String pNom, int pNbre, String pPays )
{
	System.out.println("Creation d'une ville avec des parametres !");
	nomVille = pNom;
	nomPays = pPays;
	nbreHabitants = pNbre;
	
	
	
}
}
