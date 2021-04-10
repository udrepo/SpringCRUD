package com.example.Ulan;

import com.example.Ulan.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping(value = "/0")
public class RestClass {

//    @GetMapping(value = "/person")
//  public String getPersons(){
//        return new Person(, 21).toString();
//    }


    @GetMapping(value = "/index")
    public String getIndex(){
        return "index";
    }

    @GetMapping(value = "/byebye")
    public String getByePage(){
        return "byePage";
    }

    @GetMapping(value = "/calculator")
    public String calculate(@RequestParam(value = "a", required = false) int a,
                            @RequestParam(value = "b", required = false) int b,
                            @RequestParam(value = "action", required = false) String action,
                            Model model){
         double result;

         switch (action){
             case "kob": result = a*b; break;
             case "div": result = a/(double)b;break;
             case "add": result = a+b;break;
             case "sub": result = a-b;break;
             default: result = 0;
         }

         model.addAttribute("result", result);
        return "calculator";
    }





}
