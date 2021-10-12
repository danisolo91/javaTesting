package org.itacademy.javatesting.assertj;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.junit.Test;

public class MainClassTest {
	
	// EXERCICI 1 ------------------------------------------/
	@Test
	public void objectesSencersSonIguals() {
		int val1 = 1;
		int val2 = 1;
		assertThat(val1).isEqualTo(val2);
	}
	
	@Test
	public void objectesSencersNoSonIguals() {
		int val1 = 1;
		int val2 = 2;
		assertThat(val1).isNotEqualTo(val2);
	}
	
	// EXERCICI 2 ------------------------------------------/
	@Test
	public void objectesMateixaReferencia() {
		Person person1 = new Person("John", "Doe");
		Person person2 = person1;
		assertThat(person1).isEqualTo(person2);
	}
	
	@Test
	public void objectesDistintaReferencia() {
		Person person1 = new Person("John", "Doe");
		Person person2 = new Person("John", "Doe");
		assertThat(person1).isNotEqualTo(person2);
	}
	
	// EXERCICI 3 ------------------------------------------/
	@Test
	public void arraysIdentics() {
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {1, 2, 3};
		assertThat(arr1).containsExactly(arr2);
	}
	
	// EXERCICI 4 ------------------------------------------/
	@Test
	public void assertObjectsAreInList() {
		Person person1 = new Person("Rafael", "Nadal");
		Person person2 = new Person("David", "Bisbal");
		Person person3 = new Person("Fernando", "Alonso");
		List<Person> people = List.of(person1, person2, person3);
		
		assertThat(people)
			.containsExactly(person1, person2, person3) // mateix ordre
			.contains(person3, person1, person2) // qualsevol ordre
			.containsOnlyOnce(person1); // només una vegada (no repetit)
	}
	
	@Test
	public void assertObjectIsNotInList() {
		Person person1 = new Person("Rafael", "Nadal");
		Person person2 = new Person("David", "Bisbal");
		Person person3 = new Person("Fernando", "Alonso");
		List<Person> people = List.of(person1, person3);
		
		assertThat(people).noneSatisfy(person -> {
			assertThat(person).isEqualTo(person2); // la llista no conté person2
		});
	}
	
	// EXERCICI 5 -------------------------------------------/
	@Test
	public void assertKeyInMap() {
		Map<String, String> test = new HashMap<>();
		test.put("name", "John");
		assertThat(test).containsKey("name");
	}
	
	// EXERCICI 6 -------------------------------------------/
	@Test
	public void assertArrayIndexOutOfBounds() {		
		assertThatThrownBy(() -> {
			Person person = new Person("John", "Doe");
			person.getFriendByPosition(1);
		}).isInstanceOf(ArrayIndexOutOfBoundsException.class);
	}
	
	// EXERCICI 7 -------------------------------------------/
	@Test
	public void assertEmptyOptionalObject() {
		Optional<String> name = Optional.empty();
		
		assertThat(name).isEmpty();
	}
}
