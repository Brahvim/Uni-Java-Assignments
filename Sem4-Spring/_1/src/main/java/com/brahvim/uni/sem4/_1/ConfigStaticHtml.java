package com.brahvim.uni.sem4._1;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ConfigStaticHtml implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(final ResourceHandlerRegistry p_reg) {
		p_reg.addResourceHandler("/**")
				.addResourceLocations("classpath:/static/")
				.setCacheControl(CacheControl.maxAge(1, TimeUnit.DAYS)); // One year!

		// // From classpath (e.g. `src/main/resources/web/`):
		// p_reg.addResourceHandler("/pages/**")
		// .addResourceLocations("classpath:/web/");

		// // From absolute path:
		// p_reg.addResourceHandler("/docs/**")
		// .addResourceLocations("file:/var/www/html/");

		// // Fallback paths chain:
		// p_reg.addResourceHandler("/static/**")
		// .addResourceLocations(
		//
		// "file:/opt/app/static/",
		// "classpath:/fallback-static/"
		//
		// );

		// // With caching:
		// p_reg.addResourceHandler("/assets/**")
		// .addResourceLocations("classpath:/assets/")
		// .setCacheControl(CacheControl.maxAge(1, TimeUnit.HOURS));
	}

}
