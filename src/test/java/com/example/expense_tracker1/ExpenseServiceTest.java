package com.example.expense_tracker1;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ExpenseServiceTest {
    
    @Test
    void shouldReturnAllExpenses() {

        // create fake repository
        ExpenseRepository repo = Mockito.mock(ExpenseRepository.class);

        // Fake data
        Expense expense = new Expense();
        expense.setTitle("Lunch");

        Mockito.when(repo.findAll()).thenReturn(List.of(expense));

        // Inject mocked repo into service
        ExpenseService service = new ExpenseService(repo);

        List<Expense> result = service.getAll();

        // Verify expected result
        assertEquals(1, result.size());
        assertEquals("Lunch", result.get(0).getTitle());

        // This test checks if repository returns expenses, service should return them correctly
    }

}
