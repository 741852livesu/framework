SpringMVC 初始化
1.HttpServletBean#init()  加载 Servlet 相关属性并设置给当前 Servlet 对象，然后调用 FrameworkServlet.initServletBean 方法继续完成 Servlet 的初始化操作。
2.FrameworkServle initServletBean()->initWebApplicationContext()->createWebApplicationContext ()->wac.refresh()->ContextRefreshListener()
->onApplicationEvent()->DispatcherServlet.onRefresh() 则主要是初始化了 WebApplicationContext；
3.DispatcherServlet.onRefresh()  则主要是初始化了自身的九个组件

SpringMVC 源码分析之 FrameworkServlet
执行service()
processRequest()
LocaleContextHolder  获取local
RequestContextHolder 可以随时获取    HttpServletRequest和 HttpServletResponse
都是基于ThreadLocal实现保证线程安全

SpringMVC 源码分析之  DispatcherServlet
doService()
doDispatch()