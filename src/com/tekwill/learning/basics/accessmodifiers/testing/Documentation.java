package com.tekwill.learning.basics.accessmodifiers.testing;

import com.tekwill.learning.basics.accessmodifiers.software.Employee;

public class Documentation {
    Employee employee;

    public void checkPublic() {
        employee.publicfirstName = "Igor";
        employee.publicdoWork();

        // without reference doesn't work
        //publicfirstName = "Igor";
        //publicdoWork()

    }

    public void checkProtected() {
        // employee.protectedfirsName = "Igor";
        // employee.protecteddoWork();
    }

    public void checkDefault() {
        // employee.defaultfirstName = "Igor";
        // employee.defaultdoWork();
    }

    public void checkPrivate() {
        // employee.privatefirstName = "Igor";
        // employee.privatedoWork();
    }

}
