package com.company;

public class Family <T extends Number>  implements Countable <T>{

    private T people;

    public T getPeople() {
        return people;
    }

    public void setPeople(T people) {
        this.people = people;
    }

    @Override
    public T getId() {
        return null;
    }
}
