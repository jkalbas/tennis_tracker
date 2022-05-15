package tennistracker;

import java.awt.Graphics;

/**
 *
 * @author joeykalbas
 */
class Edge {
    Vertex shot;
    Vertex end;
    public Edge(){}
    
    public Edge(Vertex newShot, Vertex newEnd)
    {
        shot = newShot;
        end = newEnd;
    }
    
    public Vertex getShot()
    {
        return shot;
    }
    
    public Vertex getResult()
    {
        return end;
    }
}
