package javaapplication42;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;

import javaapplication42.entities.Order;
import javaapplication42.entities.OrderResponse;
import javaapplication42.web.Gestion;
import javaapplication42.web.GestionService;

public class Utils {
	public static OrderResponse sendRequest(String user, String password, Order order) {
		GestionService service = new GestionService();
		Gestion port = service.getGestionPort();
		return new OrderResponse(port.setPedidoWeb3(user, password, order.getOriginalOrder()));
	}

	public static <T> Collector<T, List<T>, List<T>> toImmutableList() {
		return Collector.of(LinkedList::new, List::add,
				(left, right) -> {
					left.addAll(right);
					return left;
				}, Collections::unmodifiableList);
	}
}
