package salesianas.academia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



import salesianas.academia.entity.Profesor;
import salesianas.academia.service.ProfesorService;

import java.util.List;

@Controller
@RequestMapping(value = "/profesores")
public class ProfesorController {
    @Autowired
    @Qualifier("ProfesorService")
    private ProfesorService profesorService;
    public static final String PROFESOR_VIEW = "profesores";

    @GetMapping("/list")
    public @ResponseBody List<Profesor> listAllProfesores() {
        return profesorService.listAllProfesor();
    } 
    
    @GetMapping("/view")
    public ModelAndView viewAllProfesores() {
        ModelAndView mav = new ModelAndView(PROFESOR_VIEW);
        mav.addObject("profesores", profesorService.listAllProfesor());
        mav.addObject("profesor", new Profesor());
        return mav;
    } 

    @GetMapping("/add")
    public String addProfesor(@ModelAttribute("profesor") Profesor profesor) {
        profesorService.addProfesor(profesor);
        return "redirect:/profesores/view";
    }

    @GetMapping("/update")
    public String updateProfesor(@ModelAttribute("profesor") Profesor profesor) {
        profesorService.updateProfesor(profesor);
        return "redirect:/profesores/view";
    }
    
    @GetMapping("/buscaprofe")
    public Profesor viewXProfesores(@RequestParam(name = "id", required = true) long id, Model model) {
       /* ModelAndView mav = new ModelAndView(MODIFICADOR_VIEW);
        mav.addObject("profesores", profesorService.findByid(id));
        mav.addObject("profesor", new Profesor());
        return mav;*/
    	Profesor profesor= profesorService.findByid(id);
    	return profesor;
    } 
    


    @GetMapping("/delete")
    public String deleteProfesor(Long id) {
        profesorService.removeProfesorById(id);
        return "redirect:/profesores/view";
    }
}
