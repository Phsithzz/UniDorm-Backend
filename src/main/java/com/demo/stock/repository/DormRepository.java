package com.demo.stock.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.stock.model.Dorm;

import java.util.List;

@Repository
public class DormRepository {

    private final JdbcTemplate jdbcTemplate;

    public DormRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Dorm> findDormAll() {
        String sql = "SELECT * FROM dorms";
        return jdbcTemplate.query(
                sql,
                (rs, rowNum) -> new Dorm(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getString("address"),
                        rs.getString("district"),
                        rs.getString("province"),
                        rs.getInt("price"),
                        rs.getString("imageUrl")
                    )
                );
    }

    public Dorm getDormById(Integer id) {

        String sql = "SELECT * FROM dorms WHERE id = ?";

        return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> new Dorm(rs.getInt("id"),
                rs.getString("name"),
                rs.getString("description"),
                rs.getString("address"),
                rs.getString("district"),
                rs.getString("province"),
                rs.getInt("price"),
                rs.getString("imageUrl")
            
            ),id);

    }

    public int createDorm(Dorm dorm) {
        String sql = "INSERT INTO dorms (name,description,address,district,province,price,imageUrl) VALUES(?,?,?,?,?,?,?)";
        return jdbcTemplate.update(
                sql,
                dorm.getName(),
                dorm.getDescription(),
                dorm.getAddress(),
                dorm.getDistrict(),
                dorm.getProvince(),
                dorm.getPrice(),
                dorm.getimageUrl()
        );
    }

}
