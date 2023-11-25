package edu.fra.uas.hello;

import java.util.List;

public class Student {
    private String name;
    private int matriculationNumber;
    private List<Double> grades;

    
    // Konstruktor
    public Student(String name, int matriculationNumber, List<Double> grades) {
        this.name = name;
        this.matriculationNumber = matriculationNumber;
        this.grades = grades;
    }
    // Getter und Setter für "name"
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
// Getter und Setter für "matriculationNumber"
public int getMatriculationNumber() {
    return matriculationNumber;
}

public void setMatriculationNumber(int matriculationNumber) {
    this.matriculationNumber = matriculationNumber;
}
// Getter und Setter für "grades"
public List<Double> getGrades() {
    return grades;
}

public void setGrades(List<Double> grades) {
    this.grades = grades;
}

    // Methode zum Hinzufügen einer Note
    public void addGrade(double grade) {
        grades.add(grade);
    }
}
