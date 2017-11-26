package com.mapper.example.service;

import com.mapper.example.domain.Country;
import com.mapper.example.mapper.CountryMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wcs on 2017/11/26.
 */
@Service
public class CountryService {

    @Autowired
    private CountryMapper countryMapper;

    public List<Country> getAll(){
        return countryMapper.selectAll();
    }
}
