package exercicio08_13;

import java.lang.reflect.Array;
import java.util.Arrays;

public final class IntegerSet {

	private static final int SET_LENGTH = 101;
	private boolean[] integerSet = new boolean[SET_LENGTH];

	public IntegerSet() {
		Arrays.fill(integerSet, false);
	}

	public IntegerSet(int... num) {
		for (int n : num) {
			insertElement(n);
		}
	}

	public boolean[] getIntegerSet() {
		return integerSet;
	}

	// create a set-theoretic union of two existing sets
	// make a new set by joining two old ones
	public static IntegerSet union(IntegerSet set1, IntegerSet set2) {
		IntegerSet unionSet = new IntegerSet();
		for (int i = 0; i < SET_LENGTH; i++) {
			if (set1.isSet(i) || set2.isSet(i))
				unionSet.insertElement(i);
			else
				unionSet.deleteElement(i);
		}
		return unionSet;
	}

	// create a set-theoretic intersection of two existing sets
	// make a new set by joining two old ones
	public static IntegerSet intersection(IntegerSet set1, IntegerSet set2) {
		IntegerSet intersectionSet = new IntegerSet();
		for (int i = 0; i < SET_LENGTH; i++) {
			if (set1.isSet(i) && set2.isSet(i))
				intersectionSet.insertElement(i);
			else
				intersectionSet.deleteElement(i);
		}
		return intersectionSet;
	}

	public static boolean isEqual(boolean[] set1, boolean[] set2) {
		if (Arrays.equals(set1, set2))
			return true;
		else
			return false;
	}

	// determines if value is in set
	private boolean isSet(int n) {
		if (n < SET_LENGTH)
			return integerSet[n];
		else
			throw new ArrayIndexOutOfBoundsException("element range required: 0-100");
	}

	private void insertElement(int k) {
		if (k < SET_LENGTH)
			integerSet[k] = true;
		else
			throw new ArrayIndexOutOfBoundsException("element range required: 0-100");
	}

	private void deleteElement(int m) {
		if (m < SET_LENGTH)
			integerSet[m] = false;
		else
			throw new ArrayIndexOutOfBoundsException("element range required: 0-100");
	}

	// string representation of object
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < SET_LENGTH; i++) {
			if (integerSet[i] == true)
				sb = sb.length() > 0 ? sb.append(",").append(i) : sb.append(i);
			// sb.append(i + " ");
		}
		return (sb.toString().equals("")) ? "---" : sb.toString();

	}

}// class
