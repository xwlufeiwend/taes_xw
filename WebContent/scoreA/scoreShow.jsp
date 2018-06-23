<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Echarts图表显示</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/echarts.min.js"></script>
</head>
<body>
<!-- 显示图表 -->
<p>点击<button class="btn btn-success" onclick="showScore()">score</button>显示图像</p>>
 <div id="main" style="width: 600px;height:400px;margin:50px 100px"></div>   
 <script type="text/javascript">
 function drewEcharts(ec){  
     console.log("1");  
    // 基于准备好的dom，初始化echarts实例  
    var myChart = ec.init(document.getElementById('main'));  
    console.log("2");  
    // 指定图表的配置项和数据  
    var option = {  
        tooltip : {  
            show : true  
        },  
        legend: {  
            data: ['进货量','进货量1']  
        },  
        xAxis: [{  
            type: 'category',  
        }],  
        yAxis: [{  
            type : 'value'  
            }],  
        series: [{  
            "name": '进货量',  
            "type": 'bar',  
        },{  
            "name": '进货量1',  
            "type": 'line',  
        }]  
    };  
    // 使用刚指定的配置项和数据显示图表。  
    loadDATA(option);  
    myChart.setOption(option);  
}  
function loadDATA(option){  
    $.ajax({  
        type: "post",  
        async: false,  
        url: "${pageContext.request.contextPath}/getData",  
        data: {},  
        dataType: "json",  
        success: function(result){  
            if(result){  
                //初始化option.xAxis[0]中的data  
                option.xAxis[0].data=[];  
                for(var i=0;i<result.length;i++){  
                  option.xAxis[0].data.push(result[i].carType);  
                }  
              //初始化option.series[0]中的data  
                option.series[0].data=[];  
                option.series[1].data=[];  
                for(var i=0;i<result.length;i++){  
                  option.series[0].data.push(result[i].carSum);  
                  option.series[1].data.push(result[i].carSum);  
                }  
            }  
        }  
    });  
}  
</script>  

</body>
</html>