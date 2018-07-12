import java.util.*;
enum TypeMode{
		NORMAL,
		RANDOM;
	};
	

public class CHuman {
	private String m_firstName;
	private String m_lastName;
	private int m_age;
	private float m_size;
	private String m_adress;
	
	public CHuman() {//constructeur par défaut
		m_firstName = "unknown";
		m_lastName = "unknown";
		m_age = 0;
		m_size = 0;
		m_adress = "unknown";
	}
	public CHuman(int mode, String firstName, String lastName, int age, float size, String adress){//constructeur surchargé
		TypeMode itemp = TypeMode.values()[mode];
		switch(itemp){//sélection du mode
		case NORMAL :
			m_firstName = firstName;
			m_lastName = lastName;
			m_age = age;
			m_size = size;
			m_adress = adress;
			break;
			
		case RANDOM:
			break;
			
		default:
			break;
		}
	}
}
