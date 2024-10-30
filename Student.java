package task30102024;

public class Student {

		private int id;
		private String name;
	    private	int age;
		private String grade;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGrade() {
			return grade;
		}
		public void setGrade(String grade) {
			this.grade = grade;
		}
		public Student(int id, String name, int age, String grade) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.grade = grade;
		}
		@Override
		public String toString() {
			return "Id:" + id + ",Name=" + name + ",Age=" + age + ",Grade=" + grade + "\n";
		}
		
		
}