package com.tekwill.learning.datatypes;

public class Printer {
    public static void main(String[] args) {
        String line = "----------------------------------------------------------------------------------------------------------------------------------------------------" +
                "------------------------------------------------------------------------------------------------------------------------";
        String seasonally = "Seasonally adjusted                                  ";
        String notSeasonally = "Not Seasonally adjusted                                ";
        String performance = "Performance Measures                       ";
        String tax = "Total Tax Revenue";
        String property = "Property";
        String income = "Income";
        String sales = "Sales";
        String na = "(na)";
        int taxRevenue = 3678536;
        int propertyAmount = -1567901;
        int incomeAmount = 98237;
        int salesAmount = 7234109;
        float propertyIndicator = 1.23457F;
        double incomeIndicator = 0.96;
        double salesIndicator = 320.75;
        System.out.println(line);
        System.out.printf("|| %94s || %94s || %66s || \n", seasonally, notSeasonally, performance);
        System.out.println(line);
        System.out.printf("|| %-25s | %-20s | %-20s | %-20s ", tax, property, income, sales);
        System.out.printf("|| %-25s | %-20s | %-20s | %-20s ", tax, property, income, sales);
        System.out.printf("|| %-20s | %-20s | %-20s || \n", property, income, sales);
        System.out.println(line);
        System.out.printf("|| %-25s | %-20s | %-20s | %-20s ", na, na, na, na);
        System.out.printf("|| %-25s | %-20s | %-20s | %-20s ", na, na, na, na);
        System.out.printf("|| %-20s | %-20s | %-20s ||\n", na, na, na, na);
        System.out.println(line);
        System.out.printf("|| %+,25d | %(,20d | %(,20d | %,20d ", taxRevenue, propertyAmount, incomeAmount, salesAmount);
        System.out.printf("|| %,25d | %,20d | %,20d | %,20d ", taxRevenue, propertyAmount, incomeAmount, salesAmount);
        System.out.printf("|| %20.4f | %20.4f | %+20.5f ||\n", propertyIndicator, incomeIndicator, salesIndicator);

        System.out.printf("|| %+,25d | %(,20d | %,20d | %,20d ", taxRevenue, propertyAmount, incomeAmount, salesAmount);
        System.out.printf("|| %,25d | %,20d | %,20d | %,20d ", taxRevenue, propertyAmount, incomeAmount, salesAmount);
        System.out.printf("|| %20.4f | %20.4f | %+20.5f ||\n", propertyIndicator, incomeIndicator, salesIndicator);

        System.out.printf("|| %+,25d | %(,20d | %,20d | %,20d ", taxRevenue, propertyAmount, incomeAmount, salesAmount);
        System.out.printf("|| %,25d | %,20d | %,20d | %,20d ", taxRevenue, propertyAmount, incomeAmount, salesAmount);
        System.out.printf("|| %20.4f | %20.4f | %+20.5f ||\n", propertyIndicator, incomeIndicator, salesIndicator);

        System.out.printf("|| %+,25d | %(,20d | %,20d | %,20d ", taxRevenue, propertyAmount, incomeAmount, salesAmount);
        System.out.printf("|| %,25d | %,20d | %,20d | %,20d ", taxRevenue, propertyAmount, incomeAmount, salesAmount);
        System.out.printf("|| %20.4f | %20.4f | %+20.5f ||\n", propertyIndicator, incomeIndicator, salesIndicator);

        System.out.printf("|| %+,25d | %(,20d | %,20d | %,20d ", taxRevenue, propertyAmount, incomeAmount, salesAmount);
        System.out.printf("|| %,25d | %,20d | %,20d | %,20d ", taxRevenue, propertyAmount, incomeAmount, salesAmount);
        System.out.printf("|| %20.4f | %20.4f | %+20.5f ||\n", propertyIndicator, incomeIndicator, salesIndicator);

        System.out.printf("|| %+,25d | %(,20d | %,20d | %,20d ", taxRevenue, propertyAmount, incomeAmount, salesAmount);
        System.out.printf("|| %,25d | %,20d | %,20d | %,20d ", taxRevenue, propertyAmount, incomeAmount, salesAmount);
        System.out.printf("|| %20.4f | %20.4f | %+20.5f ||\n", propertyIndicator, incomeIndicator, salesIndicator);

        System.out.printf("|| %+,25d | %(,20d | %,20d | %,20d ", taxRevenue, propertyAmount, incomeAmount, salesAmount);
        System.out.printf("|| %,25d | %,20d | %,20d | %,20d ", taxRevenue, propertyAmount, incomeAmount, salesAmount);
        System.out.printf("|| %20.4f | %20.4f | %+20.5f ||\n", propertyIndicator, incomeIndicator, salesIndicator);


    }
}
