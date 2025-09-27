
package com.iplus.studentManagement.Entity;

import jakarta.persistence.*;

@Entity
public class enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private student student;

    @ManyToOne
    private course course;

    private String grade;

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

    // Getters and Setters
}