package chapter03;

import java.util.Comparator;

public class X {
	public static final Comparator<T> COMPARATOR = new Comp();

	private static class Comp implements Comparator<T> {
		public int compare(T d1, T d2) {
			if (d1 > d2)
				return 1;
			if (d1 < d2)
				return -1;
			if (d1 == d2)
				return 0;

		}
	}

}
