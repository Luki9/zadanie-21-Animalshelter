package lc.animalshelter.demo.Model;

class Animalshelter {

    String name;
    String information;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animalshelter(String name, String information, int age) {
        this.name = name;
        this.information = information;
        this.age = age;
    }
}