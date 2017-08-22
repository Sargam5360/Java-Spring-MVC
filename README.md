# Java-Spring-MVC

In Spring Web MVC, DispatcherServlet class works as the front controller. 
It is responsible to manage the flow of the spring mvc application.

The @Controller annotation is used to mark the class as the controller in Spring 3.

The @RequestMapping annotation is used to map the request url. It is applied on the method. 

Following is the sequence of events corresponding to an incoming HTTP request to DispatcherServlet −

After receiving an HTTP request, DispatcherServlet consults the HandlerMapping to call the appropriate Controller. 

The Controller takes the request and calls the appropriate service methods based on used GET or POST method. 
The service method will set model data based on defined business logic and returns view name to the DispatcherServlet.
The DispatcherServlet will take help from ViewResolver to pickup the defined view for the request.
Once view is finalized, The DispatcherServlet passes the model data to the view which is finally rendered on the browser.

