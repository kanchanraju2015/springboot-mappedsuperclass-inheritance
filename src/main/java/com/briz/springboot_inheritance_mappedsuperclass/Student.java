package com.briz.springboot_inheritance_mappedsuperclass;

import jakarta.persistence.Entity;

@Entity(name="student")
public class Student extends Person
{
int marks;

public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	this.marks = marks;
}

}
