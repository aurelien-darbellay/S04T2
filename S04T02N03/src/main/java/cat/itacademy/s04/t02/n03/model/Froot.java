package cat.itacademy.s04.t02.n03.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "froot")
public class Froot {

    @Id
    private String id;
    private String name;
    private int quantityKg;

    public Froot() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityKg() {
        return quantityKg;
    }

    public void setQuantityKg(int quantityKg) {
        this.quantityKg = quantityKg;
    }

    @Override
    public String toString() {
        return "Froot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantityKg=" + quantityKg +
                '}';
    }
}
