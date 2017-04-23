<!DOCTYPE html>
<html>
  <head>
    <title>设备影子</title>
	
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    
     <link rel="stylesheet" type="text/css" href="${request.contextPath}/static/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${request.contextPath}/static/bootstrap/css/bootstrap-theme.min.css">
    <link rel="stylesheet" type="text/css" href="${request.contextPath}/static/css/login.css">

  </head>
  
  <body>
   <nav class="navbar navbar-inverse bar" role="navigation">
    <div class="container-fluid">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse"
                data-target="#example-navbar-collapse">
            <span class="sr-only">切换导航</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="${request.contextPath}/api/homepage"><span>CHENSI </span><span> 物管理</span></a>
    </div>
<div class="collapse navbar-collapse " id="example-navbar-collapse" >
        <ul class="nav navbar-nav navbar-right">
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    chensi <b class="caret"></b>
                </a>
                
                <ul class="dropdown-menu">
                    <li><a href="${request.contextPath}/api/user/personui">个人中心</a></li>
                    <li><a href="${request.contextPath}/">退出登录</a></li>
                </ul>
            </li>
        </ul>
    </div>
    </div>
</nav>

<div class="container" style='margin-top: -19px;width:100%'>
	<div class="row">
		<div class="col-md-2 nav_left">
			<ul class="nav nav-stacked nav-pills">
  				<li ><a href="${request.contextPath}/api/homepage"><span> < 返回设备列表</span></a></li>
  				<li class="active"><a href="#"><span class="glyphicon glyphicon-inbox"></span> 设备影子</a></li>	
			</ul>
		</div>
		<div class="col-md-10 col-md-offset-2 nav_right">
		<div>
		<div class="panel panel-default">
    		<div class="panel-heading">
        		<span class='d_name'> # 设备名</span>
        		<span class='d_state btn-success'> 状态</span>
    		</div>
    		
    		
    		<div class="panel-body">
                <form class="form-horizontal" role="form">
                <legend class='title'>属 性 : </legend>
	     <div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">名字</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="firstname" 
				   placeholder="请输入名字">
		</div>
	</div>
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">姓</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="lastname" 
				   placeholder="请输入姓">
		</div>
	</div>
	<legend class='title'>动 作 : </legend>
	     <div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">名字</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="firstname" 
				   placeholder="请输入名字">
		</div>
	</div>
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">姓</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="lastname" 
				   placeholder="请输入姓">
		</div>
	</div>
	<legend class='title'>状 态 : </legend>
	     <div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">名字</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="firstname" 
				   placeholder="请输入名字">
		</div>
	</div>
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">姓</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="lastname" 
				   placeholder="请输入姓">
		</div>
	</div>


</form>
    		</div>
    		
		</div>
        </div>
		</div>
	</div>
</div>
<footer class="footer">
<div class='container'>
<div class='row'>
	<div class= 'col-md-3'>联系我们</div>
	<div class= 'col-md-3'>教程指导</div>
	<div class= 'col-md-3'>Powered by CHENSI</div>
	
</div>

</div>
</footer>
<script src="${request.contextPath}/static/js/jquery-3.1.1.min.js"></script>
<script src="${request.contextPath}/static/bootstrap/js/bootstrap.min.js"></script>
  </body>
</html>
