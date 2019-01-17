package com.gedharizka.training.hibernate.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@Entity
@Table(name="maseter_kategori_buku")
public class KategoriBuku {

    public KategoriBuku(String nama, String description, Timestamp createDate, String createBy) {
        this.nama = nama;
        this.description = description;
        this.createDate = createDate;
        this.createBy = "Admin Yuno";
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "kode", nullable = false, unique = true, length = 64)
    private Integer id;

    @Column(name = "kategori", length = 50, nullable = false)
    private  String nama;

    @Lob
    @Column(name = "keterangan")
    private  String description;

    @Column(name = "create_date",nullable = false)
    private Timestamp createDate;

    @Column(name = "create_by",nullable = false)
    private String createBy;

    @Column(name = "last_update_date")
    private Timestamp lastUpdateDate;

    @Column(name = "last_update_by")
    private String lastUpdateBy;
}

