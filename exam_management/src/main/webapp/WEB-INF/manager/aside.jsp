<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>

<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="${pageContext.request.contextPath}/img/user2-160x160.jpg"
                     class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p>${man.managerName}</p>
                <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
            </div>
        </div>

        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu">
            <li class="header">菜单</li>
            <li id="admin-index">
                <a href="${pageContext.request.contextPath}/manager/checked/showMain.do">
                    <i class="fa fa-dashboard"></i>
                    <span>首页</span></a></li>

            <li class="treeview">
                <a href="#">
                    <i class="fa fa-cogs"></i>
                    <span>人员管理</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>

                <ul class="treeview-menu">

                    <li id="system-setting">
                        <a href="${pageContext.request.contextPath}/manager/checked/showTeacher.do?page=1&size=6">
                            <i class="fa fa-circle-o"></i> 教师管理
                        </a>
                    </li>
                    <li id="system-setting">
                        <a href="${pageContext.request.contextPath}/manager/checked/showStudent.do?page=1&size=6">
                            <i class="fa fa-circle-o"></i> 学生管理
                        </a>
                    </li>

                </ul>
            </li>

            <li class="treeview">
                <a href="#">
                    <i class="fa fa-cube"></i>
                    <span>考务管理</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">

                    <li id="system-setting">
                        <a href="${pageContext.request.contextPath}/product/findAll.do">
                            <i class="fa fa-circle-o"></i> 班级管理
                        </a>
                    </li>
                    <li id="system-setting">
                        <a href="${pageContext.request.contextPath}/orders/findAll.do?page=1&size=4">
                            <i class="fa fa-circle-o"></i> 课程管理
                        </a>
                    </li>
                    <li id="system-setting">
                        <a href="${pageContext.request.contextPath}/orders/findAll.do?page=1&size=4">
                            <i class="fa fa-circle-o"></i> 考试管理
                        </a>
                    </li>

                </ul>
            </li>

            <li class="treeview">
                <a href="#">
                    <i class="fa fa-pie-chart"></i>
                    <span>个人管理</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">
                    <li id="system-setting">
                        <a href="${pageContext.request.contextPath}/manager/checked/showInfo.do">
                            <i class="fa fa-circle-o"></i> 个人设置
                        </a>
                    </li>
                </ul>
            </li>

        </ul>
    </section>
    <!-- /.sidebar -->
</aside>