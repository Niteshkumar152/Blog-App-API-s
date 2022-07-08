package com.blog.app.blog.app.apis;

import com.blog.app.blog.app.apis.config.AppConstants;
import com.blog.app.blog.app.apis.entities.Role;
import com.blog.app.blog.app.apis.repository.RoleRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@SpringBootApplication
public class BlogAppApisApplication implements CommandLineRunner {

	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private RoleRepo roleRepo;

	public static void main(String[] args) {
		SpringApplication.run(BlogAppApisApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	@Override
	public void run(String... args) throws Exception{
		System.out.println(this.passwordEncoder.encode("abc"));
		try{

			Role adminRole = new Role();
			adminRole.setId(AppConstants.ADMIN_USER);
			adminRole.setName("ROLE_ADMIN");

			Role normalRole = new Role();
			normalRole.setId(AppConstants.NORMAL_USER);
			normalRole.setName("ROLE_NORMAL");

			List<Role> roles= List.of(adminRole,normalRole);
			List<Role> result = this.roleRepo.saveAll(roles);
			result.forEach(r->{
				System.out.println(r.getName());
			});
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
