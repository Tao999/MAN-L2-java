import java.util.*;

public class CCountry {
	private static final int DEFAULT_NB_TOWNS = 30;
	private static final String tableName[] = { "Afrinia", "Afromacoland", "Agrabah", "Côte d'Ajan", "Aquabania",
			"Avalor", "le royaume de Babar", "Baki", "Balnibarbi", "Bangalla", "Banoi Island", "Barataria",
			"îles Barbituros", "îles Barclay Islands", "Bazaria", "Beninia", "Bensalem", "Blefuscu", "îles Booty",
			"Bora Gora", "Bordurie", "Saint Empire de Britannia", "Bubunne", "Cascara", "Caspak", "Cayuna", "Chicalor",
			"Conspirations", "Costa Estralia", "Costa Luna", "île Crab", "île du Crâne", "île Crocodile", "Crusoeland",
			"Daltonie", "Eleutheria", "Florin", "Gaaldine", "Genosha", "Génovie", "Glubbdubdrib", "Gondal", "Gopal",
			"Guaracha", "Hili-liland", "Houyhnhnm", "Hyrule", "Ishkebar", "Islandia", "Isla Island", "Javasu",
			"Jolliginki", "Khemed", "Kinakuta", "Kinkow", "Kurland", "Leaphigh", "Lilliput", "Lucre Island", "Luggnagg",
			"Madripoor", "Mai Chow", "Malaki-Masso", "Managua", "Manjipoor", "Mêlée Island", "Mervo", "Microslavie",
			"Mypos", "Medici", "Narnia", "Nollop", "Nuevo Rico", "Océania", "Ossaniul", "Pala", "Palombie", "Panau",
			"Panem", "Patusan", "Pelago Commonwealth", "Pepperland", "Phatt Island", "Plunder Island", "Porto Santo",
			"Rawhajpoutalah", "Sacramento", "Sahrani", "Saint Honoré", "Saint-Marie", "San Escobar", "San Lorenzo",
			"San Cristobal", "San Marcos", "San Miguel", "San Monique", "Santa Costa", "Saint George", "San Theodoros",
			"Sao Rico", "Sodor", "Syldavie", "Taprobane", "Terabithia", "Tescala", "Tétaragua", "Tsalal", "Tropico",
			"Urville", "Vanutu", "Varaiso", "Wa", "Wakanda", "Wadiya", "Pays Winkie", "Wurthenheim" };

	private String m_name;
	private List<CTown> m_pTowns;
	private int m_nbTown;

	public CCountry() {
		m_name = tableName[(int) (Math.random() * tableName.length)];
		m_pTowns = new LinkedList<CTown>();
		m_nbTown = DEFAULT_NB_TOWNS;

		for (int i = 0; i < m_nbTown; i++) {
			m_pTowns.add(new CTown());
		}
	}

	public CCountry(String name, int nbTown) {
		m_name = name;
		m_nbTown = nbTown;
		for (int i = 0; i < nbTown; i++) {
			m_pTowns.add(new CTown());
		}
	}

	public int CountHuman() {
		int tempTotal = 0;
		Iterator<CTown> it = m_pTowns.iterator();
		while (it.hasNext()) {
			tempTotal += it.next().GetNbResident();
		}
		return tempTotal;
	}
	
	public String StrDescribe(){
		return (m_name + ", contient " + m_nbTown + " villes, pour "+ CountHuman() + " habitants");
	}
	
	public void ListingTown(){
		if (m_nbTown == 0) {
			System.out.println("Il n'y a pas de ville dans ce pays.");
			return;
		}
		System.out.println("Les villes sont :");

		Iterator<CTown> it = m_pTowns.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().StrDescribe());
		}
	}
	
	public void ListingResByTown(){
		Iterator<CTown> it = m_pTowns.iterator();
		while (it.hasNext()) {
			CTown tempTown = it.next();
			System.out.println("\n\r"+tempTown.StrDescribe());
			tempTown.ListingResident();
		}
	}
}
