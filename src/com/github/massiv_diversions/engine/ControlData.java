package com.github.massiv_diversions.engine;

import java.util.HashMap;
import java.util.Map;

public class ControlData {

	private Map<Integer, Boolean> keyStates;

	public ControlData(int... keyValues) {
		keyStates = new HashMap<Integer, Boolean>(
				(int) (keyValues.length / 0.75) + 1);
		for (int i : keyValues)
			keyStates.put(i, false);
	}

	public boolean keyDown(int keyValue) {
		return keyStates.containsKey(keyValue) && keyStates.get(keyValue);
	}

	protected void press(int keyValue) {
		if (keyStates.containsKey(keyValue))
			keyStates.put(keyValue, true);
	}

	protected void release(int keyValue) {
		if (keyStates.containsKey(keyValue))
			keyStates.put(keyValue, false);
	}

}