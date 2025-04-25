package cat.itacademy.s04.t02.n03.repository;

import cat.itacademy.s04.t02.n03.model.Froot;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface FrootRepository extends MongoRepository<Froot, String> {
}
