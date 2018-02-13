package salesianas.academia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import salesianas.academia.entity.Materia;
import salesianas.academia.service.MateriaService;

@Controller
@RequestMapping(value = "/materias", produces = "application/json")
public class MateriaController {
	@Autowired
    @Qualifier("MateriaService")
    private MateriaService materiaService;
    public static final String MATERIA_VIEW = "materias";
    
    @PostMapping("/list")
    public @ResponseBody List<Materia> listAllMaterias() {
    	return materiaService.listAllMateria();
    }
    
    @PostMapping("/add")
    public String addMateria(@ModelAttribute("materia") Materia materia) {
        materiaService.addMateria(materia);
        return "redirect:/materias/list";
    }
    
    @PostMapping("/update")
    public String updateMateria(@ModelAttribute("materia") Materia materia) {
        materiaService.updateMateria(materia);
        return "redirect:/materias/list";
    }
    
    @PostMapping("/delete")
    public String deleteMateria(@ModelAttribute("materia") Materia materia) {
        materiaService.removeMateria(materia.getId());
        return "redirect:/materias/list";
    }
    @GetMapping("/view")
    public ModelAndView viewMateria( ) {
        ModelAndView mav = new ModelAndView(MATERIA_VIEW);
        //return mav;       
        mav.addObject("materias", materiaService.listAllMateria());
        return mav;
    }
}
