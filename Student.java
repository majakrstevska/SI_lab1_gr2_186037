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
