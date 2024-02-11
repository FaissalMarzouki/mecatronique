package com.Mecatronique.Faissal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Mecatronique.Faissal.entity.Competition;
import com.Mecatronique.Faissal.repository.CompetitionRepository;

@RestController
@RequestMapping("/competitions")
public class CompetitionController {

    private final CompetitionRepository competitionRepository;

    @Autowired
    public CompetitionController(CompetitionRepository competitionRepository) {
        this.competitionRepository = competitionRepository;
    }

    @GetMapping("/getAllCompetitions")
    public ResponseEntity<List<Competition>> getAllCompetitions() {
        List<Competition> competitions = competitionRepository.findAll();
        return ResponseEntity.ok(competitions);
    }

    @GetMapping("/getCompetitionById/{id}")
    public ResponseEntity<Competition> getCompetitionById(@PathVariable String id) {
        Optional<Competition> competitionOptional = competitionRepository.findById(id);
        return competitionOptional.map(ResponseEntity::ok)
                                  .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/createCompetition")
    public ResponseEntity<Competition> createCompetition(@RequestBody Competition competition) {
        Competition savedCompetition = competitionRepository.save(competition);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCompetition);
    }

    @PutMapping("/updateCompetition/{id}")
    public ResponseEntity<Competition> updateCompetition(@PathVariable String id,
                                                          @RequestBody Competition competition) {
        if (!competitionRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        competition.setIdCompetition(id); // Ensure the correct ID is set
        Competition updatedCompetition = competitionRepository.save(competition);
        return ResponseEntity.ok(updatedCompetition);
    }

    @DeleteMapping("/deleteCompetition/{id}")
    public ResponseEntity<Void> deleteCompetition(@PathVariable String id) {
        if (!competitionRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        competitionRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
