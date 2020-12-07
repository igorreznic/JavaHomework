package com.tekwill.learning.basics.accessmodifiers.software;

public class Meeting {
    Employee employee;

    public void checkPublic() {
        employee.publicfirstName = "Igor";
        employee.publicdoWork();
    }

    public void checkProtected() {
        employee.protectedfirsName = "Igor";
        employee.protecteddoWork();
    }

    public void checkDefault() {
        employee.defaultfirstName = "Igor";
        employee.defaultdoWork();
    }

    public void checkPrivate() {
        // employee.privatefirstName = "Igor";
        // employee.privatedoWork();
    }

}
