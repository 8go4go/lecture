Spring-Framework 연동
1. pom.xml을 위한 depency 추가 
    <springframework.version>5.3.20</springframework.version>
    <org.slf4j-version>1.7.30</org.slf4j-version>
     
    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-api</artifactId>
        <version>${org.slf4j-version}</version>
    </dependency>
    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>jcl-over-slf4j</artifactId>
        <version>${org.slf4j-version}</version>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-log4j12</artifactId>
        <version>${org.slf4j-version}</version>
        <scope>runtime</scope>
    </dependency>
    <!-- https://mvnrepository.com/artifact/javax.servlet/jstl -->
    <dependency>
        <groupId>javax.servlet</groupId>
        <artifactId>jstl</artifactId>
        <version>1.2</version>
    </dependency>
  
    <!-- https://mvnrepository.com/artifact/org.springframework/spring-context -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>${springframework.version}</version>
    </dependency>
    <!-- https://mvnrepository.com/artifact/org.springframework/spring-web -->
    <!-- https://mvnrepository.com/artifact/org.springframework/spring-web -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-web</artifactId>
        <version>${springframework.version}</version>
    </dependency>
    <!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-webmvc</artifactId>
        <version>${springframework.version}</version>
    </dependency>
  
    <!-- https://mvnrepository.com/artifact/org.springframework/spring-test -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-test</artifactId>
        <version>${springframework.version}</version>
        <scope>test</scope>
    </dependency>

2. web.xml에 ContextListener 와 DistpatcherServlet Declare
      <context-param>
          <param-name>contextConfigLocation</param-name>
          <param-value>/WEB-INF/spring/root-context.xml</param-value>
      </context-param>
      
      <listener>
          <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
      </listener>
  
      <servlet>
          <servlet-name>appServlet</servlet-name>
          <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
          <init-param>
              <param-name>contextConfigLocation</param-name>
              <param-value>/WEB-INF/spring/appServlet/servlet-context.xml</param-value>
          </init-param>
          <load-on-startup>1</load-on-startup>
      </servlet>
  
      <servlet-mapping>
          <servlet-name>appServlet</servlet-name>
          <url-pattern>/</url-pattern>
      </servlet-mapping>

3. servlet-context.xml와 root-context.xml 설정   
      <resources mapping="/resources/**" location="/resources/" />
      <beans:bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
          <beans:property name="prefix" value="/WEB-INF/views/" />
          <beans:property name="suffix" value=".jsp" />
      </beans:bean>

    <beans:bean id="helloController" class="org.k8go4go.myspring.controller.HomeController"/>

4. 저장을 위한 GIT 연동
   [ GitHub Repository 생성 ]
    먼저 GitHub에서 연동할 repository를 생성합니다.    
    1. GitHub에서 Repositories > New (클릭)
    2. Owner와 Repository name을 입력하고, 해당 Repository의 공개 여부 선택 후 Greate repository 버튼을 클릭합니다.
    3. 생성된 Repository를 확인합니다.
    4. 
    [ IntelliJ GitHub 로그인 ]
    이제 IntelliJ로 넘어와서 연동을 진행합니다.
    1. IntelliJ의 상단 메뉴에서 VCS → Get from Version Control (클릭)
    2. GitHub → Log in via GitHub (클릭)
    3. Aythorize in GitHub (클릭)
    4. Authorize JetBrains (클릭)
    
    IntelliJ File → Settings → GitHub GitHub와 연동된 것을 확인할 수 있습니다.
   
    [ 로컬 Git Repository 생성 ]
    이제 GitHub의 리모트 Repository와 연동을 위한 로컬 프로젝트의 디렉토리를 Git Repository로 만들어 보겠습니다.
    1. VCS → Create Git Repository (클릭)
    2. 로컬 프로젝트 선택 후 OK (클릭)
    
    [ IntelliJ에서 GitHub Repository 등록하기 ]
    이제 로컬에서 생성한 Git Repository와 연동할 GitHub의 Repository를 등록해보겠습니다.
    1. Git → Manage Remotes (클릭)
    2. + 버튼을 누른 뒤 GitHub Repository의 URL을 입력합니다.
    GitHub Repository의 URL은 Code 버튼을 클릭하여 확인할 수 있습니다.
    3. 정상적으로 연동된 것을 확인합니다.
    
    [ commit, push 진행하기 ]
    이제 실제 로컬 프로젝트를 GitHub에 commit과 push를 해보겠습니다.
    1. Git > Commit (클릭)
    2. commit 대상 선택, 메시지 입력 후 Commit (클릭)
    3. 정상적으로 Commit된 것을 확인합니다.
    4. Git > Push (클릭)
    5. Commit한 내용을 확인 후 Push (클릭)
    6. 정상적으로 Push된 것을 확인합니다.
