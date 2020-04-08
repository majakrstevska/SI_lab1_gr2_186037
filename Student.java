class Student {
	String index;
	String firstName;
	String lastName;
	int[] grades;
	//TODO constructor
	Student(String index,String firstName,String lastName){
		this.index=index;
		this.firstName=firstName;
		this.lastName=lastName;
	}
	//TODO seters & getters
	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getAverage() {
		//TODO
		float average;
		int sum=0;
		int numberOfGrades=0;
		for(int i=0;i<grades.length;i++){
			sum+=grades[i];
			numberOfGrades++;
		}
		average=(float)sum/numberOfGrades;
		return average;
	}

	public int ECTSCredits() {
		//TODO
		int ectsCredits=0;
		for(int i=0;i<grades.length;i++){
			if(grades[i]>5){
				ectsCredits+=6;
			}
		}
		return ectsCredits;
	}
}
class Faculty extends Student{
	List<Student>studentList=new ArrayList<Student>();
	String nameOfFaculty;
	Faculty(List<Student> studentList, String nameOfFaculty){
		for(int i=0;i<studentList.size();i++){
			this.studentList[i]=studentList;
		}
		this.nameOfFaculty=nameOfFaculty;

		public double AverageECTSCredits(){
			int numberOfStudents=0;
			int numberOfEcts=0;
			int sum=0;
			for(int i=0;i<studentList.size();i++){
				numberOfEcts=studentList[i].ECTSCredits();
				sum+=numberOfEcts;
				numberOfStudents++;

			}
			double average;
			average=sum/numberOfStudents;
			return average;
		}
		public double AverageGrade(){
			int numOfAverageGrades=0;
			double averageGrade=0;
			int sum=0;
			for(int i=0;i<studentList.size();i++){
				averageGrade=studentList[i].getAverage();
				sum+=averageGrade;
				numOfAverageGrades++;

			}
		double averageG;
			averageG=sum/numOfAverageGrades;
			return averageG;
		}
	}


}