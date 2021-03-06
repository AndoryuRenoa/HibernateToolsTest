package com.MochiJump;
// Generated Nov 30, 2018 8:28:24 PM by Hibernate Tools 5.3.6.Final

/**
 * Level generated by hbm2java
 */
public class Level implements java.io.Serializable {

	private Integer id;
	private int goalStartx;
	private int goalStarty;
	private byte[] gooseStartx;
	private byte[] gooseStarty;
	private byte[] hairClipStartx;
	private byte[] hairClipStarty;
	private byte[] height;
	private String levelName;
	private int mochiStartx;
	private int mochiStarty;
	private byte[] startx;
	private byte[] starty;
	private byte[] width;

	public Level() {
	}

	public Level(int goalStartx, int goalStarty, int mochiStartx, int mochiStarty) {
		this.goalStartx = goalStartx;
		this.goalStarty = goalStarty;
		this.mochiStartx = mochiStartx;
		this.mochiStarty = mochiStarty;
	}

	public Level(int goalStartx, int goalStarty, byte[] gooseStartx, byte[] gooseStarty, byte[] hairClipStartx,
			byte[] hairClipStarty, byte[] height, String levelName, int mochiStartx, int mochiStarty, byte[] startx,
			byte[] starty, byte[] width) {
		this.goalStartx = goalStartx;
		this.goalStarty = goalStarty;
		this.gooseStartx = gooseStartx;
		this.gooseStarty = gooseStarty;
		this.hairClipStartx = hairClipStartx;
		this.hairClipStarty = hairClipStarty;
		this.height = height;
		this.levelName = levelName;
		this.mochiStartx = mochiStartx;
		this.mochiStarty = mochiStarty;
		this.startx = startx;
		this.starty = starty;
		this.width = width;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getGoalStartx() {
		return this.goalStartx;
	}

	public void setGoalStartx(int goalStartx) {
		this.goalStartx = goalStartx;
	}

	public int getGoalStarty() {
		return this.goalStarty;
	}

	public void setGoalStarty(int goalStarty) {
		this.goalStarty = goalStarty;
	}

	public byte[] getGooseStartx() {
		return this.gooseStartx;
	}

	public void setGooseStartx(byte[] gooseStartx) {
		this.gooseStartx = gooseStartx;
	}

	public byte[] getGooseStarty() {
		return this.gooseStarty;
	}

	public void setGooseStarty(byte[] gooseStarty) {
		this.gooseStarty = gooseStarty;
	}

	public byte[] getHairClipStartx() {
		return this.hairClipStartx;
	}

	public void setHairClipStartx(byte[] hairClipStartx) {
		this.hairClipStartx = hairClipStartx;
	}

	public byte[] getHairClipStarty() {
		return this.hairClipStarty;
	}

	public void setHairClipStarty(byte[] hairClipStarty) {
		this.hairClipStarty = hairClipStarty;
	}

	public byte[] getHeight() {
		return this.height;
	}

	public void setHeight(byte[] height) {
		this.height = height;
	}

	public String getLevelName() {
		return this.levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public int getMochiStartx() {
		return this.mochiStartx;
	}

	public void setMochiStartx(int mochiStartx) {
		this.mochiStartx = mochiStartx;
	}

	public int getMochiStarty() {
		return this.mochiStarty;
	}

	public void setMochiStarty(int mochiStarty) {
		this.mochiStarty = mochiStarty;
	}

	public byte[] getStartx() {
		return this.startx;
	}

	public void setStartx(byte[] startx) {
		this.startx = startx;
	}

	public byte[] getStarty() {
		return this.starty;
	}

	public void setStarty(byte[] starty) {
		this.starty = starty;
	}

	public byte[] getWidth() {
		return this.width;
	}

	public void setWidth(byte[] width) {
		this.width = width;
	}

}
