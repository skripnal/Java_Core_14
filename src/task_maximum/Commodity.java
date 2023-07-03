package task_maximum;

public class Commodity {
	
	private int id;
	private String name;
	private int length;
	private int width;
	private int weight;
	

	public Commodity(int id, String name, int length, int width, int weight) {
		this.id = id;
		this.name = name;
		this.length = length;
		this.width = width;
		this.weight = weight;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Commodity [id=" + id + ", name=" + name + ", length=" + length + ", width=" + width + ", weight="
				+ weight + "]";
	}
	
	
}
