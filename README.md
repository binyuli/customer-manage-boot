# customer-manage-boot
  
  分享一个关于 cookie 验证登录的管理系统，主要有两种登录方式，一种是管理帐号密码登录，另一种是通过发动态验证码给在册用户(这里就不把发验证码的服务放进去了),页面详情是预约客户的信息的 CRUD ，以及发短信(同样具体实现也没有纳入到当前项目);

  如果遇到程序内存当中还是正常的但写到数据库时中文就乱码了的情况，请参考:[解决方案](http://blog.csdn.net/blueheart20/article/details/52385142));

  初始数据放在了 manage.sql 文件中;
  
  系统首页地址: http://localhost:8083/customerManage.html;
  
  测试用管理员用户名: 13166666666 , 密码: 123456 ;
