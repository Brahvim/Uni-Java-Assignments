package com.brahvim.uni.sem4.practicals;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class _3 {

	public static class Box {

		// region Fields.

		private float area;
		private float width;
		private float height;
		private float length;
		private float weight;
		private float volume;
		private int queryCount;
		private List<Consumer<Box>> cbcksDimensionsChanged;

		// endregion

		// region Constructors.

		public Box(final float p_weight) {
			this(0, 0, 0, p_weight);
		}

		public Box(final float p_width, final float p_length) {
			this(p_width, p_length, 0, 0);
		}

		public Box(final float p_width, final float p_length, final float p_height) {
			this(p_width, p_length, p_height, 0);
		}

		public Box(final float p_width, final float p_length, final float p_height, final float p_weight) {
			this.width = p_width;
			this.length = p_length;
			this.height = p_height;
			this.weight = p_weight;
		}

		// endregion

		// region Instance methods.

		@Override
		public String toString() {
			return String.format(

					"[Box W: `%f`, H: `%f`, L: `%f`, Wt.: `%f`]",
					this.width, this.height, this.length, this.weight

			);
		}

		// region Getters.

		public float getArea() {
			return this.area;
		}

		public float getWidth() {
			return this.width;
		}

		public float getHeight() {
			return this.height;
		}

		public float getLength() {
			return this.length;
		}

		public float getWeight() {
			return this.weight;
		}

		public float getVolume() {
			return this.volume;
		}

		public int getQueryCount() {
			return this.queryCount;
		}

		// endregion

		// region Setters.

		public void setWidth(final float p_width) {
			++this.queryCount;
			this.width = p_width;
			this.cbckDimensionsChanged();
		}

		public void setHeight(final float p_height) {
			++this.queryCount;
			this.height = p_height;
			this.cbckDimensionsChanged();
		}

		public void setLength(final float p_length) {
			++this.queryCount;
			this.length = p_length;
			this.cbckDimensionsChanged();
		}

		public void setWeight(final float p_weight) {
			++this.queryCount;
			this.weight = p_weight;
			this.cbckDimensionsChanged();
		}

		// endregion

		// region Callbacks.

		public void cbckDimensionsChanged() {
			this.area = this.width * this.length;
			this.volume = this.width * this.length * this.height;
			this.cbcksDimensionsChanged.forEach(c -> c.accept(this));
		}

		public void addOnDimensionsChangedListener(final Consumer<Box> p_listener) {
			this.cbcksDimensionsChanged.add(p_listener);
		}

		// endregion

		// endregion

	}

	public static class BoxManager {

		/* package */ final List<Box> boxes;

		public BoxManager() {
			this.boxes = new ArrayList<>(1);
		}

		public void add(final Box p_box) {
			this.boxes.add(p_box);
		}

		public void add(final Box... p_boxes) {
			for (final Box b : p_boxes) {

				this.boxes.add(b);

			}
		}

		public void remove(final Box p_box) {
			this.boxes.remove(p_box);
		}

		public float findTotalArea() {
			float sum = 0;

			for (final Box b : this.boxes) {

				sum += b.getArea();

			}

			return sum;
		}

		public float findTotalWeight() {
			float sum = 0;

			for (final Box b : this.boxes) {

				sum += b.weight;

			}

			return sum;
		}

		public float findTotalVolume() {
			float sum = 0;

			for (final Box b : this.boxes) {

				sum += b.getVolume();

			}

			return sum;
		}

		public float findTotalQueries() {
			float sum = 0;

			for (final Box b : this.boxes) {

				sum += b.getQueryCount();

			}

			return sum;
		}

	}

	public static void main(final String[] p_args) {
		final Box b1 = new Box(1, 2, 3);

		System.out.println("Creating Box 2...");
		final Box b2 = new Box(4, 5, 6);
		b2.addOnDimensionsChangedListener(b -> System.out.println("Box 2's dimensions changed!"));
		b2.setWidth(44);
		b2.setHeight(256);
		System.out.println("Box 2 ready!");

		final BoxManager man = new BoxManager();
		man.add(b1, b2);

		System.out.printf(

				"Total volume of all boxes: `%.1f`.\n",
				man.findTotalVolume()

		);

		System.out.printf(

				"Total number of queries: `%d`.\n",
				man.findTotalQueries()

		);
	}

}
