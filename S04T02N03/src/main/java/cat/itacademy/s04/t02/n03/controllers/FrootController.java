package cat.itacademy.s04.t02.n03.controllers;

import cat.itacademy.s04.t02.n03.exception.EntityNotFoundException;
import cat.itacademy.s04.t02.n03.model.Froot;
import cat.itacademy.s04.t02.n03.services.FrootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruita")
public class FrootController {

    @Autowired
    private FrootService frootService;

    @PostMapping
    public Froot createFroot(@RequestBody Froot froot) {
        return frootService.createFroot(froot);
    }

    @GetMapping
    public List<Froot> getAllFroots() {
        return frootService.getAllFroots();
    }

    @GetMapping("/{id}")
    public Froot getFrootById(@PathVariable String id) throws EntityNotFoundException {
        return frootService.getFrootById(id);
    }

    @PutMapping("/{id}")
    public Froot updateFroot(@PathVariable String id, @RequestBody Froot froot) throws EntityNotFoundException {
        return frootService.updateFroot(id, froot);
    }

    @DeleteMapping("/{id}")
    public void deleteFroot(@PathVariable String id) throws EntityNotFoundException {
        frootService.deleteFroot(id);
    }
}

