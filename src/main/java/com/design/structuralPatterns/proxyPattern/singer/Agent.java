package com.design.structuralPatterns.proxyPattern.singer;

public class Agent implements Sing {

	private String songName;
	
	private String agentName = "Liu";
	
	private Zhang zhang;

	public Agent(String songName) {
		this.songName = songName;
	}

	@Override
	public void sing() {
		if(null == zhang) {
			zhang = new Zhang(songName, agentName);
		}
		zhang.sing();
	}
	
	
}
