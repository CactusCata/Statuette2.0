package fr.cactuscata.statuette.api.two;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum SkinModel {

	STEVE(""), ALEX("slim");

	private final String inForm;

	@Override
	public String toString() {
		return inForm;
	}
}