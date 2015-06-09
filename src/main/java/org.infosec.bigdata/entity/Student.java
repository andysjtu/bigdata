package org.infosec.bigdata.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by AndySJTU on 2015/6/9.
 */
@Entity
@Table(name="t_student")
public class Student extends EntityObject {
    private String sutdentNo;

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getSutdentNo() {
        return sutdentNo;
    }

    public void setSutdentNo(String sutdentNo) {
        this.sutdentNo = sutdentNo;
    }
}
