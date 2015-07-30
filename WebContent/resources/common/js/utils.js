/*
 用JS获取地址栏参数的方法（超级简单）
方法一：采用正则表达式获取地址栏参数：（ 强烈推荐，既实用又方便！）

function GetQueryString(name)
{
     var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
     var r = window.location.search.substr(1).match(reg);
     if(r!=null)return  unescape(r[2]); return null;
}
 
// 调用方法
alert(GetQueryString("参数名1"));
alert(GetQueryString("参数名2"));
alert(GetQueryString("参数名3"));
下面举一个例子:

若地址栏URL为：abc.html?id=123&url=http://www.maidq.com

那么，但你用上面的方法去调用：alert(GetQueryString("url"));

则会弹出一个对话框：内容就是 http://www.maidq.com

如果用：alert(GetQueryString("id"));那么弹出的内容就是 123 啦；

当然如果你没有传参数的话，比如你的地址是 abc.html 后面没有参数，那强行输出调用结果有的时候会报错：

所以我们要加一个判断 ，判断我们请求的参数是否为空，首先把值赋给一个变量：

var myurl=GetQueryString("url");
if(myurl !=null && myurl.toString().length>1)
{
   alert(GetQueryString("url"));
}
这样就不会报错了！
 */


/**
 * 函数描述：获取地址栏的请求参数
 * @param paramName 参数名称
 * @return 对应参数名称（name）所对应的值
 */
function GetQueryString(paramName)
{
     var reg = new RegExp("(^|&)"+ paramName +"=([^&]*)(&|$)");
     var r = window.location.search.substr(1).match(reg);
     if(r!=null)return  unescape(r[2]); return null;
}



/**
 * 函数描述：为空判断，判断传入的参数是否为空,为空返回true,不为空返回false
 * @param str 判断输入的参数
 * @return [true|false]
 */
function isEmpty(str){
	if(str !=null && str.toString().length>1){
	   return false;
	}else{
		return true;
	}
}

/* URL 工具函数类   */
function UrlUtil(url){
	this.isError=false;
	this.errorInfo=[];		//错误信息
	this.baseUrl=null;
	this.params=[];			//初始化一个空数据来保持参数元素

	/*init start*/
	var index=url.indexOf("?"); 
	if(index>0){
		this.baseUrl=url.substring(0,index);
		var paramString=url.substr(index+1); //取得所有参数   stringvar.substr(start [, length ]
		
		var paramArray=paramString.split("&"); //各个参数放到数组里
		//alert("[paramArray.length]:"+paramArray.length);
		for(var i in paramArray){
			index=paramArray[i].indexOf("="); 
			
			if(index>0){ 
				var name=paramArray[i].substring(0,index);
				var value=paramArray[i].substr(index+1);
				this.params[name]=value;	
				this.params.length++;
			} 			
		} 

	//	alert("[this.params.length]:"+this.params.length);
	// 注意：javascript 中动态数据的length属性通常情况下不能用
	}else{
		this.baseUrl=url;
	}
	/*init end*/




	//添加参数（如果参数存在的话则覆盖参数）
	this.appendParam=function appendParam(paramName,paramValue){
		if(paramName){
			if(!this.params[paramName]){
				//参数不存在时添加，否则修改
				this.params.length++;
			}
			this.params[paramName]=paramValue;
			
		}
		return this;
	};

	//移除参数
	this.removeParam=function removeParam(paramName){
		if(this.params[paramName]){
			delete this.params[paramName];
			this.params.length--;
		}
	};


	//查找参数是否存在
	this.hasParam=function hasParam(paramName){
		if(this.params[paramName]){
			return true;
		}else{
			return false;
		}
	};

	//url地址字符串化
	this.toUrlString=function toUrlString(){
		var url=this.baseUrl;
		if(this.params.length>0){
			url+="?";
			for(var paramName in this.params){
				url=url+paramName+"="+this.params[paramName]+"&";
			}
			url=url.substr(0,url.length-1);
		}

		return url;
	};
}



/**
 * 函数描述：实现翻页跳转功能
 * @param pageNum 页数
 */
function turnPage(pageNum){
	var urlUtil=new UrlUtil(window.location.href);
	urlUtil.appendParam('pageNum',pageNum);
	window.location.href=urlUtil.toUrlString();
}