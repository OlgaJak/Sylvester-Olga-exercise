public class School extends EducationSystem{
    String name;
    int numberOfStudents;
    int studyDuration;
    int numberOfTeachers;
    boolean govermentSchool;
    int numberOfCourses;

    public School(String name,int numberOfStudents,int studyDuration,int numberOfTeachers,boolean isGovermentSchool,
                  int numberOfCourses) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.studyDuration = studyDuration;
        this.numberOfTeachers = numberOfTeachers;
        this.govermentSchool = isGovermentSchool;
        this.numberOfCourses = numberOfCourses;
    }
}
