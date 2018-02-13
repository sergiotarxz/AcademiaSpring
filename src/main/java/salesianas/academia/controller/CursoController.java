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

import salesianas.academia.entity.Curso;
import salesianas.academia.entity.Profesor;
import salesianas.academia.service.CursoService;



@Controller
@RequestMapping(value = "/cursos")
public class CursoController {
	@Autowired
    @Qualifier("CursoService")
    private CursoService cursoService;
    public static final String CURSO_VIEW = "cursos";
    
    @PostMapping("/list")
    public @ResponseBody List<Curso> listAllCursos() {
    	return cursoService.listAllCurso();
    }
    
    @PostMapping("/add")
    public String addCurso(@ModelAttribute("curso") Curso curso) {
        cursoService.addCurso(curso);
        return "redirect:/cursos/view";
    }
    
    @PostMapping("/update")
    public String updateCurso(@ModelAttribute("curso") Curso curso) {
        cursoService.updateCurso(curso);
        return "redirect:/cursos/view";
    }
    
    @PostMapping("/delete")
    public String deleteCurso(@ModelAttribute("curso") Curso curso) {
        cursoService.removeCurso(curso.getId());
        return "redirect:/cursos/view";
    }
    
    @GetMapping("/view")
    public ModelAndView viewCurso( ) {
        ModelAndView mav = new ModelAndView(CURSO_VIEW);
        //return mav;       
        mav.addObject("cursos", cursoService.listAllCurso());
        mav.addObject("curso", new Curso());
        return mav;
    }
}
