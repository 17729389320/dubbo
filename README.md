# dubbo
  1.服务提供者
  <!--使用 zookeeper 注册中心暴露服务，注意要先开启 zookeeper   // ?register=false  不需要注册到注册中心-->
    <dubbo:registry address="zookeeper://localhost:2181?register=false"/>
     <!-- 用dubbo协议在20880端口暴露服务 -->
    <dubbo:protocol name="dubbo" port="20880" />
  2.服务消费者
  
   <dubbo:registry address="zookeeper://localhost:2181"/>
    <!--使用 dubbo 协议调用定义好的 api.PermissionService 接口   若添加url属性则直接访问provide，不通过注册中心  url="dubbo://127.0.0.1:20880"-->
    <dubbo:reference id="permissionService" interface="com.alibaba.dubbo.demo.DemoService"  url="dubbo://127.0.0.1:20880/>

# <u>**best-chinese-front-end-blogs收集优质的中文前端博客（不定期更新中）**</u>


### 注：博主的公司信息来自网上公开资料，仅供参考，不保证准确性。个人（控制在42个以内）阮一峰的网络日志（蚂蚁金服）
### 《读懂 ECMAScript 规格》《JavaScript 内存泄漏教程》贺师俊/Hax（百姓网）

###### 《JavaScript — The World’s Best Programming Language》《参加第十届D2前端技术论坛，你有什么收获？》《jQuery会过时吗？》方正《React 16 架构研究记录》太狼《Hello RxJS》司徒正美（去哪儿）
###### 《mobx源码解读》《为什么虚拟DOM更优胜一筹》《迷你MVVM框架avalon在兼容旧式IE做的努力》题叶（饿了么、前 Teambition）
###### 《简聊首屏性能优化方案一些记录》《想象一下未来如何写代码和调试》寸志（原陆金所）
###### 《为什么整个互联网行业都缺前端工程师》《与外刊君一起学习2016前端开发者大会 PPT》
