package br.com.mktech.restapicomplete.testunit.mapper.mock;

import br.com.mktech.restapicomplete.model.Person;

import java.util.ArrayList;
import java.util.List;

public class MockPerson {

    public Person mockEntity() {
        return mockEntity(0);
    }

    public br.com.mktech.restapicomplete.data.vo.v1.PersonVO mockVO() {
        return mockVO(0);
    }

    public List<Person> mockEntityList() {
        List<Person> people = new ArrayList<Person>();
        for (int i = 0; i < 14; i++) {
            people.add(mockEntity(i));
        }
        return people;
    }

    public List<br.com.mktech.restapicomplete.data.vo.v1.PersonVO> mockVOList() {
        List<br.com.mktech.restapicomplete.data.vo.v1.PersonVO> personVOS = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            personVOS.add(mockVO(i));
        }
        return personVOS;
    }

    public Person mockEntity(Integer number) {
        Person person = new Person();
        person.setAddress("Addres Test" + number);
        person.setFirstName("First Name Test" + number);
        person.setGender(((number % 2)==0) ? "Male" : "Female");
        person.setId(number.longValue());
        person.setLastName("Last Name Test" + number);
        return person;
    }

    public br.com.mktech.restapicomplete.data.vo.v1.PersonVO mockVO(Integer number) {
        br.com.mktech.restapicomplete.data.vo.v1.PersonVO personVO = new br.com.mktech.restapicomplete.data.vo.v1.PersonVO();
        personVO.setAddress("Addres Test" + number);
        personVO.setFirstName("First Name Test" + number);
        personVO.setGender(((number % 2)==0) ? "Male" : "Female");
        personVO.setId(number.longValue());
        personVO.setLastName("Last Name Test" + number);
        return personVO;
    }
}
