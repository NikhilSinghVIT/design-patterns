package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder {
    @Override
    StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("HE");
        subs.add("Management");
        subs.add("Economics");
        this.subjects = subs;
        return this;
    }
}
