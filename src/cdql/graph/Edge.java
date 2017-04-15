/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdql.graph;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author ali
 */
public class Edge implements Comparable<Edge> {

    private Vertex one, two;
    private int weight;
    private List<String> contextAttributes;

    /**
     *
     * @param one The first vertex in the Edge
     * @param two The second vertex in the Edge
     */
    public Edge(Vertex one, Vertex two) {
        this(one, two, 1);
    }

    public Edge(Vertex one, Vertex two, List<String> attributes) {
        this(one, two, 1, attributes);
    }

    /**
     *
     * @param one The first vertex in the Edge
     * @param two The second vertex of the Edge
     * @param weight The weight of this Edge
     */
    public Edge(Vertex one, Vertex two, int weight) {
        this.one = one;
        this.two = two;
        this.weight = weight;
    }

    public Edge(Vertex one, Vertex two, int weight, List<String> attributes) {
        this.one = one;
        this.two = two;
        this.weight = weight;
        this.contextAttributes = attributes;
    }

    /**
     *
     * @param current
     * @return The neighbor of current along this Edge
     */
    public Vertex getNeighbor(Vertex current) {
        if (!(current.equals(one) || current.equals(two))) {
            return null;
        }

        return (current.equals(one)) ? two : one;
    }

    /**
     *
     * @return Vertex this.one
     */
    public Vertex getOne() {
        return this.one;
    }

    /**
     *
     * @return Vertex this.two
     */
    public Vertex getTwo() {
        return this.two;
    }

    /**
     *
     * @return int The weight of this Edge
     */
    public int getWeight() {
        return this.weight;
    }

    /**
     *
     * @param weight The new weight of this Edge
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<String> getContextAttributes() {
        return contextAttributes;
    }

    public void setContextAttributes(List<String> contextAttributes) {
        this.contextAttributes = contextAttributes;
    }
    
    
    
    /**
     * Note that the compareTo() method deviates from the specifications in the
     * Comparable interface. A return value of 0 does not indicate that
     * this.equals(other). The equals() method checks the Vertex endpoints,
     * while the compareTo() is used to compare Edge weights
     *
     * @param other The Edge to compare against this
     * @return int this.weight - other.weight
     */
    public int compareTo(Edge other) {
        return this.weight - other.weight;
    }

    /**
     *
     * @return String A String representation of this Edge
     */
    public String toString() {
        return "({" + one + ", " + two + "}, " + weight + ")";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.one);
        hash = 37 * hash + Objects.hashCode(this.two);
        return hash;
    }

    /**
     *
     * @return int The hash code for this Edge
     */


    /**
     *
     * @param other The Object to compare against this
     * @return ture iff other is an Edge with the same Vertices as this
     */
    public boolean equals(Object other) {
        if (!(other instanceof Edge)) {
            return false;
        }

        Edge e = (Edge) other;

        return e.one.equals(this.one) && e.two.equals(this.two);
    }
}
