package kr.co.smh.commons;

public class URLs {
	
	private static final String user_default = "/user";
	private static final String board_default = "/board";
	
	public static final String URI_LOGIN = "/login";
	public static final String URI_LOGIN_FULL = user_default + URI_LOGIN;
	
	public static final String URI_LOGOUT = "/logout";
	public static final String URI_LOGOUT_FULL = user_default + URI_LOGOUT;
	
	public static final String URI_LOGIN_CHK = "/loginchk";
	public static final String URI_LOGIN_CHK_FULL = user_default + URI_LOGIN_CHK;
	
	public static final String URI_BOARD_LIST = "/boardList";
	public static final String URI_BOARD_LIST_FULL = board_default + URI_BOARD_LIST;
	
	public static final String URI_BOARD_CONTENTS = "/board";
	public static final String URI_BOARD_CONTENTS_FULL = board_default + URI_BOARD_CONTENTS;
	
}