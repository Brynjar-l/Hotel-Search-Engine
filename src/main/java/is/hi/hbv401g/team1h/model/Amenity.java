package is.hi.hbv401g.team1h.model;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

public class Amenity {

    private final int id;
    private final String name;

    /**
     * Return object, never manually instantiated
     */
    public Amenity(
            @ColumnName("amenity_id") int id,
            @ColumnName("amenity_name") String name
    ) {
        this.id = id;
        this.name = name;
    }


    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }
}
