package salesianas.academia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import salesianas.academia.entity.Profesor;
import salesianas.academia.service.ProfesorService;

import java.util.List;

@Controller
@RequestMapping(value = "/profesores", produces = "application/json")
public class ProfesorController {
    @Autowired
    @Qualifier("ProfesorService")
    private ProfesorService profesorService;
    public static final String PROFESOR_VIEW = "profesores";

    @PostMapping("/list")
    public @ResponseBody List<Profesor> listAllProfesores() {
        ModelAndView mav = new ModelAndView(PROFESOR_VIEW);
        mav.addObject("profesores", profesorService.listAllProfesor());
        //return mav;
	return profesorService.listAllProfesor();
    } 

    @PostMapping("/add")
    public String addProfesor(@ModelAttribute("profesor") Profesor profesor) {
        profesorService.addProfesor(profesor);
        return "redirect:/profesores/list";
    }

    @PostMapping("/update")
    public String updateProfesor(@ModelAttribute("profesor") Profesor profesor) {
        profesorService.updateProfesor(profesor);
        return "redirect:/profesores/list";
    }

    @PostMapping("/delete")
    public String deleteProfesor(@ModelAttribute("profesor") Profesor profesor) {
        profesorService.removeProfesorById(profesor.getId());
        return "redirect:/profesores/list";
    }
}
