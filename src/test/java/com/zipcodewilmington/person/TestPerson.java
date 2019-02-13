package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor1() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        double salary = Double.MIN_VALUE;
        int jobId = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testDefaultConstructor2() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        String expecteddept = "";
        String jobRole = "";
        String company = "";
        double salary = Double.MIN_VALUE;
        int jobId = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetDept() {
        //Given
        Person person = new Person();
        String expectedDept = "OPT";

        //When
        person.setDept(expectedDept);

        //Then
        String actual = person.getDept();
        Assert.assertEquals(expectedDept, actual);
    }

    @Test
    public void testConstructorWithJobRoleAndSalary(){
        //Given

            String expectedJobRole = "Developer";
            double expectedSalary = 120.00;

            //When
        Person person = new Person(expectedJobRole,expectedSalary);

        //Then
        String actualRole = person.getJobRole();
        double actuaSal = person.getSalary();
        Assert.assertEquals(expectedJobRole, actualRole);
        Assert.assertEquals(expectedSalary, actuaSal, 0.0);

    }
}
