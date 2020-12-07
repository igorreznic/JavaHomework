package com.tekwill.learning.basics.accessmodifiers.testing;

import com.tekwill.learning.basics.accessmodifiers.software.Employee;

public class Tester extends Employee {
    Employee employee;

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

        // employee.protectedfirsName = "Igor";
        // employee.protecteddoWork();
    }

    public void checkDefault() {
        // defaultfirstName = "Igor";
        // defaultdoWork();

        // employee.defaultfirstName = "Igor";
        // employee.defaultdoWork();
    }

    public void checkPrivate() {
        // privatefirstName = "Igor";
        // privatedoWork();

        // employee.privatefirstName = "Igor";
        // employee.privatedoWork();
    }

}
