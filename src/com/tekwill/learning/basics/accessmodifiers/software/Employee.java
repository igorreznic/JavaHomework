package com.tekwill.learning.basics.accessmodifiers.software;

public class Employee {
    public String publicfirstName;
    public Employee employee;
    //
    protected String protectedfirsName;
    //
    String defaultfirstName;
    //
    private String privatefirstName;

    //
    public Employee publicdoWork() {
        return new Employee();
    }

    //
    protected Employee protecteddoWork() {
        return new Employee();
    }

    //
    Employee defaultdoWork() {
        return new Employee();
    }

    //
    private Employee privatedoWork() {
        return new Employee();
    }

    public void checkPublic() {
        publicfirstName = "Igor";
        publicdoWork();

        employee.publicfirstName = "Igor";   // with reference
        employee.publicdoWork();
    }

    public void checkProtected() {
        protectedfirsName = "Igor";
        protecteddoWork();

        employee.protectedfirsName = "Igor";
        employee.protecteddoWork();
    }

    public void checkDefault() {
        defaultfirstName = "Igor";
        defaultdoWork();

        employee.defaultfirstName = "Igor";
        employee.defaultdoWork();
    }

    public void checkPrivate() {
        privatefirstName = "Igor";
        privatedoWork();

        employee.privatefirstName = "Igor";
        employee.privatedoWork();
    }


}
