package com.march.rtk.services;

import com.march.rtk.models.ASO;
import com.march.rtk.repositories.ASORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ASOService {


    private final JdbcTemplate jdbcTemplate;
    private final ASORepository ASORepository;


    @Autowired
    public ASOService(JdbcTemplate jdbcTemplate, ASORepository catalogASORepository) {
        this.jdbcTemplate = jdbcTemplate;
        this.ASORepository = catalogASORepository;
    }


    public List<ASO> testGet() {
        return  jdbcTemplate.query("SELECT * FROM aso WHERE product_name LIKE 'Контроллер%'",
                (rs, rowNum) ->
                        new ASO(
                                rs.getInt("id"),
                                rs.getLong("nomenclature_num"),
                                rs.getString("product_name"),
                                rs.getBigDecimal("price")
                        ));
    }




    public List<ASO> findAll(){
        return ASORepository.findAll();
    }

    public ASO findOne(int id){
        Optional<ASO> foundASO =  ASORepository.findById(id);
        return foundASO.orElse(null);
    }

    public void save(ASO aso){
        ASORepository.save(aso);
    }

    public void update(int id, ASO updatedAso){
        updatedAso.setId(id);
        ASORepository.save(updatedAso);
    }

    public void delete(int id){
        ASORepository.deleteById(id);
    }
}
