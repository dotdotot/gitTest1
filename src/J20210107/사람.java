package J20210107;

class 사람 {
	// private => 외부로 공개되지 않는다., 리모콘에 노출되지 않는다.
	private int id;
	
	public void setId(int newid) {
		id = newid;
	}
	
	public int getId() {
		return id;
	}
}
