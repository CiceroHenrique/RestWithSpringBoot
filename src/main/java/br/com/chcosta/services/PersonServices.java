package br.com.chcosta.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.chcosta.model.Person;

@Service
public class PersonServices {

   private final AtomicLong counter = new AtomicLong();

   public Person findById(String id) {

      Person person = new Person();

      person.setId(counter.incrementAndGet());
      person.setFirstName("Henrique");
      person.setLastName("Costa");
      person.setAddress("Fortaleza - Ceará - Brasil");
      person.setGender("Male");

      return person;

   }

   public List<Person> findAll() {

      List<Person> persons = new ArrayList<Person>();
      for (int i = 0; i < 8; i++) {
         Person person = mockPerson(i);
         persons.add(person);
      }

      return persons;

   }

   private Person mockPerson(int i) {

      Person person = new Person();

      person.setId(counter.incrementAndGet());
      person.setFirstName("Person Name " + i);
      person.setLastName("Last Name " + i);
      person.setAddress("Person Address " + i);
      person.setGender("Male");

      return person;
   }

}
