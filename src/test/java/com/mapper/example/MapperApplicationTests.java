package com.mapper.example;

import com.mapper.example.domain.Country;
import com.mapper.example.service.CountryService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import(MapperApplication.class)
public class MapperApplicationTests {

	@Autowired
	private CountryService countryService;

	@Test
	public void contextLoads() {
		List<Country> list = countryService.getAll();
		list.forEach(x->{
            System.out.println(x.getCountryname());
        });


	}

}
