package org.infosec.bigdata.dao;

import org.infosec.bigdata.entity.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by AndySJTU on 2015/6/9.
 */
@Repository
public interface TeacherDao extends CrudRepository<Teacher,Integer> {
}
