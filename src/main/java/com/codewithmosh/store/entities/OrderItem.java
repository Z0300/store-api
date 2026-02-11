package com.codewithmosh.store.entities;

@lombok.Getter
@lombok.Setter@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "order_items")
public class OrderItem {
@jakarta.persistence.Id
@jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
@jakarta.persistence.Column(name = "id", nullable = false)
private java.lang.Long id;

@jakarta.validation.constraints.NotNull
@jakarta.persistence.ManyToOne(fetch = jakarta.persistence.FetchType.LAZY, optional = false)
@jakarta.persistence.JoinColumn(name = "order_id", nullable = false)
private com.codewithmosh.store.entities.Order order;

@jakarta.validation.constraints.NotNull
@jakarta.persistence.ManyToOne(fetch = jakarta.persistence.FetchType.LAZY, optional = false)
@jakarta.persistence.JoinColumn(name = "product_id", nullable = false)
private com.codewithmosh.store.entities.Product product;

@jakarta.validation.constraints.NotNull
@jakarta.persistence.Column(name = "unit_price", nullable = false, precision = 10, scale = 2)
private java.math.BigDecimal unitPrice;

@jakarta.validation.constraints.NotNull
@jakarta.persistence.Column(name = "quantity", nullable = false)
private java.lang.Integer quantity;

@jakarta.validation.constraints.NotNull
@jakarta.persistence.Column(name = "total_price", nullable = false, precision = 10, scale = 2)
private java.math.BigDecimal totalPrice;



}