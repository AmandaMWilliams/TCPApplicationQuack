package quack.finalproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quack.finalproject.models.User;
import quack.finalproject.repositories.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public Optional<User> getUserByUsername(String username) {
        return userRepository.getByUsername(username);
    }

    public User createUser(User user) {
        String regex = "^[a-zA-Z0-9]{1,10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(user.getUsername());

        if (matcher.matches()) {
            if (!userRepository.getByUsername(user.getUsername()).isPresent()) {
                return userRepository.save(user);
            }
            user.setUserId(-2L);
        } else {
            user.setUserId(-1L);
        }
        return user;

    }

    public Optional<User> updateUsername(Long id, String username) {
        Optional<User> updatedUser = userRepository.findById(id);
        if (!userRepository.getByUsername(username).isPresent()) {
            updatedUser.get().setUsername(username);
            userRepository.save(updatedUser.get());
        } else throw new IllegalArgumentException("Username taken.");
        return updatedUser;
    }

    public Optional<User> updatePassword(Long id, String password) {
        Optional<User> updatedUser = userRepository.findById(id);
        updatedUser.get().setPassword(password);
        userRepository.save(updatedUser.get());
        return updatedUser;
    }

    public Boolean deleteUser(Long id) {
        if (getUserById(id).isPresent()) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
