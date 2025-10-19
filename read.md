cd ..
jar -cvf ProjetTest.war -C Test-Projet/ .

<servlet>
    <servlet-name>FrontServlet</servlet-name>
    <servlet-class>com.monframework.core.FrontServlet</servlet-class>
  </servlet>

  <!-- Mapping large pour intercepter toutes les URLs non existantes -->
  <servlet-mapping>
    <servlet-name>FrontServlet</servlet-name>
    <url-pattern>/</url-pattern>
  </servlet-mapping>