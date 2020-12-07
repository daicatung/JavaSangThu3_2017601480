package objects;
import java.util.*;

public interface GPS {
 public List<Person> searchPerson();
 public List<Person> searchPerson(Person similar);
 public List<Person> searchPerson(byte min_age, byte max_age);
}
