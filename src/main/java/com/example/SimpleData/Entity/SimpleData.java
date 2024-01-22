package com.example.SimpleData.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Data")
public class SimpleData {

        @Id
        @Column(name = "id")
        public int id;
        @Column(name = "name", length = 20,nullable = false)
        public String repoName;
        @Column(name = "body")
        public String body;
        @Column(name = "lang1")
        public String lang1;
        @Column(name = "lang2")
        public String lang2;
        @Column(name = "lang3")
        public String lang3;

}
