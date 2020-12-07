package com.tekwill.learning.basics.accessmodifiers.software;

public class Developer extends Employee {
    public Employee employee;

    public void checkPublic() {
        publicfirstName = "Igor";
        publicdoWork();

        // with reference
        employee.publicfirstName = "Igor";
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
        //privatefirstName = "Igor";
        // privatedoWork();

        // employee.privatefirstName = "Igor";
        // employee.privatedoWork();
    }
}
