import java.util.*;

public class CTown {
	private static final int DEFAULT_NB_RESIDENT = 30;
	private static final String tableName[] = { "Abriville", "Agloe", "Argleton", "Armada", "Atlantis", "Avonlea",
			"Balbec", "Bel-o-kan", "Bends Hatch", "Bl�dhaven", "Brantford", "Camorr", "Capital City", "Carcosa",
			"Cascade", "Central City", "Chako Paul", "Ch�teau de Fenwick", "Chelm", "Cit� 17", "Cit� d'�meraude",
			"La Cit� du Soleil", "Clochemerle", "Commissaire Montalbano", "Courquain", "Cthol Mishrak", "Donaldville",
			"Eckm�l", "Ellesm�ra", "Fairview", "Genoa City", "Gleux-l�s-Lure", "Godric's Hollow", "Gotham",
			"Gotham City", "Greenfalls", "Hawkins", "Hill Valley", "Imrryr", "Industria", "Irsmun", "Jericho",
			"J�rimadeth", "La Kalloca�ne", "Kitej", "Laelith", "Lake Wobegon", "Lanceh�lion", "Langton", "Las Venturas",
			"Leidenstadt", "Liavek", "Liberty City", "Los Santos", "Macondo", "Meereen", "Metropolis", "Mickeyville",
			"Montalbano", "Neptune", "New Babylon", "North Haverbrook", "Nouvelle-Crobuzon", "Oniropolis",
			"Painful Gulch", "Palomar", "Pamparigouste", "Pamp�rigouste", "Pawnee", "Pelotillehue", "Perp�te-les-Oies",
			"P�taouchnok", "Plassans", "Pourceaugnac", "Pr�-au-Lard", "Prospective urbaine", "Raccoon City", "Rosewood",
			"Royale-les-Eaux", "Saint-Baudille", "San Andreas", "San Angeles", "San Fierro", "Sanfacion", "Scarfolk",
			"Seacouver", "Shambhala", "Shelbyville", "Sigil", "Smallville", "Springfield", "St. Mary Mead", "Star City",
			"Sunnydale", "Tanchico", "Tourmens", "Trantor", "Trifouilly-les-Oies", "Troie", "Villette", "Wadesdah",
			"Yonville", "Ys", "Zerzura" };

	private String m_name;
	private int m_nbResident;
	private List<CHuman> m_pHumans;

	public CTown() {// constructeur pas d�faut
		m_name = tableName[(int) (Math.random() * tableName.length)];
		m_nbResident = DEFAULT_NB_RESIDENT;
		m_pHumans = new LinkedList<CHuman>();
		for (int i = 0; i < DEFAULT_NB_RESIDENT; i++) {
			m_pHumans.add(new CHuman());
		}
	}

	public CTown(String name, int nbResident) {// constructeur surcharg�
		m_name = name;
		m_nbResident = nbResident;
		m_pHumans = new LinkedList<CHuman>();
		for (int i = 0; i < nbResident; i++) {
			m_pHumans.add(new CHuman());
		}
	}

	public String StrDescribe() {
		return (m_name + ", contient " + m_nbResident + " habitants");
	}

	public void ListingResident() {
		if (m_nbResident == 0) {
			System.out.println("Il n'y a pas d'habitant dans cette ville.");
			return;
		}
		System.out.println("Les habitants sont :");

		Iterator<CHuman> it = m_pHumans.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().StrDescribe());
		}
	}

	public boolean AddHuman() {// ajout d'un humain al�atoire
		m_pHumans.add(new CHuman());
		m_nbResident++;
		return true;
	}

	public boolean AddHuman(String firstName, String lastName, int age, int size, String adress) {
		// ajout d'un humain personnalis�
		m_pHumans.add(new CHuman(firstName, lastName, age, size, adress));
		m_nbResident++;
		return true;
	}

	public boolean DelHuman(int index) {
		if (index >= m_pHumans.size())
			return false;
		m_pHumans.remove(index);
		m_nbResident--;
		return true;
	}

	// GETTERS
	public String GetName() {
		return m_name;
	}

	public int GetNbResident() {
		return m_nbResident;
	}

	public List<CHuman> GetHumans() {
		return m_pHumans;
	}
}
