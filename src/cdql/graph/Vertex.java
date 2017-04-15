/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdql.graph;

import cdql.cqe.entities.ContextEntity;
import java.util.ArrayList;

/**
 *
 * @author ali
 */
public class Vertex {

    private ArrayList<Edge> inboundNeighbors;
    private ArrayList<Edge> outboundNeighbors;
    private ContextEntity entity;

    /**
     *
     */
    public Vertex(ContextEntity entity) {
        this.entity = entity;
        this.inboundNeighbors = new ArrayList<>();
        this.outboundNeighbors = new ArrayList<>();
    }

    /**
     * This method adds an Edge to the incidence neighborhood of this graph iff
     * the edge is not already present.
     *
     * @param edge The edge to add
     */
    public void addInboundNeighbor(Edge edge) {
        if (this.inboundNeighbors.contains(edge)) {
            return;
        }

        this.inboundNeighbors.add(edge);
    }

    public void addOutboundNeighbor(Edge edge) {
        if (this.outboundNeighbors.contains(edge)) {
            return;
        }

        this.outboundNeighbors.add(edge);
    }

    /**
     *
     * @param other The edge for which to search
     * @return true iff other is contained in this.neighborhood
     */
    public boolean containsNeighbor(Edge other) {
        return this.outboundNeighbors.contains(other);
    }

    /**
     *
     * @param index The index of the Edge to retrieve
     * @return Edge The Edge at the specified index in this.neighborhood
     */
    public Edge getInboundNeighbor(int index) {
        return this.inboundNeighbors.get(index);
    }

    /**
     *
     * @param index The index of the edge to remove from this.neighborhood
     * @return Edge The removed Edge
     */
    Edge removeInboundNeighbor(int index) {
        return this.inboundNeighbors.remove(index);
    }

    /**
     *
     * @param e The Edge to remove from this.neighborhood
     */
    public void removeInboundNeighbor(Edge e) {
        this.inboundNeighbors.remove(e);
    }

    /**
     *
     * @return int The number of neighbors of this Vertex
     */
    public int getInboundNeighborCount() {
        return this.inboundNeighbors.size();
    }

    /**
     *
     * @return String The label of this Vertex
     */
    public ContextEntity getEntity() {
        return this.entity;
    }

    /**
     *
     * @return String A String representation of this Vertex
     */
    public String toString() {
        return "Vertex " + entity.toString();
    }

    /**
     *
     * @return The hash code of this Vertex's label
     */
    public int hashCode() {
        return this.entity.hashCode();
    }

    /**
     *
     * @param other The object to compare
     * @return true iff other instanceof Vertex and the two Vertex objects have
     * the same label
     */
    public boolean equals(Object other) {
        if (!(other instanceof Vertex)) {
            return false;
        }

        Vertex v = (Vertex) other;
        return this.entity.equals(v.entity);
    }

    /**
     *
     * @return ArrayList<Edge> A copy of this.neighborhood. Modifying the
     * returned ArrayList will not affect the neighborhood of this Vertex
     */
    public ArrayList<Edge> getInboundNeighbors() {
        return new ArrayList<Edge>(this.inboundNeighbors);
    }
    
    public ArrayList<Edge> getOutboundNeighbors() {
        return new ArrayList<Edge>(this.outboundNeighbors);
    }
    public Edge getOutboundNeighbor(int index) {
        return this.outboundNeighbors.get(index);
    }

    /**
     *
     * @param index The index of the edge to remove from this.neighborhood
     * @return Edge The removed Edge
     */
    Edge removeOutboundNeighbor(int index) {
        return this.outboundNeighbors.remove(index);
    }

    /**
     *
     * @param e The Edge to remove from this.neighborhood
     */
    public void removeOutboundNeighbor(Edge e) {
        this.outboundNeighbors.remove(e);
    }

    /**
     *
     * @return int The number of neighbors of this Vertex
     */
    public int getOutboundNeighborCount() {
        return this.outboundNeighbors.size();
    }
    
    
}
