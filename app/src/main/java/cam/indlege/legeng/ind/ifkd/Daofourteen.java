package cam.indlege.legeng.ind.ifkd;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface Daofourteen {
    @Insert
    void insert(Entityfourteen entityfourteen);

    @Query("SELECT * FROM fourteen ORDER BY ID DESC LIMIT 1")
    Entityfourteen getlastWeDao();

    @Query("SELECT COUNT (*) FROM fourteen")
    int gethowMuchWeHaveDao();
}
