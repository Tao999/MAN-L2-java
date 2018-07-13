import java.util.*;

public class CTown {
	private int DEFAULT_DEFAULT_NB_RESIDENT = 3;

	protected String m_name;
	protected int m_nbResident;
	protected List<CHuman> m_pHumans = new LinkedList<CHuman>();

	public CTown() {// constructeur pas défaut
		m_name = "Nouvelle Ville";
		m_nbResident = DEFAULT_DEFAULT_NB_RESIDENT;
		for (int i = 0; i < DEFAULT_DEFAULT_NB_RESIDENT; i++) {
			m_pHumans.add(new CHuman());
		}
	}

	public CTown(String name, int nbResident) {//constructeur surchargé
		m_name = name;
		m_nbResident = nbResident;
		for (int i = 0; i < nbResident; i++) {
			m_pHumans.add(new CHuman());
		}
	}
	
	public String StrDescribe() {
		return (m_name + ", contient " + m_nbResident + " habitants");
	}
	
	public void ListingResident(){
		System.out.println("Les habitants sont :");
		for(int i=0;i<m_nbResident;i++){
			System.out.println(m_pHumans.get(i).StrDescribe());
		}
	}

}
