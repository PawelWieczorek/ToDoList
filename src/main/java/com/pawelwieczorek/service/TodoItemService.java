package com.pawelwieczorek.service;

import com.pawelwieczorek.model.TodoData;
import com.pawelwieczorek.model.TodoItem;

public interface TodoItemService {

    void addItem(TodoItem item);

    void removeItem(int id);

    TodoItem getItem(int id);

    void updateItem(TodoItem item);

    TodoData getData();
}
