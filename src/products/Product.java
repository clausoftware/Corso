package products;

public abstract class Product implements OrderableItem {

	protected String UOM; // unit of measure
	protected int weight;
	protected String ingredients;
}
