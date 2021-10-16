package collection;

import java.util.Comparator;

public class Student implements Comparator<Student> {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Student(String name) {
	super();
	this.name = name;
}

@Override
public int compare(Student arg0, Student arg1) {
	
	return 0;
}

@Override
public String toString() {
	return "Student [name=" + name + "]";
}

}
