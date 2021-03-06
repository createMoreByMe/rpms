layui.use(['table','jquery','layer','form'], function() {
    //引入layui组件 每个模块需要引入且定义出来
    var table = layui.table;
    var $ = layui.jquery;
    var layer = layui.layer;
    var form = layui.form;
    //时间选择器


    table.render({
        elem: '#optDatagrid'
        ,url:'/opt/page'
        ,toolbar:"#toolbarDemo"
        ,parseData: function(res) { //res 即为原始返回的数据
            totalres=res;
            return {
                "code": 0, //解析接口状态
                "msg":"", //解析提示文本
                "count":res.total?res.total:0, //解析数据长度
                "data": res.rows?res.rows:null //解析数据列表
            }
        }
        ,id:'optList'
        ,cols: [[
            {type:'checkbox'}
            ,{field:'optid', width:80, title: '维修人员编号', sort: true}
            ,{field:'optname', width:80, title: '维修人员姓名'}
            ,{field:'age', width:80, title: '年龄'}
            ,{field:'email', width:80, title: '邮箱'}
            ,{field:'hiredate', width:80, title: '聘请时间'}

        ]]
        ,page: true
        //数据渲染完毕之后，执行done函数内部的代码
        ,done: function(res, curr, count){
            layui.use('laydate', function(){
                var laydate = layui.laydate;

                //执行一个laydate实例
                laydate.render({
                    elem: '#bignDate' //指定元素
                });
            });
            layui.use('laydate', function(){
                var laydate = layui.laydate;

                //执行一个laydate实例
                laydate.render({
                    elem: '#endDate' //指定元素
                });
            });
            /*注册点击事件*/
            $("button[data-type]").on("click",function () {
                var method=$(this).data("type");
                Allmethods[method]();
            });
        }
    });
    var Allmethods={
        reload(){
            table.reload('optList', {
                where: $("#optSeachForm").serializeObject()
                ,url: '/opt/search'
                ,page: {
                    curr: 1 //重新从第 1 页开始
                }
            });
        },
        add(){
            //清空form表单
            $("#opt").clearForm();
            //表示弹出窗体
            layer.open({
                type: 1,
                offset: '100px',
                title:'添加维修人员方式',
                area: ['450px', '400px'],
                content: $("#optFormDiv"), //这里content是一个普通的String
                //这里content是一个普通的String
                success: function(layero, index){
                    var shades = $(".layui-layer-shade");//解决自带的阴影框覆盖问题
                    if(shades.length>1){
                        $(shades[1]).remove();
                    }
                }
            });
        },
        delete(){
            //通过id拿到表格选中的行
            var checkStatus = table.checkStatus('optList');
            //获取选中的数据
            var rows = checkStatus.data;
            if(!rows.length){
                layer.alert('请选中数据进行删除!',{
                    icon: 2,
                    title :'提示'
                });
                return;
            }

            //定义一个数组，该数组专门用来存储id
            var ids = [];
            $.each(rows,function(index,obj){
                ids.push(obj.optid);
            });
            layer.confirm('你确认删除吗?', {icon: 3, title:'提示'}, function(index){

                $.get("/opt/delete",{"ids":ids.toString()},function(result){
                    if(result.success){
                        window.parent.location.reload();
                        //重新加载表格数据
                        table.reload('optTypeList');
                        //正常刷新界面，关闭窗口
                        layer.close(index);
                    }else{
                        //错误弹出信息提示
                        layer.alert(result.msg,{
                            icon: 2,
                            title :'错误'
                        })
                    }
                });

                //  根据指定弹出框对应的index进行删除
            });
        },
        update(){
            //表单进行清空
            $("#opt").clearForm();
            //通过id拿到表格选中的行
            var checkStatus = table.checkStatus('optList');
            //获取选中的数据
            var rows = checkStatus.data;
            console.debug(rows);
            //如果没有选中
            if(!rows.length){
                layer.alert('请选中数据进行修改!',{
                    icon: 2,
                    title :'提示'
                });
                return;
            }
            //表示弹出窗体
            layer.open({
                type: 1,
                title:'修改维修单',
                offset: '100px',
                area: ['450px', '400px'],
                content: $("#optFormDiv"), //通过id拿到弹出的表单
                success: function(layero, index){
                    //成功打开窗体 消除遮蔽
                    var shades = $(".layui-layer-shade");
                    if(shades.length>1){
                        $(shades[1]).remove();
                    }
                }

            });
            //如果多选 返回第一个选中的行
            var row = rows[0];
            /*
            if(row.opt){
                row["optid"] = row.opt.optid;
            }*/
            //部门为对象不为空 将行添加属性方便展示
            //回显
            form.val("opt", row);

        }
    }
    form.on('submit(demo1)', function(data) {
        console.debug(data);
        //拿到隐藏域的id 辨别是否是修改  有id是修改 没有id是新增
        var url = "/opt/save";
        $.post(url, data.field, function (result) {
            if(result.success){
                //提示用户信息，添加数据成功
                layer.msg("操作数据成功");
                //关闭窗口
                layer.closeAll();
                //刷新界面
                table.reload('optList');
            }else{
                layer.alert("操作失败", {
                    "title":"错误",
                    "icon":2
                });
            }
        });
    })
})
layui.use('laydate', function(){
    var laydate = layui.laydate;

    //执行一个laydate实例
    laydate.render({
        elem: '#hiredate' //指定元素
    });
});

