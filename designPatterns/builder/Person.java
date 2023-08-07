package net.media.training.designpattern.builder;

/**
 * Created by IntelliJ IDEA.
 * User: path
 * Date: Jul 19, 2011
 * Time: 11:31:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    private String name;
    private int id;
    private String city;
    private String country;

    public Person(String name, int id, String city, String country) {
        this.name = name;
        this.id = id;
        this.city = city;
        this.country = country;
    }

    public Person name (String personName){
        this.name=personName;
        return this;
    }
    public Person city (String personCity){
        this.city= personCity;
        return this;
    }
    public Person country (String  personCountry){
        this.country =personCountry;
        return this;
    }
    public Person id (int personId){
        this.id=personId;
        return this;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
