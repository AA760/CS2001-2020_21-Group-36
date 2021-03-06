package com.group36.healthchecker.model;

import javax.persistence.*;
import org.hibernate.annotations.DynamicUpdate;


@Entity
@Table(name = "users")

@DynamicUpdate 
public class User2
{

	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false, updatable = false)
    private String userName;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false, updatable = false)
    private boolean active;
    @Column(nullable = false, updatable = false)
    private String roles;
    
    

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getUserName() 
    {
        return userName;
    }

    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

    public boolean isActive() 
    {
        return active;
    }

    public void setActive(boolean active) 
    {
        this.active = active;
    }

    public String getRoles() 
    {
        return roles;
    }

    public void setRoles(String roles) 
    {
        this.roles = roles;
    }

    
    
}