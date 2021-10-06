# Spring_Initialization_lavesh
Bean Initialization & destruction in Spring IOC

In Short Initialization means Filling default/User defined values in Beans and after performing business logic shutdown(destruction) it

1. By using Property tag:-
<bean id="id1" class="com.lavesh.beans.WelcomeBean">
    <property name="name" value="lavesh" />
		<property name="message" value="Hiii Good moring!!!" />
</bean>

2. By using init and destroy methods:-
<bean id="id2" class="com.lavesh.beans.WelcomeBean1"
		init-method="init" destroy-method="destroy" />

3. By using callback "InitializingBean" and "DesposableBean" interface:- 

  implement InitializingBean and DesposableBean interface in bean class and
  override below methods: 
  
  @Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("****afterPropertiesSet() from WelcomeBean2 Class****");
		name = "Tanu";
		message=" hii good night";
		}

    @Override
  	public void destroy() throws Exception {
  		System.out.println("****destroy() from WelcomeBean2 Class****");
  		name="";
  		message="";
  		
  	}  

4. By using @PostConstruct and @Predestroy annotations
  dont forget to add required XSD in xml file 

eg.
  <beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:context="http://www.springframework.org/schema/context"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd 
        http://www.springframework.org/schema/context 
        http://www.springframework.org/schema/context/spring-context.xsd">
	<context:annotation-config />

  this will activate annotations

