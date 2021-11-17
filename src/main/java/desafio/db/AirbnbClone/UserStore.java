package desafio.db.AirbnbClone;

import java.io.*;

public class UserStore implements Serializable {

	public static boolean store(User u) {
	    try {
	      UserRepository users = null;
	      File arq = new File("usuarios.dat");
	      if(arq.exists()){
	        users = select();
	      }
	      users.save(u);
	      FileOutputStream files = new FileOutputStream(arq);
	      ObjectOutputStream obs = new ObjectOutputStream(files);
	      obs.writeObject(users);
	      return true;
	    } catch (ClassNotFoundException e) {
	      e.printStackTrace();
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	    return false;
	  }

	  public static UserRepository select() throws IOException, ClassNotFoundException {
		UserRepository users;
	    File arq = new File("usuarios.dat");
	    FileInputStream ins = new FileInputStream(arq);
	    ObjectInputStream obs = new ObjectInputStream(ins);
	    users = (UserRepository)obs.readObject();
	    obs.close();
	    return users;
	  }
	
}
