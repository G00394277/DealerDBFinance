package ie.atu.dealerdbfinance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/finance")
public class FinanceController {
    private final FinanceService financeService;

    @Autowired
    public FinanceController(FinanceService financeService) {
        this.financeService = financeService;
    }

    @GetMapping("/calculate/{id}")
    public String calculateMonthlyPayments(
            @PathVariable("id") Long id,
            @RequestParam("deposit") int deposit,
            @RequestParam("apr") double apr,
            @RequestParam("term") int term
    ) {
        int carPrice =;

        if (carPrice < 8000) {
            return "Finance is unavailable for this vehicle.";
        }

        double loanAmount = carPrice - deposit;
        double monthlyInterest = apr / 100 / 12;
        int numberOfPayments = term;

        double monthlyPayment = (loanAmount * monthlyInterest) / (1 - Math.pow(1 + monthlyInterest, -numberOfPayments));

        return String.format("Monthly payment: %.2f", monthlyPayment);
    }
}
