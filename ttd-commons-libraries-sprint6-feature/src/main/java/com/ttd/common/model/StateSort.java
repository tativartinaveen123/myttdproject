package com.ttd.common.model;

import java.util.Comparator;

import com.ttd.common.entity.State;

public class StateSort implements Comparator<State> {
	public int compare(State state1, State state2) {
		return state1.getState_name().compareTo(state2.getState_name());
	}
}
