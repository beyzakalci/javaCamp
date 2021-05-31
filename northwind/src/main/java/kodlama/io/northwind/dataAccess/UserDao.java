package kodlama.io.northwind.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.northwind.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer>{
	
	User findByEmail(String email);

}
