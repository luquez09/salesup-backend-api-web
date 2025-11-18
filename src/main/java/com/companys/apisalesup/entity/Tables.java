package com.companys.apisalesup.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tables")
public class Tables {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTable;

    @Column(name = "table_number")
    private Integer numberTable;

    @Column(name = "available")
    private Boolean availableTable;
}
