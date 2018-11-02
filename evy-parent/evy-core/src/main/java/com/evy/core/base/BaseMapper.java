package com.evy.core.base;

import org.apache.ibatis.annotations.Insert;

/**
 * @author Jonny
 * @Description:
 * @date 2018/4/18上午11:59
 */
//@Mapper
public interface BaseMapper<T> {

    @Insert("INSERT INTO #{tableName} (#{tableFields}) VALUES (#{values})")
    T insert(T t);

    void delete(Long dbid, Long id);

    void delete(Long id);

    void update(T t);

    T get(Long dbid, Long id);

    T get(Long id);
}
