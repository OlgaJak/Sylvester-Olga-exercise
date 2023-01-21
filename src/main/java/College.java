public class College extends School implements AcceptingNewStudents, Food, Extracurricular{
    public College(String name, int numberOfStudents, int studyDuration, int numberOfTeachers, boolean isGovermentSchool, int numberOfCourses) {
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
        System.out.println("College is accepting up to 300 new students every year");

    }

    @Override
    public void breakfastFree() {
        System.out.println("There is a good opportunity to get breakfast before classes in cafe. There is cash and " +
                "card opportunity.");

    }

    @Override
    public void lunchFree() {

    }

    @Override
    public void dinner() {

    }

    @Override
    public void milk() {


    }

    @Override
    public void extraFee() {

    }

    @Override
    public void extraFree() {
        System.out.println("You can choose one of our free courses for an extracurricular activities.");
    }
}
