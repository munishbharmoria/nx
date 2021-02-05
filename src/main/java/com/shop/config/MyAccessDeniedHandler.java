//package com.shop.config;
//
//
//import org.springframework.security.access.AccessDeniedException;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.web.access.AccessDeniedHandler;
//import org.springframework.stereotype.Component;
//
//import com.shop.util.CacheNxData;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.logging.Logger;
//
//// handle 403 page
//@Component
//public class MyAccessDeniedHandler implements AccessDeniedHandler {
//
//	static Logger LOGGER = Logger.getLogger(MyAccessDeniedHandler.class.getName());
//
//    @Override
//    public void handle(HttpServletRequest httpServletRequest,
//                       HttpServletResponse httpServletResponse,
//                       AccessDeniedException e) throws IOException, ServletException {
//
//        Authentication auth
//                = SecurityContextHolder.getContext().getAuthentication();
//
//        if (auth != null) {
//            logger.info("User '" + auth.getName()
//                    + "' attempted to access the protected URL: "
//                    + httpServletRequest.getRequestURI());
//        }
//
//        httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/403");
//
//    }
//}
//
