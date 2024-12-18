
public class StudentMemo {
	    static String studentName;
	    static int studentId;
	    static int marksTelugu;
	    static int marksHindi;
	    static int marksEnglish;
	    static int marksMaths;
	    static int marksScience;
	    static int marksSocialStudies;
	    
	    static void studentDetails(String name, int studentid, int telugu, int hindi, int english, int maths, int science, int socialstudies) {
	        studentName = name;
	        studentId = studentid;
	        marksTelugu = telugu;
	        marksHindi = hindi;
	        marksEnglish = english;
	        marksMaths = maths;
	        marksScience = science;
	        marksSocialStudies = socialstudies;
	        
	    }

	    static int calculateTotalMarks() {
	        return marksTelugu + marksHindi + marksEnglish + marksMaths + marksScience + marksSocialStudies;
	    }
	    
	    static double calculatePercentage() {
	        int totalMarks = calculateTotalMarks();
	        return (totalMarks / 6.0);
	    }

	    static String calculateGrade() {
	        double percentage = calculatePercentage();
	        if (percentage >= 90) {
	            return "A+";
	        } else if (percentage >= 80) {
	            return "A";
	        } else if (percentage >= 70) {
	            return "B+";
	        } else if (percentage >= 60) {
	            return "B";
	        } else if (percentage >= 50) {
	            return "C";
	        } else {
	            return "F";
	        }
	    }

	    static void Report() {
	        int totalMarks = calculateTotalMarks();
	        double percentage = calculatePercentage();
	        String grade = calculateGrade();
	        
	        System.out.println("**Student Progress Report**");
	        System.out.println("Student Name: " + studentName);
	        System.out.println("Student Id: " + studentId);
	        System.out.println("Marks in Telugu: " + marksTelugu);
	        System.out.println("Marks in Hindi: " + marksHindi);
	        System.out.println("Marks in English: " + marksEnglish);
	        System.out.println("Marks in Maths: " + marksMaths);
	        System.out.println("Marks in Science: " + marksScience);
	        System.out.println("Marks in Social Studies: " + marksSocialStudies);
	        System.out.println("Total Marks: " + totalMarks + "/600");
	        System.out.println("Percentage: " + percentage + "%");
	        System.out.println("Grade: " + grade);
	    }

	    public static void main(String[] args) {
	        studentDetails("Krish", 102, 99, 92, 95, 96, 97,94);
	        Report();
	    }
	}



