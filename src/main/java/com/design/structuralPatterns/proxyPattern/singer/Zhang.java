package com.design.structuralPatterns.proxyPattern.singer;

/**
 * 实现歌手接口的歌手
 * @author 170186
 *
 */
public class Zhang implements Sing {

	private String songName;
	
	private String agentName;
	
	public Zhang(String songName, String agentName) {
		this.songName = songName;
		this.agentName = agentName;
		this.agent();
	}

	@Override
	public void sing() {
		System.out.println("singing " + songName);
	}
	
	public void agent() {
		System.out.println("agentBy " + agentName);
	}

}
