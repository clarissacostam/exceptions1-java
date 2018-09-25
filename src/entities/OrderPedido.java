package entities;

import java.util.Date;

public class OrderPedido {
	private Integer id; // código do produto
	private Date moment;// momento que o produto foi comprado
	private OrderStatus status; // status do pedido

	public OrderPedido() {

	}

	public OrderPedido(Integer id, Date moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "OrderPedido [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
}
