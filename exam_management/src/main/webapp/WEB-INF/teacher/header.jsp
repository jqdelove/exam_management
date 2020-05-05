<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false" %>

<!-- 页面头部 -->
<header class="main-header">
	<!-- Logo -->
	<a href="${pageContext.request.contextPath}/teacher/checked/showMain.do" class="logo"> <!-- mini logo for sidebar mini 50x50 pixels -->
		<span class="logo-mini"><b>教师</b></span> <!-- logo for regular state and mobile devices -->
		<span class="logo-lg"><b>高校考务</b>管理系统<small style="font-size: 10px">教师</small></span>
	</a>
	<!-- Header Navbar: style can be found in header.less -->
	<nav class="navbar navbar-static-top">
		<!-- Sidebar toggle button-->
		<a href="#" class="sidebar-toggle" data-toggle="offcanvas"
			role="button"> <span class="sr-only">Toggle navigation</span>
		</a>

		<div class="navbar-custom-menu">
			<ul class="nav navbar-nav">
				<!-- Messages: style can be found in dropdown.less-->
				<li class="dropdown messages-menu">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown">
						<i class="fa fa-envelope-o"></i>
						<span class="label label-success">2</span>
					</a>
					<ul class="dropdown-menu">
						<li class="header">你有2个通知</li>
						<li>
							<!-- inner menu: contains the actual data -->
							<ul class="menu">
								<li>
									<!-- start message -->
									<a href="#">
										<div class="pull-left">
											<img src="${pageContext.request.contextPath}/img/user2-160x160.jpg"
												 class="img-circle" alt="User Image">
										</div>
										<h4>
											系统消息
											<small><i class="fa fa-clock-o"></i> 1 分钟前</small>
										</h4>
										<p>欢迎登录系统</p>
									</a>
								</li>
								<!-- end message -->
								<li>
									<a href="#">
										<div class="pull-left">
											<img src="${pageContext.request.contextPath}/img/user3-128x128.jpg"
												 class="img-circle" alt="User Image">
										</div>
										<h4>
											团队消息
											<small><i class="fa fa-clock-o"></i> 2 小时前</small>
										</h4>
										<p>你有新的任务了</p>
									</a>
								</li>
							</ul>
						</li>
						<li class="footer"><a href="#">查看所有通知</a></li>
					</ul>
				</li>
				<!-- Notifications: style can be found in dropdown.less -->
				<li class="dropdown notifications-menu">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown">
						<i class="fa fa-bell-o"></i>
						<span class="label label-warning">1</span>
					</a>
					<ul class="dropdown-menu">
						<li class="header">你有1个新消息</li>
						<li>
							<!-- inner menu: contains the actual data -->
							<ul class="menu">
								<li>
									<a href="#">
										<i class="fa fa-users text-aqua"></i> 新大纲的生成
									</a>
								</li>
							</ul>
						</li>
						<li class="footer"><a href="#">查看所有消息</a></li>
					</ul>
				</li>
				<!-- Tasks: style can be found in dropdown.less -->
				<li class="dropdown tasks-menu">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown">
						<i class="fa fa-flag-o"></i>
						<span class="label label-danger">1</span>
					</a>
					<ul class="dropdown-menu">
						<li class="header">你有1个新任务</li>
						<li>
							<!-- inner menu: contains the actual data -->
							<ul class="menu">
								<li>
									<!-- Task item -->
									<a href="#">
										<h3>
											生成新的试卷
											<small class="pull-right">80%</small>
										</h3>
										<div class="progress xs">
											<div class="progress-bar progress-bar-aqua" style="width: 80%"
												 role="progressbar" aria-valuenow="80" aria-valuemin="0"
												 aria-valuemax="100">
												<span class="sr-only">80% Complete</span>
											</div>
										</div>
									</a>
								</li>
								<!-- end task item -->
								<!-- end task item -->
							</ul>
						</li>
						<li class="footer">
							<a href="#">查看所有任务</a>
						</li>
					</ul>
				</li>

				<li class="dropdown user user-menu"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown"> <img
						src="${pageContext.request.contextPath}/img/user2-160x160.jpg"
						class="user-image" alt="User Image">
					<span class="hidden-xs">
							${tea.teacherName}
					</span>

				</a>
					<ul class="dropdown-menu">
						<!-- User image -->
						<li class="user-header"><img
							src="${pageContext.request.contextPath}/img/user2-160x160.jpg"
							class="img-circle" alt="User Image">
							<p>
								${tea.teacherName} - 教师
								<small>最后登录 11:20AM</small>
							</p>
						</li>

						<!-- Menu Footer-->
						<li class="user-footer">
							<div class="pull-left">
								<a href="${pageContext.request.contextPath}/teacher/checked/showInfo.do" class="btn btn-default btn-flat">修改密码</a>
							</div>
							<div class="pull-right">
								<a href="${pageContext.request.contextPath}/teacher/logout.do"
									class="btn btn-default btn-flat">注销</a>
							</div>
						</li>
					</ul></li>

			</ul>
		</div>
	</nav>
</header>
<!-- 页面头部 /-->