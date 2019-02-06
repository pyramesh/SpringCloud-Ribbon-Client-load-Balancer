# SpringCloud-Ribbon-Client-load-Balancer

RobbonClient starts with port - 8888
RibbonServer start with three instance with ports 9000, 9001 and 9002.
Eureka server starts with port -8761

when client is communicating with backend services through load balancer, get the responses 
from the any one of the backend service instances randamly.

The below URL is to get the respone from backend service.
  
  http://localhost:8888/ribbonClient/message/
