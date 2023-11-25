package edu.fra.uas.hello;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class GradeCalculator {
    // Methode zur Berechnung des Notendurchschnitts
    public double calculateAverage(List<Double> grades) {
        if (grades.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }
}
