package db.board2; //2019.02.28

public class BoardInfoVO {//VO = 밸류 오브젝트의 약자; NTT,DTO 라고도 부른다.

	private Integer biNum; // BOARD_INFO table과 맵핑하기 위해서 존재
	private String biTitle;
	private String biContent;
	private String biCredat;
	private String biCretim;
	private Integer biCnt;
	private String biIsactive;
	
	public Integer getBiNum() {
		return biNum;
	}

	public void setBiNum(Integer biNum) {
		this.biNum = biNum;
	}

	public String getBiTitle() {
		return biTitle;
	}

	public void setBiTitle(String biTitle) {
		this.biTitle = biTitle;
	}

	public String getBiContent() {
		return biContent;
	}

	public void setBiContent(String biContent) {
		this.biContent = biContent;
	}

	public String getBiCredat() {
		return biCredat;
	}

	public void setBiCredat(String biCredat) {
		this.biCredat = biCredat;
	}

	public String getBiCretim() {
		return biCretim;
	}

	public void setBiCretim(String biCretim) {
		this.biCretim = biCretim;
	}

	public Integer getBiCnt() {
		return biCnt;
	}

	public void setBiCnt(Integer biCnt) {
		this.biCnt = biCnt;
	}

	public String getBiIsactive() {
		return biIsactive;
	}

	public void setBiIsactive(String biIsactive) {
		this.biIsactive = biIsactive;
	}

	@Override
	public String toString() {
				
		return "BoardInfoVO [biNum=" + biNum + ", biTitle=" + biTitle + ", biContent=" + biContent + ", biCredat="
				+ biCredat + ", biCretim=" + biCretim + ", biCnt=" + biCnt + ", biIsactive=" + biIsactive + "]";
	}
	
	
	public static void main(String[] args) {
			System.out.println("sss");
	}
	
}
