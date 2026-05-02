package com.example.expense_tracker1;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ExpenseService {

    private final ExpenseRepository repo;

    // Constructor injection
    public ExpenseService(ExpenseRepository repo) {
        this.repo = repo;
    }

    // Get all expenses
    public List<Expense> getAll() {
        return repo.findAll();
    }

    // Add new expense
    public Expense add(Expense expense) {
        return repo.save(expense);
    }

    // Delete expense by ID
    public void delete(Long id) {
        repo.deleteById(id);
    }

}
