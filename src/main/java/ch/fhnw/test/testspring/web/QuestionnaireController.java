package ch.fhnw.test.testspring.web;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/questionnaires")
public class QuestionnaireController {

    @Autowired
    private QuestionnaireRepository questionnaireRepository;

    public void findAll(HttpServletResponse response, HttpServletRequest request)
    	throws IOException {
    }

    public void findById(Long id, HttpServletResponse response, 
    	HttpServletRequest request) throws IOException {
    }

}