package org.infosec.bigdata.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created by AndySJTU on 2015/6/9.
 */
@Entity
@Table(name = "t_teacher")
public class Teacher extends EntityObject {
    @OneToOne
    private User user;
    private String teacherNo;
}
