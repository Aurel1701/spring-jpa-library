package com.corsojava.library.repository;


import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.corsojava.library.model.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Integer> {
	public Optional<User> findById(int userid);

}
