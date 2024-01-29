package com.diego.socialproject.service;

import com.diego.socialproject.model.Task;
import com.diego.socialproject.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImp implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImp(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public void save(Task task) {
        taskRepository.save(task);
    }

    @Override
    public void update(Task task) {
            taskRepository.save(task);
    }

    @Override
    public void delete(Integer id) {
        taskRepository.deleteById(id);
    }

    @Override
    public Optional<Task> findById(Integer id) {
        return taskRepository.findById(id);
    }

    @Override
    public List<Task> findAll() {
        return taskRepository.findAllByOrderByPriorityDesc();
    }
}
