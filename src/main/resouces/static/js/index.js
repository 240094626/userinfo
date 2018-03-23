$(function(){
	$('#submit').on('click',function(){
		$.ajax({
			url:'search?t='+new Date().getTime(),
			type:'post',
			data:{
				"searchname":$('#searchname').val(),
				"order":$('#order').val()
			},
			success:function(json){
				$('#content').val('');
				if(!!json && json.length>0){
					var html = '';
					for(var i=0;i<json.length;i++){
						html+='<p>'+json[i].id+' | '
							+json[i].loginname+' | '
							+json[i].password + ' | '
							+json[i].name +'</p>';
					}
					$('#content').val(html);
				}
			},
			error:function(){
				$('#content').val('查询失败')
			}
		})
	});
});

