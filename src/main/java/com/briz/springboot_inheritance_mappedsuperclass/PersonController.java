package com.briz.springboot_inheritance_mappedsuperclass;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController 
{
@Autowired
PersonRepository prepo;
@RequestMapping("/test")
public String test()
{
	return "thhis is mapped super class test";
}
@RequestMapping("/save")
public String save()
{
	//Person p=new Person();
	Employee e=new Employee();e.setAge(56);e.setName("chandan");e.setSalary(9500);
	Student s=new Student();s.setAge(12);s.setMarks(47);s.setName("atul");
	prepo.save(e);
	prepo.save(s);
	return "data saved";
	
}
@RequestMapping("/by/{id}")
public  Optional<Person> alldata(@PathVariable int id )
{
	return prepo.findById(id);
}
}
