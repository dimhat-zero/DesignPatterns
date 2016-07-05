#Design Patterns Demo
设计模式学习demo示例

##目录
###创建型
+ demo1 Abstract Factory 抽象工厂 （子产品族）
+ demo2 Builder 生成器	（产品组合）
+ demo3 Factory Method 工厂方法  （多种产品）
+ demo4 Prototype 原型	（克隆）
+ demo5 Singleton 单例	

###结构型
+ demo6 Adapter 适配器 （对接）
+ demo7 Bridge 桥接 （双方都有多种选择）
+ demo8 Composite 组合 （树-叶层次结构）
+ demo9 Decorator 装饰 （扩展部分功能）
+ demo10 Facade 外观者 （集大成）
+ demo11 Flyweight 享元 (共用对象)
+ demo12 Proxy 代理 

###行为
+ demo13 Chain of Responsibility 职责链 （处理部分事情）
+ demo14 Command 命令 (回调函数替代品）
+ demo15 Interpreter 解释器
+ demo16 Iterator 迭代器
+ demo17 Mediator 中介者 (第三方)
+ demo18 Memnto 备忘录 (恢复到过去)
+ demo19 Observer 观察者 (订阅-发布)
+ demo20 State 状态 (不同状态下处理不同)
+ demo21 Strategy 策略
+ demo22 Template Method 模板方法
+ demo23 Visitor 访问者

P20

##比较
####抽象工厂和工厂方法的区别
抽象工厂是工厂方法的升级版本，工厂类从实现变成接口。从一级产品结构变成多级产品结构


##总结
创建型：简单工厂，单例
结构型：组合，装饰，外观，享元
行为型：观察者，状态，策略，模板方法

Thread代理了Runnable的run方法

目标：java.util.Observable，提供了目标需要的关键抽象：addObserver/deleteObserver/notifyObservers()等，具体请参考javadoc。
观察者：java.util.Observer，提供了观察者需要的主要抽象：update(Observable o, Object arg)，此处还提供了一种推模型（目标主动把数据通过arg推到观察者）/拉模型（目标需要根据o自己去拉数据，arg为null）。