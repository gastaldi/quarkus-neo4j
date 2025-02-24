package io.quarkus.it.neo4j;

import org.neo4j.driver.types.Node;

// tag::intro[]
public class Fruit {
    // end::intro[]
    // tag::builder[]
    public static Fruit from(Node node) {
        return new Fruit(node.id(), node.get("name").asString());
    }
    // end::builder[]

    // tag::intro[]
    public Long id;

    public String name;

    public Fruit() {
        // This is needed for the REST-Easy JSON Binding
    }

    public Fruit(String name) {
        this.name = name;
    }

    public Fruit(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
// end::intro[]
