<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!-- 
<script type='text/javascript' src='js/jquery-1.11.2.min.js'></script>
<script type='text/javascript' src='/TestDWR/dwr/engine.js'></script>
<script type='text/javascript' src='/TestDWR/dwr/util.js'></script>
<script type='text/javascript' src='/TestDWR/dwr/interface/Demo.js'></script>
 -->
<script type='text/javascript' src='${pageContext.request.contextPath}/dwr/util.js'></script>
<script type='text/javascript' src='${pageContext.request.contextPath}/dwr/engine.js'></script>
<script type='text/javascript' src='${pageContext.request.contextPath}/dwr/interface/demo.js'></script>
<script type="text/javascript">
	/* var services = new dojox.rpc.Service({
		target : "../../../dwr/jsonrpc",
		transport : "POST",
		envelope : "JSON-RPC-1.0",
		contentType : "application/json",
		services : {
			"Demo.sayHello" : {
				returns : {
					"type" : "string"
				},
				parameters : [ {
					"type" : "string"
				} ]
			}
		}
	});
	
	function update() {
		var name = dojo.byId("demoName").value;
		var deferred = services.Demo.sayHello(name);
		deferred.addCallback(function(result) {
			dojo.byId("demoReply").innerHTML = result;
		});
	} */
	
	/* function firstDwr() {
		var name=$("#demoName").val();
		demo.sayChineseHi(name, callBackHello);
		//alert(name);
	} */
	
	/* function callBackHello(data) {
		alert(data);
		$("#demoReply").html(data);
	} */
	
	function firstDwr(date) {
		//var name=$("#demoName").val();
		var name=dwr.util.getValue("demoName");
		name=name?name:null;
		alert(name);
// 		alert(Date.parse("2016/4/8 09:22:22"));
// 		alert(new Date(Date.parse("Fri Apr 8 09:22:22 UTC+0800 2016")));
		demo.getTime(name,function (data) {
			//.replace(/"\\\/(Date\([0-9-]+\))\\\/"/gi, "new $1")
			//alert(typeof data);
			/* {
			  "message" : "添加成功！",
			  "error" : null,
			  "start" : "8 Apr 2016 16:00:00 GMT",
			  "events" : [ [ "402886f453f8e30b0153f8e4165b0021", "123", "8 Apr 2016 16:00:00 GMT", "8 Apr 2016 16:00:00 GMT", "1", "0", "1", "1", "1", "", "" ], [ "402886f453f8e30b0153f8e6eb610024", "123", "30 Mar 2016 16:00:00 GMT", "30 Mar 2016 16:00:00 GMT", "1", "0", "1", "1", "1", "", "" ], [ "402886f453f8e30b0153f8e75a720027", "654", "6 Apr 2016 16:00:00 GMT", "6 Apr 2016 16:00:00 GMT", "1", "0", "1", "1", "1", "", "" ], [ "402886f453f8e30b0153f8f17ae2002b", "123", "8 Apr 2016 16:00:00 GMT", "8 Apr 2016 16:00:00 GMT", "1", "0", "1", "1", "1", "", "" ], [ "402886f453f8e30b0153f8f512460031", "123", "30 Mar 2016 16:00:00 GMT", "30 Mar 2016 16:00:00 GMT", "1", "0", "1", "1", "1", "", "" ], [ "402886f453f8e30b0153f8f868390036", "232", "31 Mar 2016 16:00:00 GMT", "31 Mar 2016 16:00:00 GMT", "1", "0", "1", "1", "1", "", "" ], [ "402886f453f8e30b0153f8f8e893003b", "123", "21 Apr 2016 16:00:00 GMT", "21 Apr 2016 16:00:00 GMT", "1", "0", "1", "1", "1", "", "" ], [ "402886f453f8e30b0153f8fc84a60040", "654", "12 Apr 2016 16:00:00 GMT", "12 Apr 2016 16:00:00 GMT", "1", "0", "1", "1", "1", "", "" ], [ "402886f453f8e30b0153f90024610045", "123", "17 Apr 2016 16:00:00 GMT", "17 Apr 2016 16:00:00 GMT", "1", "0", "1", "1", "1", "", "" ], [ "402886f453f8e30b0153f9078ca2004a", "133", "13 Apr 2016 16:00:00 GMT", "13 Apr 2016 16:00:00 GMT", "1", "0", "1", "1", "1", "", "" ] ],
			  "success" : true,
			  "issort" : true,
			  "end" : "10 May 2016 03:20:04 GMT"
			} */
			var date = new Date(data);
			//$("#demoReply").html(date);
			dwr.util.setValue("demoReply",data);
		});
	}
</script>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	<p>
		Name: <input type="text" id="demoName" />
		<input value="Send" type="button" onclick="firstDwr()" /><br/>
		Reply: <span id="demoReply"></span>
	</p>
</body>
</html>
