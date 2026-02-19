package com.educandoWeb.course.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_payment")
public class Payment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant momentOfPayment;

    @JsonIgnore
    @OneToOne
    @MapsId
    private Order order;

    public Payment() {
    }

    public Payment(Long id, Instant momentOfPayment, Order order) {
        this.id = id;
        this.momentOfPayment = momentOfPayment;
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMomentOfPayment() {
        return momentOfPayment;
    }

    public void setMomentOfPayment(Instant momentOfPayment) {
        this.momentOfPayment = momentOfPayment;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Payment payment)) return false;
        return Objects.equals(getId(), payment.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
