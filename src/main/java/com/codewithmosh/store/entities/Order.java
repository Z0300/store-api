package com.codewithmosh.store.entities;

@lombok.Getter
@lombok.Setter@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "orders")
public class Order {
@jakarta.persistence.Id
@jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
@jakarta.persistence.Column(name = "id", nullable = false)
private java.lang.Long id;

@jakarta.validation.constraints.NotNull
@jakarta.persistence.ManyToOne(fetch = jakarta.persistence.FetchType.LAZY, optional = false)
@jakarta.persistence.JoinColumn(name = "customer_id", nullable = false)
private com.codewithmosh.store.entities.User customer;

@jakarta.validation.constraints.Size(max = 20)
@jakarta.validation.constraints.NotNull
@jakarta.persistence.Column(name = "status", nullable = false, length = 20)
private java.lang.String status;

@jakarta.validation.constraints.NotNull
@org.hibernate.annotations.ColumnDefault("CURRENT_TIMESTAMP")
@jakarta.persistence.Column(name = "created_at", nullable = false)
private java.time.LocalDateTime createdAt;

@jakarta.validation.constraints.NotNull
@jakarta.persistence.Column(name = "total_price", nullable = false, precision = 10, scale = 2)
private java.math.BigDecimal totalPrice;

@jakarta.persistence.OneToMany(mappedBy = "order")
private java.util.Set<com.codewithmosh.store.entities.OrderItem> items = new java.util.LinkedHashSet<>();



}