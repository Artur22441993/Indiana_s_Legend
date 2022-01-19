package cam.indlege.legeng.ind.ifkd;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Entityfourteen.class},version = 1)
public abstract class Databaseinstancefourteen extends RoomDatabase {
    public abstract Daofourteen daofourteen();
}
