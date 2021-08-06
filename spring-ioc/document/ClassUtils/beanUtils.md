BeanWrapper
PropertyValue
LocaleContextHolder  获取local
RequestContextHolder 可以随时获取    HttpServletRequest和 HttpServletResponse

RestControllerAdvice
ResponseBodyAdvice
RequestBodyAdvice
Model

View
ModelAndView 

#根据接口获取底层实现方法
Map map = BeanFactoryUtils.beansOfTypeIncludingAncestors(applicationContext, Animal.class);
