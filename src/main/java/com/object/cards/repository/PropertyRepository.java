package com.object.cards.repository;

import com.object.cards.entity.Property;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class PropertyRepository {

        private final JdbcTemplate jdbc;

        public PropertyRepository(JdbcTemplate jdbc) {
            this.jdbc = jdbc;
        }

        public List<Property> findAll() {

            String sql = "SELECT * FROM propertyTable";

            RowMapper<Property> propertyRowMapper = (r, i) -> {
                Property rowObject = new Property();
                rowObject.setId(r.getInt("id"));
                rowObject.setAddress(r.getString("address"));
                rowObject.setDescription(r.getString("description"));
                return rowObject;
            };

            return jdbc.query(sql, propertyRowMapper);
        }

        public Property save(Property property) {
            String sql = "INSERT INTO propertyTable VALUES (NULL, ?, ?)";
            jdbc.update(sql, property.getAddress(), property.getDescription());
            return property;
        }

        public void deleteById(int id) {
            String sql = "DELETE FROM propertyTable WHERE id=?";
            jdbc.update(sql, id);
        }

}
