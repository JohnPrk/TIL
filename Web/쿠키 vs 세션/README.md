# 쿠키 vs 세션 및 자바 애플리케이션에서 세션 

<br/>

### 사용이유

- 쿠키와 세션은 `무상태성`(Stateless)을 띄는 HTTP 요청 간의 `상태 정보`(State)를 유지하고 계속 전달하는데 사용됩니다.
- 일반적으로 세션에 상태 정보를 저장해야하는 요청이 들어오게 되면, 서버 내부에서 세션과 세션-쿠키를 만들고 저장한 뒤 클라이언트에게 세션-쿠키를 전달합니다.
- 클라이언트는 전달받은 쿠키를 클라이언트 내부 메모리에 저장을 하고, 서버에 계속해서 요청을 할 때마다 요청 내용과 쿠키를 함께 서버로 다시 보냅니다.


<br/>

### 저장 위치

- 쿠키 : 쿠키는 만료시점에 따라서 클라이언트의 `웹 브라우저`가 `지정`하는 `메모리` 혹은 `하드디스크`에 텍스트 형태로 저장됩니다.
- 세션 : 세션은 서버의 메모리에 객체 형식으로 저장됩니다.



<br/>

### 만료 시점

- 쿠키 : 쿠키는 일반적으로 세션에서 만료 시점을 명시할 수 있습니다.
- 세션 : 세션은 사용 중인 기술이나 매커니즘에 따라서 다를 순 있지만, 개발자가 명시적으로 만료 시점을 명시할 수 있습니다.

<br/>

### 리소스

- 쿠키 : 클라이언트 컴퓨터 내부에 저장되고 클라이언트의 메모리를 사용합니다.
- 세션 : 세션은 서버 내부에 저장되고, 서버 메모리로 로딩 되기 때문에 세션이 생길 때마다 리소스를 차지합니다.

<br/>

### 개수 및 용량 제한

- 쿠키 : 클라이언트도 모르게 쿠키로 인해 문제가 발생하는 걸 막고자, 한 도메인당 20개, 하나의 쿠키 당 4KB로 제한이 존재합니다.
- 세션 : 클라이언트가 접속하면 서버에 의해 생성되므로 개수나 용량 제한 없습니다.

<br/>

### Cookie & Session 요약

|  | Cookie | Session |
| --- | --- | --- |
| 저장위치 | Client | Server |
| 저장형식 | Text | Object |
| 만료시점 | 쿠키 저장시 설정(설정 없으면 브라우저 종료 시) | 정확한 시점 모름 |
| 리소스 | 클라이언트의 리소스 | 서버의 리소스 |
| 용량제한 | 한 도메인 당 20개, 한 쿠키당 4KB | 제한없음 |

<br/>

### 자바, 스프링 애플리케이션에서는 어떻게 작동 될까요?

- 하단의 클래스들을 보면서 이해 해봅시다.

<br/>

### ServletRequest

- `Java 애플리케이션`에서 클라이언트의 `HTTP 요청`은 `서블릿`과 `상호 작용`할 때 `ServletRequest 인터페이스`를 통해 처리됩니다.
    
    ```java
    package javax.servlet;
    
    /**
    	 * Defines an object to provide client request information to a servlet. 
    	 * The servlet container creates a ServletRequest object and passes it as an argument to the servlet's service method.
    	 * A ServletRequest object provides data including parameter name
    	 * and values, attributes, and an input stream. 
    	 * Interfaces that extend ServletRequest can provide additional protocol-specific data
    
    	 * @see javax.servlet.http.HttpServletRequest
    	*/
    public interface ServletRequest {
    	
    	(...)
    	
    }
    
    ```
    
- `ServletRequest`의 `공식문서` 상의 내용을 정리하자면 다음과 같습니다.
    - 클라이언트의 `요청 정보`를 `서블릿`에게 제공하는 `객체`를 정의합니다.
    - 서블릿 컨테이너는 `서블릿 요청 객체`를 생성하고 이를 `서블릿`의 `서비스 메서드`에 `인수`로 전달합니다.
    - `서블릿 요청 객체`는 `매개변수 이름` 및 `값`, `속성` 및 `입력 스트림`을 포함한 데이터를 제공합니다.
- `ServletRequest 인터페이스`를 명시적으로 구현하지 않으면, `Default Request 구현체`를 통해서 처리되어집니다.
    
    <img width="700" alt="Untitled" src="https://user-images.githubusercontent.com/88137420/231933778-01521e2d-6fa6-4322-b113-896a68b9bc3c.png">
    
<br/>

### DefaultServlet 및 DispatcherServlet

- `SpringFramework`가 없는 `Java 애플리케이션`에서 `DefaultServlet`은 요청된 URL과 일치하는 다른 서블릿 매핑이 없을 때 HTTP 요청을 처리하기 위한 Default HttpServlet 구현체이며, 주로 `정적 리소스`를 제공합니다.
- `SpringFramework`를 사용하는 `Java 애플리케이션`에서 `HTTP 요청`이 도달하면 `DispatcherServlet`이 이를 수신하고, URL 패턴 및 구성에 따라 적절한 컨트롤러 및 핸들러 메소드에 요청합니다.
- `DefaultServlet` 객체와 `DispatcherServlet` 객체 모두 `Servlet 인터페이스`를 구현한 `Default 구현체`입니다.
    
    <img width="700" alt="Untitled1" src="https://user-images.githubusercontent.com/88137420/231933802-ec32960b-4638-4cde-8998-5af8711aacbf.png">
    
    ```java
    package org.apache.catalina.servlets;
    
    public class DefaultServlet extends HttpServlet {
    	(...)
    
    	@Override
        protected void service(HttpServletRequest req, HttpServletResponse resp)
                throws ServletException, IOException {
    
            if (req.getDispatcherType() == DispatcherType.ERROR) {
                doGet(req, resp);
            } else {
                super.service(req, resp);
            }
        }
    
        /**
    	     * Process a GET request for the specified resource.
    	     *
    	     * @param request The servlet request we are processing
    	     * @param response The servlet response we are creating
    	     *
    	     * @exception IOException if an input/output error occurs
    	     * @exception ServletException if a servlet-specified error occurs
         */
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    
            // Serve the requested resource, including the data content
            serveResource(request, response, true, fileEncoding);
        }
    }
    
    ```
    
    ```java
    package org.springframework.web.servlet;
    
    public class DispatcherServlet extends FrameworkServlet {
    	/**
    		* Exposes the DispatcherServlet-specific request attributes and delegates to {@link #doDispatch}
    		* for the actual dispatching.
    	**/
    	@Override
    	protected void doService(HttpServletRequest request, HttpServletResponse response) throws Exception {
    		logRequest(request);
    
    		// Keep a snapshot of the request attributes in case of an include,
    		// to be able to restore the original attributes after the include.
    		Map<String, Object> attributesSnapshot = null;
    		if (WebUtils.isIncludeRequest(request)) {
    			attributesSnapshot = new HashMap<>();
    			Enumeration<?> attrNames = request.getAttributeNames();
    			while (attrNames.hasMoreElements()) {
    				String attrName = (String) attrNames.nextElement();
    				if (this.cleanupAfterInclude || attrName.startsWith(DEFAULT_STRATEGIES_PREFIX)) {
    					attributesSnapshot.put(attrName, request.getAttribute(attrName));
    				}
    			}
    		}
    
    		// Make framework objects available to handlers and view objects.
    		request.setAttribute(WEB_APPLICATION_CONTEXT_ATTRIBUTE, getWebApplicationContext());
    		request.setAttribute(LOCALE_RESOLVER_ATTRIBUTE, this.localeResolver);
    		request.setAttribute(THEME_RESOLVER_ATTRIBUTE, this.themeResolver);
    		request.setAttribute(THEME_SOURCE_ATTRIBUTE, getThemeSource());
    
    		if (this.flashMapManager != null) {
    			FlashMap inputFlashMap = this.flashMapManager.retrieveAndUpdate(request, response);
    			if (inputFlashMap != null) {
    				request.setAttribute(INPUT_FLASH_MAP_ATTRIBUTE, Collections.unmodifiableMap(inputFlashMap));
    			}
    			request.setAttribute(OUTPUT_FLASH_MAP_ATTRIBUTE, new FlashMap());
    			request.setAttribute(FLASH_MAP_MANAGER_ATTRIBUTE, this.flashMapManager);
    		}
    
    		RequestPath previousRequestPath = null;
    		if (this.parseRequestPath) {
    			previousRequestPath = (RequestPath) request.getAttribute(ServletRequestPathUtils.PATH_ATTRIBUTE);
    			ServletRequestPathUtils.parseAndCache(request);
    		}
    
    		try {
    			doDispatch(request, response);
    		}
    		finally {
    			if (!WebAsyncUtils.getAsyncManager(request).isConcurrentHandlingStarted()) {
    				// Restore the original attribute snapshot, in case of an include.
    				if (attributesSnapshot != null) {
    					restoreAttributesAfterInclude(request, attributesSnapshot);
    				}
    			}
    			if (this.parseRequestPath) {
    				ServletRequestPathUtils.setParsedRequestPath(previousRequestPath, request);
    			}
    		}
    	}
    	@SuppressWarnings("deprecation")
    	protected void doDispatch(HttpServletRequest request, HttpServletResponse response) throws Exception {
    		HttpServletRequest processedRequest = request;
    		HandlerExecutionChain mappedHandler = null;
    		boolean multipartRequestParsed = false;
    
    		WebAsyncManager asyncManager = WebAsyncUtils.getAsyncManager(request);
    		(...)
    	}
    }
    
    ```
    
<br/>

### Request

- `Java 애플리케이션`에서 클라이언트의 `HTTP 요청`은 `서블릿`과 `상호 작용`할 때 `ServletRequest 인터페이스`를 통해 처리되는데, 이 때 사용되는 default 구현체가 `Request 객체`입니다.
- Request는 getSession 메서드를 통해서 세션을 생성하는데, 이 때 세션이 이미 존재하면 존재하는 세션을 반환하게 됩니다.
    
    ```java
    /**
    	 * Wrapper object for the Coyote request.
    	 *
    	 * @author Remy Maucherat
    	 * @author Craig R. McClanahan
     */
    public class Request implements HttpServletRequest {
    
      (...)
    	/**
         * @return the session associated with this Request, creating one
         * if necessary.
    	*/
      @Override
      public HttpSession getSession() {
          Session session = doGetSession(true);
          if (session == null) {
              return null;
          }
    
          return session.getSession();
      }
    
      /**
       * @return the session associated with this Request, creating one
       * if necessary and requested.
       *
       * @param create Create a new session if one does not exist
       */
      @Override
      public HttpSession getSession(boolean create) {
          Session session = doGetSession(create);
          if (session == null) {
              return null;
          }
    
          return session.getSession();
      }
    }
    
    protected Session doGetSession(boolean create) {
    
            // There cannot be a session if no context has been assigned yet
            Context context = getContext(); // 1번
            if (context == null) {
                return null;
            }
    
            // Return the current session if it exists and is valid
            if ((session != null) && !session.isValid()) {
                session = null;
            }
            if (session != null) {
                return session;
            }
    
            // Return the requested session if it exists and is valid
            Manager manager = context.getManager();
            if (manager == null) {
                return null;      // Sessions are not supported
            }
            if (requestedSessionId != null) {
                try {
                    session = manager.findSession(requestedSessionId);
                } catch (IOException e) {
                    if (log.isDebugEnabled()) {
                        log.debug(sm.getString("request.session.failed", requestedSessionId, e.getMessage()), e);
                    } else {
                        log.info(sm.getString("request.session.failed", requestedSessionId, e.getMessage()));
                    }
                    session = null;
                }
                if ((session != null) && !session.isValid()) {
                    session = null;
                }
                if (session != null) {
                    session.access();
                    return session;
                }
            }
    
            // Create a new session if requested and the response is not committed
            if (!create) {
                return null;
            }
            boolean trackModesIncludesCookie =
                    context.getServletContext().getEffectiveSessionTrackingModes().contains(SessionTrackingMode.COOKIE);
            if (trackModesIncludesCookie && response.getResponse().isCommitted()) {
                throw new IllegalStateException(sm.getString("coyoteRequest.sessionCreateCommitted"));
            }
    
            // Re-use session IDs provided by the client in very limited
            // circumstances.
            String sessionId = getRequestedSessionId();
            if (requestedSessionSSL) {
                // If the session ID has been obtained from the SSL handshake then
                // use it.
            } else if (("/".equals(context.getSessionCookiePath())
                    && isRequestedSessionIdFromCookie())) {
                /* This is the common(ish) use case: using the same session ID with
                 * multiple web applications on the same host. Typically this is
                 * used by Portlet implementations. It only works if sessions are
                 * tracked via cookies. The cookie must have a path of "/" else it
                 * won't be provided for requests to all web applications.
                 *
                 * Any session ID provided by the client should be for a session
                 * that already exists somewhere on the host. Check if the context
                 * is configured for this to be confirmed.
                 */
                if (context.getValidateClientProvidedNewSessionId()) {
                    boolean found = false;
                    for (Container container : getHost().findChildren()) {
                        Manager m = ((Context) container).getManager();
                        if (m != null) {
                            try {
                                if (m.findSession(sessionId) != null) {
                                    found = true;
                                    break;
                                }
                            } catch (IOException e) {
                                // Ignore. Problems with this manager will be
                                // handled elsewhere.
                            }
                        }
                    }
                    if (!found) {
                        sessionId = null;
                    }
                }
            } else {
                sessionId = null;
            }
            session = manager.createSession(sessionId); // 2번
    
            // Creating a new session cookie based on that session
            if (session != null && trackModesIncludesCookie) {
                Cookie cookie = ApplicationSessionCookieConfig.createSessionCookie(
                        context, session.getIdInternal(), isSecure());
    
                response.addSessionCookieInternal(cookie); // 3번
            }
    
            if (session == null) {
                return null;
            }
    
            session.access(); // 4번
            return session;
        }
    
    ```
    

- 1번 : 아직 컨텍스트가 할당되지 않았다면 세션을 생성할 수 없습니다.
    
    ```java
    package org.apache.catalina.core;
    
    /**
    	 * Standard implementation of the <b>Context</b> interface.  Each
    	 * child container must be a Wrapper implementation to process the
    	 * requests directed to a particular servlet.
    	 *
    	 * @author Craig R. McClanahan
    	 * @author Remy Maucherat
     */
    public class StandardContext extends ContainerBase
            implements Context, NotificationEmitter {
    	(...)
    }
    
    ```
    
- `StandardContext` 객체는 HTTP 요청 사이의 세션 데이터를 관리하는 간접적인 역할을 합니다.
- `StandardContext` 객체는 `org.apache.catalina.Manager`인스턴스 관리를 담당하며, 이는 웹 애플리케이션의 세션 수명 주기 및 스토리지를 차례로 관리합니다.
- 즉, `StandardContext` 객체가 HTTP 요청 간에 정보를 직접 저장하지 않는 것을 의미합니다.
- `org.apache.catalina.Context` 개체에는 구성, 리소스 및 응용 프로그램 내에 등록된 서블릿을 포함하여 웹 응용 프로그램에 대한 정보가 포함되어 있습니다. → `사실 잘 모르겠음`
- 2번 : 세션 아이디로 세션 생성
    
    ```java
    package org.apache.catalina.session;
    
    /**
    	 * Standard implementation of the Manager interface that provides
    	 * simple session persistence across restarts of this component (such as when the entire server is shut down and restarted, or when a particulaweb application is reloaded.
    	 * IMPLEMENTATION NOTE : Correct behavior of session storing and reloading depends upon external calls to the start() and stop() methods of this class at the correct times.
    	 *
    	 * @author Craig R. McClanahan
     */
    public class StandardManager extends ManagerBase {
    
    	(...)
    
    }
    
    package org.apache.catalina.session;
    
    public abstract class ManagerBase extends LifecycleMBeanBase implements Manager {
    	
    	(...)
    	protected Map<String, Session> sessions = new ConcurrentHashMap<>();
    	(...)
    }
    
    ```
    
    - `StandardManager`의 `공식문서` 상의 내용을 정리하자면 다음과 같습니다.
    - `StandardManger` 객체는 `부모 객체`인 `ManagerBase`의 `ConcurrentHashMap` 자료구조를 가지고 세션을 저장합니다.
    - 이 때, `ConcurrentHashMap`은 여러 스레드가 임계 구역 내에 안전하게 액세스하고 작업할 수 있도록 동기화 작업 수행하는 데이터 구조입니다.
    - `ConcurrentHashMap`에서 삽입, 검색, 수정 및 삭제 작업의 평균 시간 복잡도는 다음과 같습니다.
        - 삽입: O(1)
        - 검색: O(1)
        - 수정: O(1)
        - 삭제: O(1)
    - `StandardManager` 객체는 애플리케이션에서 필요에 따라 세션 개체(`HttpSession` 인스턴스)의 생성, 검색 및 제거를 처리합니다.
    - 이러한 세션 개체는 여러 HTTP 요청에서 사용자별 데이터를 저장하는 데 사용됩니다.
    - `StandardSession` 클래스는 세션 속성, 세션 이벤트 및 세션 처리를 포함하여 웹 애플리케이션 내 개별 사용자 세션의 상태 및 수명 주기를 관리하는 역할을 합니다.
        
        ```java
        package org.apache.catalina.session;
        
        	/**
        		 * Standard implementation of the Session interface.
        		 * This object is serializable, so that it can be stored in persistent storage or transferred to a different JVM for distributable session support.
        		 * IMPLEMENTATION NOTE : An instance of this class represents both the internal (Session) and application level (HttpSession) view of the session.
        		 * However, because the class itself is not declared public, Java logic outside of the org.apache.catalina.session package cannot cast an HttpSession view of this instance back to a Session view.
        		 * IMPLEMENTATION NOTE :  If you add fields to this class, you must make sure that you carry them over in the read/writeObject methods so that this class is properly serialized.
        		 *
        		 * @author Craig R. McClanahan
        		 * @author Sean Legassick
        		 * @author <a href="mailto:jon@latchkey.com">Jon S. Stevens</a>
        	 */
        	public class StandardSession implements HttpSession, Session, Serializable {
        		
        		(...)	
        	}
        }
        
        ```
        
- 3번 : 쿠키 생성 및 Response 객체에 쿠키 넣어주기
    - 쿠키에 관한 환경 설정 세팅
        
        ```java
        package org.apache.catalina.core;
        
        public class ApplicationSessionCookieConfig implements SessionCookieConfig {
        
        	/**
             * Creates a new session cookie for the given session ID
             *
             * @param context     The Context for the web application
             * @param sessionId   The ID of the session for which the cookie will be
             *                    created
             * @param secure      Should session cookie be configured as secure
             * @return the cookie for the session
        	*/
          public static Cookie createSessionCookie(Context context,
                  String sessionId, boolean secure) {
        
              SessionCookieConfig scc =
                  context.getServletContext().getSessionCookieConfig();
        
              // NOTE: The priority order for session cookie configuration is:
              //       1. Context level configuration
              //       2. Values from SessionCookieConfig
              //       3. Defaults
        
              Cookie cookie = new Cookie(
                      SessionConfig.getSessionCookieName(context), sessionId);
        
              // Just apply the defaults.
              cookie.setMaxAge(scc.getMaxAge());
              cookie.setComment(scc.getComment());
        
              if (context.getSessionCookieDomain() == null) {
                  // Avoid possible NPE
                  if (scc.getDomain() != null) {
                      cookie.setDomain(scc.getDomain());
                  }
              } else {
                  cookie.setDomain(context.getSessionCookieDomain());
              }
        
              // Always set secure if the request is secure
              if (scc.isSecure() || secure) {
                  cookie.setSecure(true);
              }
        
              // Always set httpOnly if the context is configured for that
              if (scc.isHttpOnly() || context.getUseHttpOnly()) {
                  cookie.setHttpOnly(true);
              }
        
              cookie.setPath(SessionConfig.getSessionCookiePath(context));
        
              return cookie;
          }
        }
        
        ```
        
- 4번 : 세션 접근 시간 기록

<br/>
