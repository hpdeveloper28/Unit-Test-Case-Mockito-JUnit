package com.hpdeveloper.databindingdemo.models;

/**
 * Created by hirenpatel on 18/10/17.
 */

public class EmployeeModel {

    private String name, address;
    private int age;

    private EmployeeModel(EmployeeBuilder employeeBuilder) {
        name = employeeBuilder.name;
        address = employeeBuilder.address;
        age = employeeBuilder.age;
    }


    public static class EmployeeBuilder {

        private String name, address;
        private int age;

        public EmployeeBuilder(){

        }

        public EmployeeBuilder setName(String mName) {
            name = mName;
            return this;
        }


        public EmployeeBuilder setAddress(String mAddress) {
            address = mAddress;
            return this;
        }

        public EmployeeBuilder setAge(int mAge) {
            age = mAge;
            return this;
        }


        public EmployeeModel build() {
            return new EmployeeModel(this);
        }
    }
}
