package org.example.echonote.dto.request;

public record UserRequest(String name,Integer age, String username, String email, String password, String passwordConfirmation) {}
