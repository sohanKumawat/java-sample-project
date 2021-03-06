package com.demo.slk.concurrency.locks;
public class ScoreHealthThread implements Runnable {
	private ScoreBoard scoreBoard;
	public ScoreHealthThread(ScoreBoard scoreTable) {
		this.scoreBoard = scoreTable;
	}
	@Override
	public void run() {
		for(int i= 0; i<5; i++) {
			System.out.println("Match Health: "+ scoreBoard.getMatchHealth());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}
}