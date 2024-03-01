package com.Mecatronique.Faissal.service;

import com.Mecatronique.Faissal.dto.SignUpRequest;
import com.Mecatronique.Faissal.entity.User;

public interface AuthenticationService {
    public User signup(SignUpRequest signUpRequest);
}
