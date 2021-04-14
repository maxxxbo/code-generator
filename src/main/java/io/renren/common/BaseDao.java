package io.renren.common;


import java.util.List;

public interface BaseDao<T>{

    List<T> getAllData(T param);

    T getDataById(Integer id);

    int saveData(T param);

    int updateData(T param);

    int deleteDataById(Integer id);

}
