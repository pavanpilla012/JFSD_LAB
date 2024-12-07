package com.klef.jfsd.exam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ClientController {

    // Task 1: Simple greeting message
    @RequestMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("message", "Hello, Welcome to Spring MVC!");
        return "test";
    }

    // Task 2: Render "test" JSP file
    @RequestMapping("/test")
    public String test() {
        return "test";
    }

    // Task 3: Display ID and Name
    @RequestMapping("/showInfo")
    public String showInfo(@RequestParam("id") String id, @RequestParam("name") String name, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "showInfo";
    }

    // Task 4: Perform arithmetic operations
    @RequestMapping("/calculateSum/{num1}/{num2}")
    public String calculateSum(@PathVariable("num1") int num1, @PathVariable("num2") int num2, Model model) {
        int sum = num1 + num2;
        model.addAttribute("sum", sum);
        return "calculate";
    }

    // Task 5: Employee form with ID, Name, Gender, and Salary
    @RequestMapping("/employeeForm")
    public String employeeForm() {
        return "employeeForm";
    }

    // Task 6: Add two numbers from the URL
    @RequestMapping("/addNumbers")
    public String addNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int result = num1 + num2;
        model.addAttribute("result", result);
        return "addNumbers";
    }

    // Task 7: Combine two string values and display
    @RequestMapping("/combine")
    public String combine(@RequestParam("str1") String str1, @RequestParam("str2") String str2, Model model) {
        String combined = str1 + " " + str2;
        model.addAttribute("combined", combined);
        return "combine";
    }

    // Task 8: Perform addition and multiplication
    @RequestMapping("/calculate")
    public String calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int addition = num1 + num2;
        int multiplication = num1 * num2;
        model.addAttribute("addition", addition);
        model.addAttribute("multiplication", multiplication);
        return "calculate";
    }
}
