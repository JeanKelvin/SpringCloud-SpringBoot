package com.coderef.delivery.auth.server.Repository;

import com.coderef.delivery.auth.server.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AuthorityRepository extends JpaRepository<Authority, String>{

    Authority findByName(String name);

}
