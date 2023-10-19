import java.util.ArrayList;
import java.util.List;

public class TestMain {

	static Order order = new Order();

	public static void main( String... args ) {
		Main.prepareBurgerList();
		Product p = Main.burgerList.get( 0 );
		order.addCart( p.clone() );
		p.name = "";

		Product pp = order.getOrderedProductList().get( 0 );
	}
}
