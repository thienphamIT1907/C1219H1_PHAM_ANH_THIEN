package com.finalexam.controllers;

import com.finalexam.models.DiscountEvent;
import com.finalexam.services.DiscountEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.persistence.criteria.ParameterExpression;
import javax.swing.text.html.Option;
import java.util.Optional;

@Controller
public class DiscountEventController {

    @Autowired
    DiscountEventService discountEventService;

    @GetMapping("/")
    public ModelAndView getAllDiscountEvent() {
        return new ModelAndView("list", "discountEvent", discountEventService.findAll());
    }

    @GetMapping("/create-discountEvent")
    public ModelAndView showCreatePage() {
        return new ModelAndView("create", "discountEvent", new DiscountEvent());
    }

//    @PostMapping("/create-employee")
//    public String createEmployee(@Valid @ModelAttribute(name="employee") Employee employee, RedirectAttributes redirectAttributes) {
//        employeeService.save(employee);
//        redirectAttributes.addFlashAttribute("message", "New employee has created success!");
//        return "redirect:/";
//    }

    @PostMapping("/create-discountEvent")
    public ModelAndView createDiscountEvent(@Validated @ModelAttribute(name = "") DiscountEvent discountEvent, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView("create");
        if (bindingResult.hasErrors()) {
            return modelAndView;
        } else {
            discountEventService.save(discountEvent);
            modelAndView.addObject("discountEvent", new DiscountEvent());
            modelAndView.addObject("message", "Đã tạo mới Discount Event thành công!");
            return modelAndView;
        }
    }

//    @GetMapping("/edit-employee")
//    public ModelAndView showEditForm(@RequestParam Long id) {
//        DiscountEvent discountEventToEdit = employeeService.findById(id);
//        if (discountEventToEdit != null) {
//            ModelAndView modelAndView = new ModelAndView("edit");
//            modelAndView.addObject("employee", discountEventToEdit);
//            return modelAndView;
//        } else {
//            ModelAndView modelAndView = new ModelAndView("/error.404");
//            return modelAndView;
//        }
//    }
//
//    @PostMapping("/edit-employee")
//    public String updateEmployee(DiscountEvent discountEventToEdit, RedirectAttributes redirect) {
//        employeeService.save(discountEventToEdit);
//        redirect.addFlashAttribute("message", "Employee updated successfull!");
//        return "redirect:/";
//    }
//

    @GetMapping("/delete-discountEvent")
    public ModelAndView showDeleteForm(@RequestParam Long id) {
        DiscountEvent discountEventToDelete = discountEventService.findById(id);
        if (discountEventToDelete != null) {
            ModelAndView modelAndView = new ModelAndView("delete");
            modelAndView.addObject("discountEvent", discountEventToDelete);
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("list");
            modelAndView.addObject("message", "Xoá thất bại ! Vui lòng thử lại !");
            return modelAndView;
        }
    }

    @PostMapping("/delete-discountEvent")
    public String deleteDiscountEvent(Long id, RedirectAttributes redirect) {
        discountEventService.remove(id);
        redirect.addFlashAttribute("message", "Đã xoá Discount Event thành công!");
        return "redirect:/";
    }

    @GetMapping("/search")
    public ModelAndView search(
        @RequestParam(name = "mucGiamGia", defaultValue = "") String mucGiamGia,
        @RequestParam(name = "tgbd", defaultValue = "") String tgbd,
        @RequestParam(name = "tgkt", defaultValue = "") String tgkt
    ) {
        ModelAndView modelAndView = new ModelAndView("search-result");

        modelAndView.addObject("mucGiamGia", mucGiamGia);
        modelAndView.addObject("thoiGianBatDau", tgbd);
        modelAndView.addObject("thoiGianKetThuc", tgkt);
        modelAndView.addObject("khuyenMais", discountEventService.findAllByMucGiamGiaContainingAndThoiGianBdContainingAndThoiGianKtContaining(mucGiamGia, tgbd, tgkt));

        return modelAndView;

    }

}
