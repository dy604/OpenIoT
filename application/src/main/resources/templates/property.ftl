<!DOCTYPE html>
<html>
  <head>
    <title>设备详情</title>
	
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
        <a class="navbar-brand" href="${request.contextPath}/api/homepage"><span>CHENSI </span><span> 毕设2017</span></a>
    </div>
    <div class="collapse navbar-collapse " id="example-navbar-collapse" >
        <ul class="nav navbar-nav navbar-right">
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    chensi <b class="caret"></b>
                </a>
                
                <ul class="dropdown-menu">
					<li><a href="${request.contextPath}/api/user/personui">个人中心</a></li>
					<li><a href="${request.contextPath}/api/homepage">物管理</a></li>
					<li><a href="${request.contextPath}/api/deviceaccess">物接入</a></li>
					<li><a href="${request.contextPath}/">退出登录</a></li>
                </ul>
            </li>
        </ul>
    </div>
    </div>
</nav>
<div class="container container_body" style='margin-top: -19px;width:100%'>
<div class="row">
<div class="col-md-2 nav_left">
<ul class="nav nav-stacked nav-pills">
<li style='font-size: 18px;

    margin-left: -5px;'><a href="${request.contextPath}/api/homepage"><span class="glyphicon glyphicon-home"></span> <span> 物管理</span></a></li>
			<hr style='margin-top: 0px; border-top: 1px solid black;'>
  				<li class="active"><a href="${request.contextPath}/api/devicemanage/property"><span class="glyphicon glyphicon-inbox"></span>设备详情</a></li>
			</ul>
</div>
<div class="col-md-10 col-md-offset-2 ">
	<div class="panel panel-default" style='margin-top: 40px;'> 
    	<div class="panel-heading">
        	<span class='d_name'> # 设备名</span>
            <span class='d_state btn-success'> 状态</span>
   		</div>
    	<div class="panel-body">
    	<form class='able'>
 			<fieldset>
  			<legend>基础信息:</legend>
  		        <table class="table">
  		            <thead>
  		            <tr>
        			<th>设备名称</th>
        			<th>状态 </th>
        			<th>描述 </th>
        			<th>最后一次活跃时间 </th>
        			<th>设备影子 </th>
        			<th>操作 </th>
        			</tr>
        			</thead>
        			<tr>
        			<td>A</td>
        			<td>可用</td>
        			<td>运输工具</td>
        			<td>2016/3</td>
        			<td><a href='${request.contextPath}/api/profile'>编辑</a></td>
        			<td>....</td>
        			
        			</tr>	
        			<tr>
        			<td>A</td>
        			<td>可用</td>
        			<td>运输工具</td>
        			<td>2016/3</td>
        			<td><a href='${request.contextPath}/api/profile'>编辑</a></td>
        			<td>....</td>
        			
        			</tr>	
    			</table>
 			</fieldset>
		</form>
    	<form class='able'>
 			<fieldset>
  			<legend>能力信息:</legend>
  		<table class="table">
  					<thead>
  		            <tr>
        			<th>飞行能力</th>
        			<th>运输能力</th>
        			<th>... </th>
        			</tr>
        			</thead>
        			<tr>
        			<td>56</td>
        			<td>67</td>
        			<td>45</td>
        			</tr>	
        			<tr>
        			<td>56</td>
        			<td>67</td>
        			<td>45</td>
        			
        			
        			</tr>	
    			</table>
 			</fieldset>
		</form>
    	
    	
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
