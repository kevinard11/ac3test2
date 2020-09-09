package ac3.test1.ac31.dao;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface Dao {

    final String save = "INSERT into test1(name) values(#{name})";
    @Insert(save)
    void save(@Param("name") String name);

    final String get = "SELECT id from test1 where name = #{name}";
    @Select(get)
    String check(@Param("name") String name);
}
