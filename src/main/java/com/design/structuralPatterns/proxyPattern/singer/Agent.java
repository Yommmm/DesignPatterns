package com.design.structuralPatterns.proxyPattern.singer;

public class Agent implements Sing {

	private String songName;
	
	private String agentName = "Liu";
	
	private Singer singer;

	public Agent(String songName) {
		this.songName = songName;
	}

	@Override
	public void sing() {
		if(null == singer) {
			singer = new Singer(songName, agentName);
		}
		singer.sing();
	}
	
	
}
