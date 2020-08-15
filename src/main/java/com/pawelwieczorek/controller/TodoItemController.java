package com.pawelwieczorek.controller;

import com.pawelwieczorek.model.TodoData;
import com.pawelwieczorek.util.Mappings;
import com.pawelwieczorek.util.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class TodoItemController {

    // == model attributes ==
    @ModelAttribute
    public TodoData todoData() {
        return new TodoData();
    }

    @GetMapping(Mappings.ITEMS)
    public String items() {
        return ViewNames.ITEMS_LIST;
    }
}
