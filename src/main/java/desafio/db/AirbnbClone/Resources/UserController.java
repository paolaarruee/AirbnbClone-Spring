package desafio.db.AirbnbClone.Resources;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import desafio.db.AirbnbClone.Class.User;
import desafio.db.AirbnbClone.Repository.UserRepository;



@CrossOrigin(exposedHeaders = "errors, content-type")
@RequestMapping("/user/")
@RestController
public class UserController {
	
	@Autowired
   private UserRepository users;
	
	@RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<User>> findAll() throws ClassNotFoundException, IOException {
		List<User> todos = this.users.findAll();
		if (todos.isEmpty()) {
			return new ResponseEntity<List<User>>(todos, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<User>>(todos, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<User> getId(@PathVariable("id") long id) {
		User nome = users.findById(id);
		return new ResponseEntity<User>(nome, HttpStatus.OK);
	}
		
	@CrossOrigin(methods = {RequestMethod.POST})
    @RequestMapping(method = RequestMethod.POST, path="/users/add")
	public void addUser(@RequestBody User novo, HttpServletResponse response)
	{
		this.users.save(novo);
		//UserStore.store(novo); 
		response.setStatus(HttpServletResponse.SC_OK);
	}
	
	public boolean findByEmailPass(String email, String pass) {
		List<User> usuarios = this.users.findAll();
		for (User u : usuarios) {
			System.err.println(u.getEmail() + "," + email);
			if (u.getEmail().equals(email) && u.getSenha().equals(pass)) {
				return true;
			}
		}
		return false;
	}
	
	@CrossOrigin(methods = {RequestMethod.POST})
    @RequestMapping(method = RequestMethod.POST, path="/users/login")	
	public void login(@RequestBody User login, HttpServletResponse response)
	{
		if(findByEmailPass(login.getEmail(), login.getSenha()) == true) {
			response.setStatus(HttpServletResponse.SC_OK);
		} else {
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		}		
	}
	
	
}
