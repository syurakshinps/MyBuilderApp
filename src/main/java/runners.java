import building.Employee;

public class runners {
    public static void main(String[] args) {
        Employee.Builder builder = new Employee.Builder();

        Employee employee = builder.name("baeldung")
                .age(10)
                .department("Builder Pattern")
                .build();

    }
}
