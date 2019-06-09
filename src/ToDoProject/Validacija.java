package ToDoProject;

import java.util.ArrayList;

public class Validacija {
	
	public boolean loginValidacija(String imeVlasnika, String password, ArrayList<Racun> racuni) {
		for (int i = 0; i < racuni.size(); i++) {
			if (racuni.get(i).getImeVlasnika() == imeVlasnika) {
				if (racuni.get(i).getPassword().equals(password)) {
					return true;
				}
			}
		}
		return false;
	}

}
