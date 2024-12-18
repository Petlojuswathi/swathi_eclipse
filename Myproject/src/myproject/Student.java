package myproject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
	private int studentId;
	private String studentName;
	private String studentCourse;
	private double studentcourseFee;
}
