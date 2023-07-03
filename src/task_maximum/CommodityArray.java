package task_maximum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class CommodityArray {
	
	private List<Commodity> list = new ArrayList<Commodity>();
	Random random = new Random();
	
	public void addCommodity(int x) {
		for (int i = 0; i < x; i++) {
			this.list.add(new Commodity(this.list.size(), "Товар "+this.list.size(), random.nextInt(90)+10, random.nextInt(90)+10, random.nextInt(50)+10));			
		}
	}
	
	public void remove(int i) {
		this.list.remove(i);
	}
	
	public void showCommodityArray() {
		System.out.println("Список товарів:");
		for (Commodity commodity : list) {
			System.out.println(commodity);
		}
		System.out.println();
	}
	
	public void replaceCommodity(int i) {
		this.list.set(i, new Commodity(i, "Замінений товар", random.nextInt(90)+10, random.nextInt(90)+10, random.nextInt(50)+10));
	}
	
	public void sortByName() {
		Collections.sort(this.list, new SortByNameComparator());
		System.out.println("Відбулося сортування за назвою\n");
	}
	
	public void sortByLength() {
		Collections.sort(this.list, new sortByLengthComparator());
		System.out.println("Відбулося сортування за довжиною\n");
	}
	
	public void sortByWidth() {
		Collections.sort(this.list, new sortByWidthComparator());
		System.out.println("Відбулося сортування за шириною\n");
	}
	
	public void sortByWeight() {
		Collections.sort(this.list, new sortByWeightComparator());
		System.out.println("Відбулося сортування за вагою\n");
	}
	
	public void showCommodity(int i) {
		System.out.println("Товар:");
		System.out.println(this.list.get(i));
	}
}
