package com.diego.socialproject.controller;

import com.diego.socialproject.model.Task;
import com.diego.socialproject.service.TaskServiceImp;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/todolist")
public class HomeController {
    private final TaskServiceImp taskServiceImp;

    public HomeController(TaskServiceImp taskServiceImp) {
        this.taskServiceImp = taskServiceImp;
    }

    @GetMapping("/home")
    public String home(Model model){

        model.addAttribute("tasks",taskServiceImp.findAll());
        return "user/home";
    }

    @GetMapping("/crear")
    public String crear(){
        return "user/crear";
    }

    @PostMapping("/save")
    public String save(Task task){
        taskServiceImp.save(task);
        return "redirect:/todolist/home";

    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("task",taskServiceImp.findById(id).get());

        return "user/edit";
    }

    @PostMapping("/update")
    public String update(Task task){
        taskServiceImp.update(task);
        return "redirect:/todolist/home";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        taskServiceImp.delete(id);
        return "redirect:/todolist/home";

    }
}
