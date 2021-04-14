package io.renren.common;

import java.util.List;

public interface BaseService<T> {

    List<T> getAllData(T param);

    T getDataById(Integer id);

    void saveData(T param);

    void updateData(T param);

    void deleteDataById(Integer id);

}
