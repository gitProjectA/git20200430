
package com.git.pojo;

public class Student {
   private Integer id;
   private String name;//名字
   private Integer age;//年龄

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public Student(String name, Integer age) {
	super();
	this.name = name;
	this.age = age;
}

public Student(Integer id, String name, Integer age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
   
}
