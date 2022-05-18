package Google;

public class Person {
    private Company company;
    private Pokemon pokemon;
    private Parents parents;
    private Children children;
    private Car car;


    public Person(Company company) {
        this.company = company;
    }

    public Person(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public Person(Parents parents) {
        this.parents = parents;
    }

    public Person(Children children) {
        this.children = children;
    }

    public Person(Car car) {
        this.car = car;
    }

    public Person() {

    }

    public Person(Company company, Pokemon pokemon, Parents parents, Children children, Car car) {
        this.company = company;
        this.pokemon = pokemon;
        this.parents = parents;
        this.children = children;
        this.car = car;
    }


    public Company getCompany() {
        return company;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public Parents getParents() {
        return parents;
    }

    public Children getChildren() {
        return children;
    }

    public Car getCar() {
        return car;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void setParents(Parents parents) {
        this.parents = parents;
    }

    public void setChildren(Children children) {
        this.children = children;
    }

    public void setCar(Car car) {
        this.car = car;
    }

}
