package cat.itacademy.s04.t02.n01.repository;

import cat.itacademy.s04.t02.n01.model.Froot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FrootRepository extends JpaRepository<Froot,Long> {
}
