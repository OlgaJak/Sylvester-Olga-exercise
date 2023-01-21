public class University extends School implements AcceptingNewStudents, Food, Extracurricular {
    public University(String name, int numberOfStudents, int studyDuration, int numberOfTeachers, boolean isGovermentSchool, int numberOfCourses) {
        super(name, numberOfStudents, studyDuration, numberOfTeachers, isGovermentSchool, numberOfCourses);
    }

    @Override
    public void upTo100Students() {

    }

    @Override
    public void upTo200Students() {

    }

    @Override
    public void upTo300Students() {
        System.out.println("University is accepting up to 300 students every year.");

    }

    @Override
    public void extraFee() {
        System.out.println("There are different opportunities to get some extracurricular activities. You can check " +
                "the prices at our homepage");

    }

    @Override
    public void extraFree() {


    }

    @Override
    public void breakfastFree() {

    }

    @Override
    public void lunchFree() {
        System.out.println("There is free lunch opportunity in our university.");

    }

    @Override
    public void dinner() {

    }

    @Override
    public void milk() {

    }
}
