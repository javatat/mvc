package net.member.action;

/* Action 인터페이스에서 명령을 수행하고
 * 결과값을 가지고 페이지를 포워딩할 때 사용되는 클래스
 * 
 * 1) 페이지 이동방식 여부 값을 저장 후 리턴해주는 역할
 * 	    페이지 이동방식 여부 값이 true일 때 -> sendRedirect()방식
 * 	   페이지 이동방식 여부값이 false 일 때 -> forward() 방식
 * 2) 이동페이지 경로 값을 저장하여 리턴해주는 역할
 * */

public class ActionForward {

	private boolean isRedirect = false;
	
	//이동 페이지 경로를 주소값에 변수로 저장
	private String path = null;
	
	//페이지 이동 방식 여부 값 리턴
	public boolean isRedirect(){
		return isRedirect;
	}

	//페이지 이동 방식 여부 값 저장 메소드
	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}

	//이동페이지 경로 주소 값 리턴 메소드
	public String getPath() {
		return path;
	}

	//이동할 페이지 경로 주소값 저장
	public void setPath(String path) {
		this.path = path;
	}

	
}
