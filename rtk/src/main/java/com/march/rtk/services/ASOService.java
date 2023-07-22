package com.march.rtk.services;

import com.march.rtk.models.ASO;
import com.march.rtk.repositories.ASORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ASOService {

    private final ASORepository ASORepository;

    @Autowired
    public ASOService(ASORepository catalogASORepository) {
        this.ASORepository = catalogASORepository;
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
