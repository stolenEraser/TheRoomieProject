package com.example.webappversion1.PersonF;
import java.util.List;
import org.springframework.stereotype.Service;
/**
 * service annotation annotates the classes at the service layer. 
 * Service classes often has to be instantiated/ they have to be defined as a bean
 * @Service is just a more specific way of defining a class.
 * @Component is a generic stereotype of any spring managed component.
 * 
 * @Service 
 * - are special cases of @Component. They're technically the same.
 * - also indicates that they're holding the business logic
 */
@Service 
public class PersonService {

    public List<Person> getPersons(){
		return List.of(new Person(12, "Daniel"), new Person(11, "Kiki"));
	}
}
