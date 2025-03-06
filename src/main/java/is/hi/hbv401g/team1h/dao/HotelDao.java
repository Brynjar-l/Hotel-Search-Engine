package is.hi.hbv401g.team1h.dao;

import is.hi.hbv401g.team1h.model.Hotel;
import org.jdbi.v3.sqlobject.SqlObject;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

public interface HotelDao extends SqlObject {

    @SqlQuery("DELETE FROM hotels WHERE hotel_id = (:id)")
    void delete(@BindBean Hotel hotel);
}
