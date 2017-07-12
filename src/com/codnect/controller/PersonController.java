package com.codnect.controller;

import com.codnect.model.PersonForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created by Burak Köken on 12.7.2017.
 */
@Controller
public class PersonController {


    @RequestMapping("/personForm")
    public ModelAndView showPersonForm(Model model){
        model.addAttribute("personForm", new PersonForm());

        ModelAndView modelAndView = new ModelAndView("person/personForm");
        return modelAndView;
    }

    @RequestMapping(value = "/personFormSubmit", method = RequestMethod.POST)
    public ModelAndView personFormSubmit(@Valid PersonForm personForm,
                                          BindingResult bindingResult){

        ModelAndView modelAndView = new ModelAndView();

        if(bindingResult.hasErrors()){
            modelAndView.setViewName("person/personForm");
        }
        else{
            modelAndView.setViewName("person/personInfo");
            modelAndView.addObject("personForm", personForm);
        }

        return modelAndView;
    }


}
