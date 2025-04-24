package cat.itacademy.s04.t02.n01.services;

import cat.itacademy.s04.t02.n01.exception.AbsentEntityException;
import cat.itacademy.s04.t02.n01.model.Froot;
import cat.itacademy.s04.t02.n01.repository.FrootRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FrootService {

    @Autowired
    FrootRepository frootRepository;

    public Froot createFroot(Froot froot){
        return frootRepository.save(froot);
    }
    public List<Froot> getAllFroots(){
        return frootRepository.findAll();
    }
    public Froot getFrootById(Long id) throws AbsentEntityException {
        return frootRepository.findById(id).orElseThrow(()->new AbsentEntityException(id));
    }
    public Froot updateFroot(Long id, Froot froot) {
        froot.setId(id);
        return frootRepository.save(froot);
    }

    public void deleteFroot(Long id) {
        frootRepository.deleteById(id);
    }


}
