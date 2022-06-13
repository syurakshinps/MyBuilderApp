package building;

import org.inferred.freebuilder.FreeBuilder;

@FreeBuilder
public interface Employee {

    String getName();
    int getAge();
    String getDepartment();

    class Builder extends Employee_Builder {
    }
}