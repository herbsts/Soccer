package herbsts.soccer;

import java.util.TreeSet;

/**
 * Created by Lorenz on 18.03.2017.
 */

public class Database {
    private static Database database = null;
    private TreeSet<Player> tsPlayer = null;

    //Muss private sein, weil es darf ja nur von newInstance() aufgerufen werden, wegen Singleton
    private Database()
    {
        this.tsPlayer = new TreeSet<Player>();
    }

    public static Database newInstance()
    {
        if (database == null)
        {
            database = new Database();
        }

        return database;
    }

    public int addPlayer(Player player) throws Exception
    {
        int helpReturn = 0;

        if (this.tsPlayer.contains(player) == false)
        {
            this.tsPlayer.add(player);
            helpReturn = 1;
        }

        return helpReturn;
    }

    public int removePlayer(Player player) throws Exception
    {
        int helpReturn = 0;

        if (this.tsPlayer.contains(player) == true)
        {
            this.tsPlayer.remove(player);
            helpReturn = 1;
        }

        return helpReturn;
    }
}