public class Monster extends Enemy
{
    public boolean hasAdvantage;
    public String terrain;

    public Monster (String monsterName, int might, boolean IsHostile, int HP, int movement, double speed, String terrain, boolean hasAdv)
    {
        super(monsterName, might, IsHostile, HP, movement, speed);
        this.terrain = terrain;
        this.hasAdvantage = hasAdv;
    }

    public Monster ()
    {
        super();
        this.terrain = "land";
        this.hasAdvantage = false;
    }

    public String getTerrain()
    {
        return terrain;
    }

    public boolean getHasAdvantage()
    {
        return hasAdvantage;
    }

    public void setTerrain(String terrain)
    {
        this.terrain = terrain;
    }

    public void setHasAdvantage(boolean newAdv)
    {
        this.hasAdvantage = newAdv;
    }

    public String reactToMight()
    {
        if(Might <= 10)
        {
            return "Weak.";
        }
        else if(Might > 10 && Might < 20)
        {
            return "Be Careful.";
        }
        else if(Might >= 20)
        {
            return "Whoa!";
        }
        return "";
    }

    public String compareTerrain()
    {
        if(terrain.equalsIgnoreCase("Woods"))
        {
            return "Run away";
        }
        if(terrain.equalsIgnoreCase("Water"))
        {
            return "Swim away";
        }
        else
        {
            return "Welp";
        }
    }

    public String toString()
    {
        return super.toString() +", Terrain: " + terrain + ", Has Advantage: " + hasAdvantage + "}";
    }

}