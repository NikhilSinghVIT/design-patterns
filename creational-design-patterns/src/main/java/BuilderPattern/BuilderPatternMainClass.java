package BuilderPattern;

public class BuilderPatternMainClass {
    public static void main(String args[]){
        Director director1 = new Director(new EngineeringStudentBuilder());
        Director director2 = new Director(new MBAStudentBuilder());

        System.out.println(director1.createStudent().toString());
        System.out.println(director2.createStudent().toString());
    }
}
