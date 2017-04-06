<%@page import="kr.co.smh.commons.Keys"%>
<%@page import="kr.co.smh.vo.board.BoardVO"%>
<%@page import="kr.co.smh.commons.URLs"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<style type="text/css">
.red {
	color: red;
}

.form-area {
	background-color: #FAFAFA;
	padding: 10px 40px 60px;
	margin: 10px 0px 60px;
	border: 1px solid GREY;
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<% BoardVO boardVO = (BoardVO)request.getAttribute(Keys.KEY_BOARD_CONTENTS_PARAM); %>
	<div class="container">
		<div class="col-md-5">
			<div class="form-area">
				<form role="form">
					<br style="clear: both">
					<h3 style="margin-bottom: 25px; text-align: center;">Contact
						Form</h3>
					<div class="form-group">
						<input type="text" class="form-control" id="name" name="name" readonly="readonly" value="<%= boardVO.getBidx()%>">
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="email" name="email" readonly="readonly"  value="<%= boardVO.getHitcnt()%>">
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="mobile" name="mobile"  readonly="readonly" value="<%= boardVO.getTitle()%>">
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="subject" name="subject" readonly="readonly"  value="<%= boardVO.getWritedate() %>">
					</div>
					<div class="form-group">
						<textarea class="form-control" type="textarea" id="message" placeholder="Message" maxlength="140" rows="7" readonly="readonly">
							<%= boardVO.getContents()%>
						</textarea>
					</div>
					<a href="<%=URLs.URI_BOARD_LIST_FULL %>">목록으로</a>
				</form>
			</div>
		</div>
	</div>
</body>
</html>