package exoville;

public class Sdz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Ville ville = new Ville();
			System.out.println(ville.nomVille);
			ville.nomVille = "la tete a toto !!!!";
			System.out.println(ville.nomVille);
			
			Ville ville2 = new Ville("Marseille", 123456789 , "France");
			ville2.nomPays = "La tete a tutu !!!! ";
			System.out.println(ville2.nomPays);
	}

}
