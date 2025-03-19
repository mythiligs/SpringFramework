package com.test.config;



import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudGatewayConfig {
	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder)
	{
		return builder.routes()
				.route(r->r.path("/product/**")
				.uri("http://localhost:1111/"))
				
				.route(r->r.path("/consumer/**")
						.uri("http://localhost:2222/"))
				.build();
	}
}
