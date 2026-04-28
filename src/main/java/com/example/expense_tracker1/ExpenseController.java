package com.example.expense_tracker1;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/expenses")
@CrossOrigin(origins = "*")

public class ExpenseController {
    
    private final ExpenseService service;

    public ExpenseController(ExpenseService service) {
        this.service = service;
    }

    // GET /expenses -> get all expenses
    @GetMapping
    public List<Expense> getAll() {
        return service.getAll();
    }

    // POST /expenses -> add new expense
    @PostMapping
    public Expense add(@RequestBody Expense expense) {
        return service.add(expense);
    }

    // DELETE /expenses/{id}
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
