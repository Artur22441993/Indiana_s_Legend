package cam.indlege.legeng.ind.ifkd;

import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;

@androidx.room.Entity(tableName = "fourteen")
public class Entityfourteen {

    @ColumnInfo(name = "cont")
    public
    String contentfourteen;

    public Entityfourteen(String contentfourteen) {
        this.contentfourteen = contentfourteen;
    }

    @PrimaryKey(autoGenerate = true)
    int id;


}
