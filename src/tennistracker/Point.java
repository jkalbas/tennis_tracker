package tennistracker;

/**
 *
 * @author joeykalbas
 */
class Point {
    String player;
    String shot;
    String result;
    int shotX;
    int resultX;
    int shotY;
    int resultY;
    
    Point(){}
    
    Point(String aPlayer, String aShot, String aResult, int aShotX, int aResultX, int aShotY, int aResultY){
        player = aPlayer;
        shot = aShot;
        result = aResult;
        shotX = aShotX;
        resultX = aResultX;
        shotY = aShotY;
        resultY = aResultY;
    }
    
    public String getPlayer()
    {
        return player;
    }
    
    public String getShot()
    {
        return shot;
    }
    
    public String getResult()
    {
        return result;
    }
    
    public int getShotX()
    {
        return shotX;
    }
    
    public int getShotY()
    {
        return shotY;
    }
    
    public int getResultX()
    {
        return resultX;
    }
    
    public int getResultY()
    {
        return resultY;
    }
}
