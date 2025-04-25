package cat.itacademy.s04.t02.n01.controllers;

import cat.itacademy.s04.t02.n01.exception.EntityNotFoundException;
import cat.itacademy.s04.t02.n01.model.Froot;
import cat.itacademy.s04.t02.n01.services.FrootService;
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
        public Froot getFrootById(@PathVariable Long id) throws EntityNotFoundException {
            return frootService.getFrootById(id);
        }

        @PutMapping("/{id}")
        public Froot updateFroot(@PathVariable Long id, @RequestBody Froot froot) {
            return frootService.updateFroot(id, froot);
        }

        @DeleteMapping("/{id}")
        public void deleteFroot(@PathVariable Long id) {
            frootService.deleteFroot(id);
        }
    }

