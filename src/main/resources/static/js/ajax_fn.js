var AIM_url={customer:"customer",sales:"sales",common:"common",DMC:"dmc",report:"report"}
function ajax_fn(type,url,data,callback,beforeSendFn)
    {
    	$.ajax({
    		type:type,
    		url:getRootPath()+url,
    		contentType:"application/json",
    		data:data,
			beforeSend:function(){
				if(!beforeSendFn)return;
				beforeSendFn();
			},
    		success:function(data){
    			callback(data);
    		},
    	})
		.fail(function() {
			alert( "response error." );
		})
    }
function getRootPath() {
	var pathName = window.location.pathname.substring(1);
	var webName = pathName == '' ? '' : pathName.substring(0, pathName.indexOf('/'));
	return window.location.protocol + '//' + window.location.host + '/';
}
