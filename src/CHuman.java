public class CHuman {
	static private String tableName[] = { "Martin", "Bernard", "Thomas", "Petit", "Robert", "Richard", "Durand",
			"Dubois", "Moreau", "Laurent", "Simon", "Michel", "Lefebvre", "Leroy", "Roux", "David", "Bertrand", "Morel",
			"Fournier", "Girard", "Bonnet", "Dupont", "Lambert", "Fontaine", "Rousseau", "Vincent", "Muller", "Lefevre",
			"Faure", "Andre", "Mercier", "Blanc", "Guerin", "Boyer", "Garnier", "Chevalier", "Francois", "Legrand",
			"Gauthier", "Garcia", "Perrin", "Robin", "Clement", "Morin", "Nicolas", "Henry", "Roussel", "Mathieu",
			"Gautier", "Masson", "Marchand", "Duval", "Denis", "Dumont", "Marie", "Lemaire", "Noel", "Meyer", "Dufour",
			"Meunier", "Brun", "Blanchard", "Giraud", "Joly", "Riviere", "Lucas", "Brunet", "Gaillard", "Barbier",
			"Arnaud", "Martinez", "Gerard", "Roche", "Renard", "Schmitt", "Roy", "Leroux", "Colin", "Vidal", "Caron",
			"Picard", "Roger", "Fabre", "Aubert", "Lemoine", "Renaud", "Dumas", "Lacroix", "Olivier", "Philippe",
			"Bourgeois", "Pierre", "Benoit", "Rey", "Leclerc", "Payet", "Rolland", "Leclercq", "Guillaume", "Lecomte" };

	private String m_firstName;
	private String m_lastName;
	private int m_age;
	private float m_size;
	private String m_adress;

	public CHuman() {// constructeur par défaut
		m_firstName = tableName[(int) (Math.random() * tableName.length)];
		m_lastName = tableName[(int) (Math.random() * tableName.length)];
		m_age = (int) (Math.random() * 90);
		m_size = (float) ((int) (Math.random() * 10)) / 10 + 1;
		m_adress = (int) (Math.random() * 1000) + " rue de la paix";
	}

	public CHuman(String firstName, String lastName, int age, float size, String adress) {
		m_firstName = firstName;
		m_lastName = lastName;
		m_age = age;
		m_size = size;
		m_adress = adress;
	}

	public String StrDescribe() {
		return (m_firstName + " " + m_lastName + ", " + m_age + " ans, " + m_size + "m, vie au " + m_adress);
	}

	// GETTERS
	public String GetFirstName() {
		return m_firstName;
	}

	public String GetLastName() {
		return m_lastName;
	}

	public int GetAge() {
		return m_age;
	}

	public float GetSize() {
		return m_size;
	}

	public String GetAdress() {
		return m_adress;
	}
}
