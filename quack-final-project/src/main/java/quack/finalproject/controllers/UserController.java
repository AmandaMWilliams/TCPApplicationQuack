package quack.finalproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import quack.finalproject.models.User;
import quack.finalproject.services.UserService;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Long id) {
        return userService.getUserById(id)
                .map(user -> ResponseEntity
                        .ok()
                        .body(user))
                .orElse(ResponseEntity
                        .notFound()
                        .build());
    }

    @GetMapping("/username/{username}")
    public ResponseEntity<?> getUserByUsername(@PathVariable String username) {
        return userService.getUserByUsername(username)
                .map(user -> ResponseEntity
                        .ok()
                        .body(user))
                .orElse(ResponseEntity
                        .notFound()
                        .build());
    }

    @PostMapping("/create/{user}")
    public User createUser(@PathVariable User user) {
        return userService.createUser(user);
    }

    @PutMapping("/update/username/{id}")
    public ResponseEntity<?> updateUsername(@PathVariable Long id, @RequestParam String username) {
        Optional<User> updatedUser = userService.updateUsername(id, username);
        return updatedUser.map(user -> {
            try {
                return ResponseEntity
                        .ok()
                        .location(new URI("/update/username/" + user.getUserId()))
                        .body(user);
            } catch (URISyntaxException e) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
            }
        }).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/update/password/{id}")
    public ResponseEntity<?> updatePassword(@PathVariable Long id, @RequestParam String password) {
        Optional<User> updatedUser = userService.updatePassword(id, password);
        return updatedUser.map(user -> {
            try {
                return ResponseEntity
                        .ok()
                        .location(new URI("/update/password/" + user.getUserId()))
                        .body(user);
            } catch (URISyntaxException e) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
            }
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteUser(@PathVariable Long id) {
        return (userService.deleteUser(id) ? ResponseEntity.ok().build() : ResponseEntity.notFound().build());
    }
}
