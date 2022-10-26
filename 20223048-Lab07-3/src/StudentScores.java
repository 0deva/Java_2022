import java.util.ArrayList;

public class StudentScores {
	private ArrayList<Student> student;

	public StudentScores() {                                 
		student = new ArrayList<Student>();
	}

	public void add(Student data) {
		student.add(data);
	}

	public String getHighest() {
		int highest = 0;
		for (int i = 1; i < student.size(); i++) {
			if (student.get(i).Score() > student.get(highest).Score())
				highest = i;
		}
		return student.get(highest).Name();
	}

	public String getLowest() {
		int lowest = 0;

		for (int i = 1; i < student.size(); i++) {
			if (student.get(i).Score() < student.get(lowest).Score())
				lowest = i;
		}
		return student.get(lowest).Name();
	}
}
