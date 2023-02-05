package com.example.SpringBootEmployeManagementSystem.Controller;

import com.example.SpringBootEmployeManagementSystem.Entity.Employee;
import com.example.SpringBootEmployeManagementSystem.Service.EmpService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value = "/api/emp")
public class EmpController {

    @Autowired
    private EmpService service;

    @GetMapping("add_home" )

    public String home(Model m){
        List<Employee> emp= service.getAllEmp();
        m.addAttribute("emp",emp);



        return "index";
    }

    @GetMapping("add_emp")
    public String addEmpForm(){
        return "add_emp";
    }
    @PostMapping("/register")
    public String empRegister(@ModelAttribute Employee e, HttpSession session) {
        System.out.println(e);
        session.setAttribute("msg","Employee Added Successfully");

        service.addEmp(e);
        return "redirect:/";
    }
    @GetMapping("edit/{id}")
        public String edit(@PathVariable int id, Model m){

        Employee e= service.getEmpById(id);
        m.addAttribute("emp", e);
            return "edit";
        }

        @PostMapping
        public String updateEmp(@ModelAttribute Employee e, HttpSession session){
        service.addEmp(e);
        session.setAttribute("msg","Data update successfully");
        return "redirect:/";
        }

        @GetMapping("delete/{id}")
        public String deleteEmp(@PathVariable int id, HttpSession session){
        service.deleteEmp(id);
        session.setAttribute("msg", "Employee Data deleted successfully...");
        return "redirect:/";
        }
    }

