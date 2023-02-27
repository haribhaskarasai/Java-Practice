public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student);
		student.studentNo = 123;
		student.studentName = "Hari";
		student.gender = 'M';
		student.mark1 = 78;
		student.mark2 = 95;
		System.out.println("Student Number   : " + student.studentNo);
		System.out.println("Student Name     : " + student.studentName);
		System.out.println("Student Gender   : " + student.gender);
		System.out.println("Student Mark1    : " + student.mark1);
		System.out.println("Student Mark2    : " + student.mark2);
		System.out.println("Student Total Marks    : " + (student.mark1+student.mark2));
		Student student2 = new Student();
		System.out.println();
		System.out.println(student2);
		student2.studentNo = 1983;
		student2.studentName = "Sai";
		student2.gender = 'M';
		student2.mark1 = 78;
		student2.mark2 = 95;
		System.out.println("Student Number   : " + student2.studentNo);
		System.out.println("Student Name     : " + student2.studentName);
		System.out.println("Student Gender   : " + student2.gender);
		System.out.println("Student Mark1    : " + student2.mark1);
		System.out.println("Student Mark2    : " + student2.mark2);
		System.out.println("Student Total Marks    : " + (student2.mark1+student2.mark2));
		Teacher teacher= new Teacher();
		teacher.id=129;
		teacher.teachertName="Srinu";
		teacher.qualificaion="Bsc.Bed";
		System.out.println();
		System.out.println("Teacher Name   : " + teacher.teachertName);
		
		

	}

}
