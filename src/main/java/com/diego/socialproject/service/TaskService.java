package com.diego.socialproject.service;

import com.diego.socialproject.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    public void save(Task task);
    public void update(Task task);
    public void delete(Integer id);
    public Optional<Task> findById(Integer id);
    public List<Task> findAll();
}
