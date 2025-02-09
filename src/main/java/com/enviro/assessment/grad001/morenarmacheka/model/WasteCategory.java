package com.enviro.assessment.grad001.morenarmacheka.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WasteCategory {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Disposal guideline is required")
    @Column(length = 500)
    private String disposalGuideline;

    @NotBlank(message = "Recycling tip is required")
    @Column(length = 500)
    private String recyclingTip;
}
