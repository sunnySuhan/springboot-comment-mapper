package com.sgh;

import com.sgh.dao.UserDao;
import com.sgh.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootCommentMapperApplicationTests {
	@Autowired
	UserDao userDao;
	@Test
	public void selectAll() {
		List<User> users = userDao.selectAll();
		System.out.println(users);
	}
	@Test
	public void insert(){

		User user = new User();
		user.setPassword("123");
		user.setName("sgh");
		userDao.insert(user);
	}


	@Test
	public void existsWithPrimaryKey(){
		boolean b = userDao.existsWithPrimaryKey(1);
		System.out.println(b);
	}

	@Test
	public void delete() {
		User user = new User();
		user.setId(2);
		userDao.delete(user);
	}


}
