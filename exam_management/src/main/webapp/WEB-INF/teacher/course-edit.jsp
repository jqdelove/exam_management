<%--
  Created by IntelliJ IDEA.
  User: jinqi
  Date: 2020/2/23
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>课程编辑</title>
    <meta name="description" content="AdminLTE2定制版">
    <meta name="keywords" content="AdminLTE2定制版">

    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- 页面meta /-->

    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/iCheck/square/blue.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/morris/morris.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/datepicker/datepicker3.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.theme.default.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/select2/select2.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/colorpicker/bootstrap-colorpicker.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/adminLTE/css/skins/_all-skins.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.skinNice.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap-slider/slider.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.css">
</head>
<body class="hold-transition skin-purple sidebar-mini">

<div class="wrapper">

    <!-- 页面头部 -->
    <jsp:include page="/WEB-INF/teacher/header.jsp"></jsp:include>
    <!-- 页面头部 /-->

    <!-- 导航侧栏 -->
    <jsp:include page="/WEB-INF/teacher/aside.jsp"></jsp:include>
    <!-- 导航侧栏 /-->

    <!-- 内容区域 -->
    <div class="content-wrapper">

        <!-- 内容头部 -->
        <section class="content-header">
            <h1>
                课程管理
                <small>课程表单</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="all-admin-index.html"><i class="fa fa-dashboard"></i> 首页</a></li>
                <li><a href="all-order-manage-list.html">课程管理</a></li>
                <li class="active">课程表单</li>
            </ol>
        </section>
        <!-- 内容头部 /-->

        <!-- 正文区域 -->
        <section class="content">

            <!--订单信息-->
<%--            <div class="panel panel-default">--%>
<%--                <div class="panel-heading">订单信息</div>--%>
<%--                <div class="row data-type">--%>

<%--                    <div class="col-md-2 title">订单编号</div>--%>
<%--                    <div class="col-md-4 data">--%>
<%--                        <input type="text" class="form-control" placeholder="订单编号" value="">--%>
<%--                    </div>--%>

<%--                    <div class="col-md-2 title">下单时间</div>--%>
<%--                    <div class="col-md-4 data">--%>
<%--                        <div class="input-group date">--%>
<%--                            <div class="input-group-addon">--%>
<%--                                <i class="fa fa-calendar"></i>--%>
<%--                            </div>--%>
<%--                            <input type="text" class="form-control pull-right" id="datepicker-a3">--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                    <div class="col-md-2 title">路线名称</div>--%>
<%--                    <div class="col-md-4 data">--%>
<%--                        <input type="text" class="form-control" placeholder="路线名称" value="">--%>
<%--                    </div>--%>

<%--                    <div class="col-md-2 title">出发城市</div>--%>
<%--                    <div class="col-md-4 data">--%>
<%--                        <select class="form-control select2" style="width: 100%;">--%>
<%--                            <option value="" selected="selected">Alabama</option>--%>
<%--                            <option value="">Alaska</option>--%>
<%--                            <option value="">California</option>--%>
<%--                            <option value="">Delaware</option>--%>
<%--                            <option value="">Tennessee</option>--%>
<%--                            <option value="">Texas</option>--%>
<%--                            <option value="">Washington</option>--%>
<%--                        </select>--%>
<%--                    </div>--%>

<%--                    <div class="col-md-2 title">出发时间</div>--%>
<%--                    <div class="col-md-4 data">--%>
<%--                        <div class="input-group date">--%>
<%--                            <div class="input-group-addon">--%>
<%--                                <i class="fa fa-calendar"></i>--%>
<%--                            </div>--%>
<%--                            <input type="text" class="form-control pull-right" id="datepicker-a6">--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                    <div class="col-md-2 title">出游人数</div>--%>
<%--                    <div class="col-md-4 data">--%>
<%--                        <input type="text" class="form-control" placeholder="出游人数" value="">--%>
<%--                    </div>--%>

<%--                    <div class="col-md-2 title rowHeight2x">其他信息</div>--%>
<%--                    <div class="col-md-10 data rowHeight2x">--%>
<%--                        <textarea class="form-control" rows="3" placeholder="其他信息"></textarea>--%>
<%--                    </div>--%>

<%--                </div>--%>
<%--            </div>--%>
            <!--订单信息/-->

            <!--游客信息-->
            <div class="panel panel-default">
                <div class="panel-heading">班级信息</div>
                <!--数据列表-->
                <table id="dataList" class="table table-bordered table-striped table-hover dataTable">
                    <thead>
                    <tr>
                        <th class="">班级ID</th>
                        <th class="">班级名</th>
                        <th class="">班级人数</th>
                        <th class="">操作</th>
                    </tr>
                    </thead>
                    <tbody>

                    <c:forEach items="${clazzCourses}" var="clazzCourse">
                    <tr>
                        <td>${clazzCourse.clazz.classId}</td>
                        <td>${clazzCourse.clazz.className}</td>
                        <td>
                            ${clazzCourse.clazz.classAmount}
                        </td>
                        <td><button type="button" class="btn bg-orange-active btn-xs" onclick='location.href="${pageContext.request.contextPath}/teacher/checked/showClazzScore.do?classId=${clazzCourse.clazz.classId}&courseId=${clazzCourse.course.courseId}"'>查看班级成绩</button></td>
                    </tr>
                    </c:forEach>


                    </tbody>
                </table>
                <!--数据列表/-->
            </div>
            <!--游客信息/-->

            <!--联系人信息-->
<%--            <div class="panel panel-default">--%>
<%--                <div class="panel-heading">联系人信息</div>--%>
<%--                <div class="row data-type">--%>

<%--                    <div class="col-md-2 title">会员</div>--%>
<%--                    <div class="col-md-4 data text">--%>
<%--                        bipeng--%>
<%--                    </div>--%>

<%--                    <div class="col-md-2 title">联系人</div>--%>
<%--                    <div class="col-md-4 data text">--%>
<%--                        毕鹏--%>
<%--                    </div>--%>

<%--                    <div class="col-md-2 title">手机号</div>--%>
<%--                    <div class="col-md-4 data text">--%>
<%--                        13301131116--%>
<%--                    </div>--%>

<%--                    <div class="col-md-2 title">邮箱</div>--%>
<%--                    <div class="col-md-4 data text">--%>
<%--                        bipeng0405@163.com--%>
<%--                    </div>--%>

<%--                </div>--%>
<%--            </div>--%>
            <!--联系人信息/-->

            <!--费用信息-->
<%--            <div class="panel panel-default">--%>
<%--                <div class="panel-heading">费用信息</div>--%>
<%--                <div class="row data-type">--%>

<%--                    <div class="col-md-2 title">支付方式</div>--%>
<%--                    <div class="col-md-4 data text">--%>
<%--                        在线支付-支付宝--%>
<%--                    </div>--%>

<%--                    <div class="col-md-2 title">金额</div>--%>
<%--                    <div class="col-md-4 data text">--%>
<%--                        ￥1000--%>
<%--                    </div>--%>

<%--                </div>--%>
<%--            </div>--%>
            <!--费用信息/-->

            <!--发票信息-->
<%--            <div class="panel panel-default">--%>
<%--                <div class="panel-heading">发票信息</div>--%>
<%--                <div class="row data-type">--%>

<%--                    <div class="col-md-2 title">发票名称</div>--%>
<%--                    <div class="col-md-4 data text">--%>
<%--                        <div class="form-group form-inline">--%>
<%--                            <div class="radio"><label><input type="radio" name="optionsRadios-a11" value="1"> 不需要发票</label></div>--%>
<%--                            <div class="radio"><label><input type="radio" name="optionsRadios-a11" value="2"> 个人</label></div>--%>
<%--                            <div class="radio"><label><input type="radio" name="optionsRadios-a11" value="3"> 单位名称</label></div>--%>
<%--                        </div>--%>
<%--                    </div>--%>

<%--                    <div class="col-md-2 title">金额</div>--%>
<%--                    <div class="col-md-4 data text">--%>
<%--                        ￥1000--%>
<%--                    </div>--%>

<%--                </div>--%>
<%--            </div>--%>
            <!--发票信息/-->

            <!--订单处理-->
<%--            <div class="panel panel-default">--%>
<%--                <div class="panel-heading">订单处理</div>--%>
<%--                <div class="row data-type">--%>

<%--                    <div class="col-md-2 title">处理类型</div>--%>
<%--                    <div class="col-md-10 data text">--%>
<%--                        自动处理--%>
<%--                    </div>--%>

<%--                    <div class="col-md-2 title">支付方式</div>--%>
<%--                    <div class="col-md-10 data">--%>
<%--                        <div class="form-group form-inline">--%>
<%--                            <div class="radio"><label><input type="radio" name="optionsRadios-a13" value="1"> 未支付</label></div>--%>
<%--                            <div class="radio"><label><input type="radio" name="optionsRadios-a13" value="2"> 微信支付</label></div>--%>
<%--                            <div class="radio"><label><input type="radio" name="optionsRadios-a13" value="3"> 支付宝支付</label></div>--%>
<%--                        </div>--%>
<%--                    </div>--%>

<%--                    <div class="col-md-2 title">发票名称</div>--%>
<%--                    <div class="col-md-10 data text">--%>
<%--                        <div class="form-group form-inline">--%>
<%--                            <div class="radio"><label><input type="radio" name="optionsRadios-a13" value="1"> 不需要发票</label></div>--%>
<%--                            <div class="radio"><label><input type="radio" name="optionsRadios-a13" value="2"> 个人</label></div>--%>
<%--                            <div class="radio"><label><input type="radio" name="optionsRadios-a13" value="3"> 单位名称</label></div>--%>
<%--                        </div>--%>
<%--                    </div>--%>

<%--                    <div class="col-md-2 title">订单状态</div>--%>
<%--                    <div class="col-md-10 data text">--%>
<%--                        已支付--%>
<%--                    </div>--%>

<%--                    <div class="col-md-2 title">状态改变</div>--%>
<%--                    <div class="col-md-10 data line-height36">--%>
<%--                        <div class="form-group form-inline">--%>
<%--                            <div class="checkbox"><label><input type="checkbox" value="1"> 发送短信或邮件(仅本次有效)</label></div>--%>
<%--                        </div>--%>
<%--                    </div>--%>

<%--                    <div class="col-md-2 title rowHeight2x">管理员备注</div>--%>
<%--                    <div class="col-md-10 data rowHeight2x">--%>
<%--                        <textarea class="form-control" rows="3" placeholder="管理员备注"></textarea>--%>
<%--                    </div>--%>

<%--                </div>--%>
<%--            </div>--%>
            <!--订单处理/-->

            <!--操作日志-->
<%--            <div class="panel panel-default">--%>
<%--                <div class="panel-heading">操作日志</div>--%>
<%--                <!--数据列表-->--%>
<%--                <table id="dataList" class="table table-bordered table-striped table-hover dataTable">--%>
<%--                    <thead>--%>
<%--                    <tr>--%>
<%--                        <th class="">管理员</th>--%>
<%--                        <th class="">内容</th>--%>
<%--                        <th class="">IP</th>--%>
<%--                        <th class="">时间</th>--%>
<%--                    </tr>--%>
<%--                    </thead>--%>
<%--                    <tbody>--%>

<%--                    <tr>--%>
<%--                        <td>-</td>--%>
<%--                        <td>-</td>--%>
<%--                        <td>-</td>--%>
<%--                        <td>-</td>--%>
<%--                    </tr>--%>

<%--                    <tr>--%>
<%--                        <td>-</td>--%>
<%--                        <td>-</td>--%>
<%--                        <td>-</td>--%>
<%--                        <td>-</td>--%>
<%--                    </tr>--%>

<%--                    <tr>--%>
<%--                        <td>-</td>--%>
<%--                        <td>-</td>--%>
<%--                        <td>-</td>--%>
<%--                        <td>-</td>--%>
<%--                    </tr>--%>

<%--                    </tbody>--%>
<%--                </table>--%>
<%--                <!--数据列表/-->--%>
<%--            </div>--%>
            <!--操作日志/-->

            <!--工具栏-->
            <div class="box-tools text-center">
                <button type="button" class="btn text-yellow bg-default" onclick="history.back(-1);">返回上一页</button>
            </div>
            <!--工具栏/-->

        </section>
        <!-- 正文区域 /-->

    </div>
    <!-- 内容区域 /-->

    <!-- 底部导航 -->
    <footer class="main-footer">
        <div class="pull-right hidden-xs">
            <b>Version</b> 1.0.1
        </div>
        <strong>Copyright &copy; 2019-2020 <a
                href="https://www.rossontheway.com">ross King</a>.
        </strong> All rights reserved.
    </footer>
    <!-- 底部导航 /-->

</div>


<script src="${pageContext.request.contextPath}/plugins/jQuery/jquery-2.2.3.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/jQueryUI/jquery-ui.min.js"></script>
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/raphael/raphael-min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/morris/morris.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/sparkline/jquery.sparkline.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<script src="${pageContext.request.contextPath}/plugins/knob/jquery.knob.js"></script>
<script src="${pageContext.request.contextPath}/plugins/daterangepicker/moment.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.js"></script>
<script src="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.zh-CN.js"></script>
<script src="${pageContext.request.contextPath}/plugins/datepicker/bootstrap-datepicker.js"></script>
<script src="${pageContext.request.contextPath}/plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/fastclick/fastclick.js"></script>
<script src="${pageContext.request.contextPath}/plugins/iCheck/icheck.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/adminLTE/js/app.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.js"></script>
<script src="${pageContext.request.contextPath}/plugins/select2/select2.full.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/markdown.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/to-markdown.js"></script>
<script src="${pageContext.request.contextPath}/plugins/ckeditor/ckeditor.js"></script>
<script src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.js"></script>
<script src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
<script src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.extensions.js"></script>
<script src="${pageContext.request.contextPath}/plugins/datatables/jquery.dataTables.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/chartjs/Chart.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.resize.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.pie.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.categories.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-slider/bootstrap-slider.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-datetimepicker/locales/bootstrap-datetimepicker.zh-CN.js"></script>
<script>
    $(document).ready(function() {
        // 选择框
        $(".select2").select2();

        // WYSIHTML5编辑器
        $(".textarea").wysihtml5({
            locale: 'zh-CN'
        });
    });


    // 设置激活菜单
    function setSidebarActive(tagUri) {
        var liObj = $("#" + tagUri);
        if (liObj.length > 0) {
            liObj.parent().parent().addClass("active");
            liObj.addClass("active");
        }
    }


    $(document).ready(function() {
        $('#datepicker-a3').datepicker({
            autoclose: true,
            language: 'zh-CN'
        });
    });


    $(document).ready(function() {
        $('#datepicker-a6').datepicker({
            autoclose: true,
            language: 'zh-CN'
        });
    });


    $(document).ready(function() {
        // 激活导航位置
        setSidebarActive("order-manage");
    });
</script>
</body>
</html>
