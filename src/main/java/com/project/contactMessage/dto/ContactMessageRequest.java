package com.project.contactMessage.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class ContactMessageRequest {

    @NotNull(message = "Please enter name")
    @Size(min = 3, max = 16, message = "Your name should be at least 3 characters")
    @Pattern(regexp = "\\A(?!\\s*\\Z).+", message = "Your name must consist of the character")
    private String name;//34 - 1ab

    @NotNull(message = "Please enter valid email adress")
    @Size(min = 5, max = 20, message = "Your email should be at least 3 characters")
    @NotNull(message = "Please enter email")
    private String email;

    @NotNull(message = "Please subject name")
    @Size(min = 3, max = 50, message = "Your subject should be at least 3 characters")
    @Pattern(regexp = "\\A(?!\\s*\\Z).+", message = "Your subject must consist of the character")
    private String subject;

    @NotNull(message = "Please subject message")
    @Size(min = 3, max = 150, message = "Your message should be at least 3 characters")
    private String message;
}
