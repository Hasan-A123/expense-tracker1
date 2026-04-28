package com.example.expense_tracker1;

import org.springframework.data.jpa.repository.JpaRepository;


// Spring automatically creates SQL for us here
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
