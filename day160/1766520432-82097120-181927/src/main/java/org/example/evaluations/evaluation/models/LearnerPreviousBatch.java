package org.example.evaluations.evaluation.models;

import jakarta.persistence.Embeddable;

@Embeddable
public class LearnerPreviousBatch {
    private long batchId;
    private long learnerId;
}
