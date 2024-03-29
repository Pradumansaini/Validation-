package SpringBoot.jakartaValidation.model;

import jakarta.validation.constraints.*;

public class User {
    @NotNull (message = "Username must not be null")
    private String username;
    @NotNull(message = "Age must not be null")
    @Min(value = 18,message = "Age must be equal to or greater than 18")
    @Max(value = 50,message = "Age must be less than or equal to 50")
    private Integer age;
    @NotBlank(message = "Email must not be blank")
    @Email(message = "Invalid email address")
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String username, Integer age, String email) {
        this.username = username;
        this.age = age;
        this.email = email;
    }
    public User() {
    }
}
