class Student {
	String name;
	int rollNo;
	Student(String name,int rollNo) {
		this.name=name;
		this.rollNo=rollNo;
	}
	public boolean equals(Object obj) {
		try {
			String name1=this.name;
			int rollNo1=this.rollNo;
			Student s2=(Student)obj;
			String name2=s2.name;
			int rollNo2=s2.rollNo;
			if(name1.equals(name2)&&rollNo1==rollNo2) {
				return true;
			}
			else {
				return false;
			}
		}
		catch (ClassCastException c) {
			return false;
		}
		catch(NullPointerException e) {
			return false;
		}
	} 
	public static void main(String[] args) {
		Student s1 = new Student("raju",101);
		Student s2 = new Student("giri",102);
		Student s3 = new Student("giri",102);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(null));
	}
}