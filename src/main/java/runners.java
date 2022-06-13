import building.Employee;

public class runners {
    public static void main(String[] args) {
        Employee.Builder builder = new Employee.Builder();

        Employee employee = builder
                .setName("baeldung")
                .setAge(10)
                .setDepartment("Builder Pattern")
                .build();

        System.out.println(employee.getAge());

    }
}
