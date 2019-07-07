## dubbo
####   1.服务提供者
`  <!--使用 zookeeper 注册中心暴露服务，注意要先开启 zookeeper   // ?register=false  不需要注册到注册中心-->
    <dubbo:registry address="zookeeper://localhost:2181?register=false"/>
     <!-- 用dubbo协议在20880端口暴露服务 -->
    <dubbo:protocol name="dubbo" port="20880" />`
####   2.服务消费者
  
   `<dubbo:registry address="zookeeper://localhost:2181"/>
    <!--使用 dubbo 协议调用定义好的 api.PermissionService 接口   若添加url属性则直接访问provide，不通过注册中心  url="dubbo://127.0.0.1:20880"-->
    <dubbo:reference id="permissionService" interface="com.alibaba.dubbo.demo.DemoService"  url="dubbo://127.0.0.1:20880/>`

 
