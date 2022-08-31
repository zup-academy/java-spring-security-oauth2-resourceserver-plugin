package {{inputs.application_package}}.shared.errorhandling;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.zalando.problem.spring.web.advice.security.SecurityAdviceTrait;

/**
 * Enables exception handling for Spring Security's AuthenticationException and AccessDeniedException
 *
 * Unfortunately, this handler is needed due to a bug in the Problem-Spring-Web v0.27.0:
 * https://github.com/zalando/problem-spring-web/issues/707
 */
@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class SecurityExceptionHandler implements SecurityAdviceTrait {

}
