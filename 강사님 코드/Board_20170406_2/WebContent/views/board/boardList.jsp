<%@page import="java.net.URL"%>
<%@page import="kr.co.smh.vo.board.BoardVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.smh.commons.URLs"%>
<%@page import="kr.co.smh.vo.user.LoginVO"%>
<%@page import="kr.co.smh.commons.Keys"%>
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

<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">

<style type="text/css">
.filterable {
	margin-top: 15px;
}

.filterable .panel-heading .pull-right {
	margin-top: -20px;
}

.filterable .filters input[disabled] {
	background-color: transparent;
	border: none;
	cursor: auto;
	box-shadow: none;
	padding: 0;
	height: auto;
}

.filterable .filters input[disabled]::-webkit-input-placeholder {
	color: #333;
}

.filterable .filters input[disabled]::-moz-placeholder {
	color: #333;
}

.filterable .filters input[disabled]:-ms-input-placeholder {
	color: #333;
}
</style>

<script type="text/javascript">
	/*
	 Please consider that the JS part isn't production ready at all, I just code it to show the concept of merging filters and titles together !
	 */
	$(document)
			.ready(
					function() {
						$('.filterable .btn-filter')
								.click(
										function() {
											var $panel = $(this).parents(
													'.filterable'), $filters = $panel
													.find('.filters input'), $tbody = $panel
													.find('.table tbody');
											if ($filters.prop('disabled') == true) {
												$filters
														.prop('disabled', false);
												$filters.first().focus();
											} else {
												$filters.val('').prop(
														'disabled', true);
												$tbody.find('.no-result')
														.remove();
												$tbody.find('tr').show();
											}
										});

						$('.filterable .filters input')
								.keyup(
										function(e) {
											/* Ignore tab key */
											var code = e.keyCode || e.which;
											if (code == '9')
												return;
											/* Useful DOM data and selectors */
											var $input = $(this), inputContent = $input
													.val().toLowerCase(), $panel = $input
													.parents('.filterable'), column = $panel
													.find('.filters th')
													.index($input.parents('th')), $table = $panel
													.find('.table'), $rows = $table
													.find('tbody tr');
											/* Dirtiest filter function ever ;) */
											var $filteredRows = $rows
													.filter(function() {
														var value = $(this)
																.find('td').eq(
																		column)
																.text()
																.toLowerCase();
														return value
																.indexOf(inputContent) === -1;
													});
											/* Clean previous no-result if exist */
											$table.find('tbody .no-result')
													.remove();
											/* Show all rows, hide filtered ones (never do that outside of a demo ! xD) */
											$rows.show();
											$filteredRows.hide();
											/* Prepend no-result row if all rows are filtered */
											if ($filteredRows.length === $rows.length) {
												$table
														.find('tbody')
														.prepend(
																$('<tr class="no-result text-center"><td colspan="'
																		+ $table
																				.find('.filters th').length
																		+ '">No result found</td></tr>'));
											}
										});
					});
</script>

<title>게시판 입니다</title>

</head>
<body>

	<div class="container">


		<h3>게시판입니다</h3>
		<div class="pull-right">
			<a href="<%=URLs.URI_LOGOUT_FULL%>"><%= ((LoginVO)session.getAttribute(Keys.KEY_LOGIN_SESSION)).getUsername() %>님 로그아웃</a>
		</div>
		<hr>
		<div class="row">
			<div class="panel panel-primary filterable">
				<div class="panel-heading">
					<h3 class="panel-title">Board</h3>
					<div class="pull-right">
						<button class="btn btn-default btn-xs btn-filter">
							<span class="glyphicon glyphicon-filter"></span> Filter
						</button>
					</div>
				</div>
				<table class="table">
					<thead>
						<tr class="filters">
							<th><input type="text" class="form-control"
								placeholder="글번호" disabled></th>
							<th><input type="text" class="form-control" placeholder="제목"
								disabled></th>
							<th><input type="text" class="form-control"
								placeholder="아이디" disabled></th>
							<th><input type="text" class="form-control"
								placeholder="작성일자" disabled></th>
						</tr>
					</thead>
					<tbody>

						<%
							List<BoardVO> boardList = (List<BoardVO>) request.getAttribute(Keys.KEY_BOARD_LIST_PARAM);
						%>
						<%
							for (BoardVO boardVO : boardList) {
						%>
						<tr>
							<td><%=boardVO.getBidx()%></td>
							<td><a href="<%=URLs.URI_BOARD_CONTENTS_FULL %>?bidx=<%=boardVO.getBidx()%>"><%=boardVO.getTitle()%></td>
							<td><%=boardVO.getUserid()%></td>
							<td><%=boardVO.getWritedate()%></td>
						</tr>
						<%
							}
						%>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>