package com.comeon.cardgame.function;

public class Dealer {

	public String modeToStr(int modeInt) {
		String modeStr = switch (modeInt) {
		case 2-> "하이바둑이";
		case 3->"리버스바둑이";
		default ->"로우바둑이";
		};
		return modeStr;
	}
}
