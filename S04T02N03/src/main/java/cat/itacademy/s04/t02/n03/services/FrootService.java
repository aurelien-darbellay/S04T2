package cat.itacademy.s04.t02.n03.services;

import cat.itacademy.s04.t02.n03.exception.EntityNotFoundException;
import cat.itacademy.s04.t02.n03.model.Froot;
import cat.itacademy.s04.t02.n03.repository.FrootRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FrootService {

    @Autowired
    FrootRepository frootRepository;

    public Froot createFroot(Froot froot) {
        return frootRepository.save(froot);
    }

    public List<Froot> getAllFroots() {
        return frootRepository.findAll();
    }

    public Froot getFrootById(String id) throws EntityNotFoundException {
        return frootRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(id));
    }

    public Froot updateFroot(String id, Froot froot) throws EntityNotFoundException {
        Froot existingFroot = getFrootById(id);
        Froot updateFroot = updateFrootValues(existingFroot, froot);
        return frootRepository.save(updateFroot);
    }

    private Froot updateFrootValues(Froot existingFroot, Froot newValuesFroot) {
        existingFroot.setName(newValuesFroot.getName());
        existingFroot.setQuantityKg(newValuesFroot.getQuantityKg());
        return existingFroot;
    }

    public void deleteFroot(String id) throws EntityNotFoundException {
        if (!frootRepository.existsById(id)) {
            throw new EntityNotFoundException(id);
        }
        frootRepository.deleteById(id);
    }
}
