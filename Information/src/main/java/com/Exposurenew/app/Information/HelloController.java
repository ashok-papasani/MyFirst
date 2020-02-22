package com.Exposurenew.app.Information;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  @RequestMapping("/")
   public String get(){
    
    return "Hello from get";
  }
  @RequestMapping("/index")
  String index(){
    
    return "Hello from index";
 
  }
  
  @RequestMapping("/details")
  List<EmployeeDetails> display()
  {
	  List<EmployeeDetails> list=new ArrayList<EmployeeDetails>();
	  list.add(new EmployeeDetails("Ashok",22));
	  list.add(new EmployeeDetails("Malli",21));
	  return list;
  }
}
	 
