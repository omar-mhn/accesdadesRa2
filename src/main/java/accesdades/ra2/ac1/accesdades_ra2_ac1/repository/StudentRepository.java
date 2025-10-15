package accesdades.ra2.ac1.accesdades_ra2_ac1.repository;
import org.springframework.stereotype.Repository;

import accesdades.ra2.ac1.accesdades_ra2_ac1.model.student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.core.RowMapper;

// Clase 'StudentRepository' que actuará como el componente encargado de acceder a los datos de los estudiantes.
@Repository
public class StudentRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    private static final class StudentRowMapper implements RowMapper<student>{
        @Override
        public student mapRow(ResultSet rs, int rowNum) throws SQLException{

        student student = new student();
        student.setId(rs.getLong("id"));
        student.setAge(rs.getInt("age"));
        student.setName(rs.getString("name"));

        return student;

    }
}
    
    public List<student> findAll(){
        String sql ="select * from students";
        return jdbcTemplate.query(sql, new StudentRowMapper());
    }
    public int save(){
        String sql ="insert into students(name, age) values(?,?)";
        int numReg = jdbcTemplate.update(sql,"Omar", 26);
        return numReg;
    }
}
