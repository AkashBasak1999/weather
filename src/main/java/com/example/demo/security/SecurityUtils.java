package com.example.demo.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
@Component
public class SecurityUtils {

    public static String getLoggedInUsername() {
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	String username = auth.getName();
    	Object credentials = auth.getCredentials();
    	return username;
    }

    public static String getLoggedInPassword() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated()) {
            Object principal = authentication.getPrincipal();
            // Password is not directly available; it’s typically encoded
            if (principal instanceof User) {
                // Password is not stored as a plain value in the User object
                return ((User) principal).getPassword();
            }
        }
        return null;
    }
}
