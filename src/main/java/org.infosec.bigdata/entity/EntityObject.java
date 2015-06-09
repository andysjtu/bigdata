package org.infosec.bigdata.entity;

import javax.persistence.*;

/**
 * Created by AndySJTU on 2015/6/9.
 */
@MappedSuperclass
public abstract class EntityObject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

}
