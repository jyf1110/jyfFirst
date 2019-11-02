package com.waysoft.work.service;

import java.util.List;

public interface CommonService<T>
{
void insert(T object);
void update(T object);
void delete(Integer id);
T findById(Integer id);
List<T> findAll();
}
