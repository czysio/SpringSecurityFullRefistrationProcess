package krzysiek.olejnik.registrationprocessdemo.service;

import krzysiek.olejnik.registrationprocessdemo.model.User;

public interface UserService {

	public User findUserByEmail(String email);

	public void saveUser(User user);

}
