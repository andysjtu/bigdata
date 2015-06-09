package org.infosec.bigdata.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by AndySJTU on 2015/6/9.
 */
@Entity
@Table(name = "t_user")
public class User extends EntityObject {
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
