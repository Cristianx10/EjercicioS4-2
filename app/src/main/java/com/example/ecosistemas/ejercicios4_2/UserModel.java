package com.example.ecosistemas.ejercicios4_2;

public class UserModel {
    private String nombre;
    private String email;
    private String username;

    public UserModel(String nombre, String email, String username) {
        this.nombre = nombre;
        this.email = email;
        this.username = username;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }
}
