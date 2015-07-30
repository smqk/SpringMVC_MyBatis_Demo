
delete from td_menu;

insert into td_menu(menuId,mName,parentID,url,descript,orderValue)
values('52b9e32300a6496d8d3da486c3ba9997','首页',null,'/',null,1),
	('4ddd9e90a5cb4712881d781a1974c96e','关于我们',null,'/aboutUs',null,2),
	('1b8cbb844aca4e25ba88a9397ad0349e','产品展示',null,'/productList',null,3),
	('b9f347580b134aa7b207723bcd09b64e','新闻资讯',null,'/news',null,4),
	('7020318e53a847f3b778144630aa2cc1','服务支持',null,'/serviceSupport',null,5),
	('c31af42429374ff9b3a80ce950eca6d4','解决方案',null,'/solution',null,6),
	('a4b4f487536d459188e8007a795c827e','下载中心',null,'/download',null,7),
	('3a3a9509e0be4ff4961db1c12d8404cf','联系我们',null,'/contactUs',null,8);

-- 关于我们 的 --> 二级菜单
insert into td_menu(menuId,mName,parentID,url,descript,orderValue)
values('a40c1977044c4e1588502dd48fdd26bd','企业简介','4ddd9e90a5cb4712881d781a1974c96e','/aboutUs/companyProfile','关于我们 -> 企业简介',1),
	('bee5978f8fd94319abb6b92f5af40314','企业文化','4ddd9e90a5cb4712881d781a1974c96e','/aboutUs/corporateCulture','关于我们 -> 企业文化',2),
	('9de2b15fac724a4bbd85677b16a39034','银行资料','4ddd9e90a5cb4712881d781a1974c96e','/aboutUs/bankInformation','关于我们 -> 银行资料',3),
	('ddc9011e984b42f4adc37d4bfc1a55bd','新闻资讯','4ddd9e90a5cb4712881d781a1974c96e','/aboutUs/newsInfo','关于我们 -> 新闻资讯',4),
	('523ea35be2a54918b97e3db1c94bdda7','他们的选择','4ddd9e90a5cb4712881d781a1974c96e','/aboutUs/theyChoose','关于我们 -> 他们的选择',5);

-- 产品展示 的 --> 二级菜单
insert into td_menu(menuId,mName,parentID,url,descript,orderValue)
values('1b8587f04fa94d8a8b1c3e499d2546e0','三维激光扫描仪','1b8cbb844aca4e25ba88a9397ad0349e','/productList/type1','产品展示 -> 三维激光扫描仪',1),
	('1c9894ab6625486cabc5579af009436b','数据处理软件','1b8cbb844aca4e25ba88a9397ad0349e','/productList/type2','产品展示 -> 数据处理软件',2),
	('944dd11c3d014af09632f36541f2abda','原装配件','1b8cbb844aca4e25ba88a9397ad0349e','/productList/type3','产品展示 -> 原装配件',3),
	('3cdf2a46c09440d8b700e54db98c3b5c','激光扫描仪应用','1b8cbb844aca4e25ba88a9397ad0349e','/productList/type4','产品展示 -> 激光扫描仪应用',4),
	('8dc1aa2ddc75440b9b06fda769f99466','激光扫描仪建模','1b8cbb844aca4e25ba88a9397ad0349e','/productList/type5','产品展示 -> 激光扫描仪建模',5);
commit;



--产品类别
insert into td_product_type(typeId,tName,descript,orderValue)
values('05819d71787e4675a1bf103dea5f0a9f','三维激光扫描仪','三维激光扫描仪【描述】',1),
	('255a3f4a93024a5d8080acca1ff6d5cf','数据处理软件','数据处理软件【描述】',2),
	('8c89f64d34d74568ac84bd52b49c0c61','三维激光处理软件','三维激光处理软件【描述】',3),
	('fb8728e9c5cc4ba285afa3d68710938f','原装配件','原装配件【描述】',4),
	('4987fefdeb5f4e31857c3e5996e42b32','Java软件开发','Java软件开发【描述】',5),
	('8c7e709d850341338265da335de7eb47','三维激光扫描仪研发','三维激光扫描仪研发【描述】',6),
	('33e2c4f22dff46baa10147c15591e1ea','三维激光扫描仪零配件','三维激光扫描仪零配件【描述】',7),
	('63b84186ffa4469c942719ca8ff31050','数字三维激光扫描仪','数字三维激光扫描仪【描述】',8);
commit;


DELETE FROM td_product
-- 三维激光扫描仪产品
insert into td_product(productId,typeId,pName,icon,detail,status,orderValue,publishDate,publishTime)
values('82adb0a2a45545239aaa0963c79a8f91','05819d71787e4675a1bf103dea5f0a9f','SC70三维激光扫描仪','/uploadfile/images/product/1-110922213133152.jpg','产品详情....','推荐',1,'2014-12-21','15:45:36.123'),
	('029a71b937a74f63b386acfae8e3167f','05819d71787e4675a1bf103dea5f0a9f','VS1000三维激光扫描仪','/uploadfile/images/product/2-1110111242050-L.gif','产品详情....','推荐',2,'2014-12-21','15:46:36.123'),
	('a70d040f51b442c2b34210e1ab0854ba','05819d71787e4675a1bf103dea5f0a9f','SC500三维激光扫描仪','/uploadfile/images/product/2-1110111154400-L.gif','产品详情....','推荐',3,'2014-12-21','15:47:36.123'),
	('9dc0e8470f4b462894c1663d3e4fce8c','05819d71787e4675a1bf103dea5f0a9f','SC960三维激光扫描仪','/uploadfile/images/product/21123K039-1.jpg','产品详情....','推荐',4,'2014-12-21','15:48:36.123'),
	('5bd5b5c4c127490dada8b2bbe3dc32d8','05819d71787e4675a1bf103dea5f0a9f','3DSCAN三维建模与土方计算','/uploadfile/images/product/2-11101112420511-L.gif','产品详情....','推荐',5,'2014-12-21','15:49:36.123'),
	('887b2908032840c6a349b3257597b138','05819d71787e4675a1bf103dea5f0a9f','S1C50三维激光扫描仪','/uploadfile/images/product/338DLKP_324.jpg','产品详情....','推荐',6,'2014-12-21','15:50:36.123');


insert into td_customer_case(id,title,icon,descript,detail,date,time,orderValue)
values('acbcb1577e1a42d7beb78c4e6e5df20b','三维激光扫描技术在园林中的应用','uploadfile/images/customercase/case01.jpg','三维激光扫描技术在园林中的应用公告 （武汉三维激光扫描技术在园林中的应用…','详情。。。','2014-12-22','10:19:12.253',1),
	('90704fde01a34f789713a18bfc0a994c','三维激光扫描技术在高铁机车数字化测量中的应用','uploadfile/images/customercase/case02.jpg','武汉三维激光扫描技术在高铁机车数字化测量中的应用 华中地区三维激光扫描技术在高铁机车数字化…','详情。。。','2014-12-22','10:20:12.253',1),
	('a537dec1cc16469c86e742e9100c3254','三维激光扫描技术在矿山领域的应用','uploadfile/images/customercase/case03.jpg','2012年5月，武汉三维激光扫描技术在矿山领域的应用…','详情。。。','2014-12-22','10:20:12.253',3),
	('d56fb2a36d6147179f3e4ac124c5e1fc','维激光扫描技术在建筑数字化的应用','uploadfile/images/customercase/case04.jpg','由武汉光谷高薪支持维激光扫描技术在建筑数字化的应用…','详情。。。','2014-12-22','10:20:12.253',4);



-- 新闻类别
insert into td_news_type(typeId,name,descript)
values('ee58f2ec63134856abf0b9569a96ae23','公司动态','公司动态简介'),
	('5a95ddfeca1341dd9cee4e385bc522f5','行业资讯','行业资讯简介'),
	('eb830fc545104228893e9a2b9e906b4a','市场活动','市场活动简介');
	

	
	



-- 行业资讯新闻信息
insert into td_news(newsId,title,typeId,content,publishDate,publishTime,orderValue)
values('185fa9e9ebe045b2b4407d405a951b41','选用什么品牌三维激光扫描仪好','ee58f2ec63134856abf0b9569a96ae23','...',CURRENT_DATE(),CURRENT_TIME(),0),
	('588b20915b574ae3a3e2c03afe4cc104','三维激光扫描行业这两年行情','ee58f2ec63134856abf0b9569a96ae23','...',CURRENT_DATE(),CURRENT_TIME(),0),
	('fc5714fa56c041de887fe1009040ef89','您知道三维激光扫描仪提高工作效率','ee58f2ec63134856abf0b9569a96ae23','...',CURRENT_DATE(),CURRENT_TIME(),0),
	('d8cc487e635b4f3b9a543beabc26f128','教您如何选购三维激光扫描仪','ee58f2ec63134856abf0b9569a96ae23','...',CURRENT_DATE(),CURRENT_TIME(),0),
	('518628aa0647404eb1632f00c6c3601d','三维激光扫描仪销售技巧—销','ee58f2ec63134856abf0b9569a96ae23','...',CURRENT_DATE(),CURRENT_TIME(),0),
	('ea2d8de27a6a45138bc5a29b16ba971c','新款三维激光扫描仪有哪些？','ee58f2ec63134856abf0b9569a96ae23','...',CURRENT_DATE(),CURRENT_TIME(),0),
	('80ac91c2e84646fabdbee46e73f2e3ce','三维激光扫描仪官网微信公','ee58f2ec63134856abf0b9569a96ae23','...',CURRENT_DATE(),CURRENT_TIME(),0);

-- 公司动态新闻信息
	insert into td_news(newsId,title,typeId,content,publishDate,publishTime,orderValue)
	values('a1e6f32ca39c4839b0aa859a65632baf','公司预计明年三月份上市','5a95ddfeca1341dd9cee4e385bc522f5','...',CURRENT_DATE(),CURRENT_TIME(),0),
		('22925883a31b443c9d7f051b10b3da0e','2014公司年度财务报表','5a95ddfeca1341dd9cee4e385bc522f5','...',CURRENT_DATE(),CURRENT_TIME(),0),
		('78b8f0957fae4154bdc20a2d2606e754','公司被评先进单位','5a95ddfeca1341dd9cee4e385bc522f5','...',CURRENT_DATE(),CURRENT_TIME(),0),
		('ddc4296e13924c6b8fbafa03d026d3f8','公司发布新三维激光扫描仪','5a95ddfeca1341dd9cee4e385bc522f5','...',CURRENT_DATE(),CURRENT_TIME(),0),
		('7bce1cc5acc0461ab284e2070cd7fe8d','双*11公司活动','5a95ddfeca1341dd9cee4e385bc522f5','...',CURRENT_DATE(),CURRENT_TIME(),0),
		('681dfb1d6208414a9c6c7c841b9a49c9','欢庆春节','5a95ddfeca1341dd9cee4e385bc522f5','...',CURRENT_DATE(),CURRENT_TIME(),0);









