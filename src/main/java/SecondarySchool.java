public class SecondarySchool extends School implements AcceptingNewStudents, Food, Extracurricular{
    public SecondarySchool(String name, int numberOfStudents, int studyDuration, int numberOfTeachers, boolean isGovermentSchool, int numberOfCourses) {
        super(name, numberOfStudents, studyDuration, numberOfTeachers, isGovermentSchool, numberOfCourses);
    }

    @Override
    public void upTo100Students() {

    }

    @Override
    public void upTo200Students() {
        System.out.println("Secondary school is accepting up to 200 new students every year.");

    }

    @Override
    public void upTo300Students() {


    }

    @Override
    public void extraFee() {

    }

    @Override
    public void extraFree() {

    }

    @Override
    public void breakfastFree() {
        System.out.println("Everyday 7.30-8.15 children can have free breakfast at school.");

    }

    @Override
    public void lunchFree() {

    }

    @Override
    public void dinner() {

    }

    @Override
    public void milk() {
        System.out.println("There is possibility for children to get free milk and water.");

    }
}
