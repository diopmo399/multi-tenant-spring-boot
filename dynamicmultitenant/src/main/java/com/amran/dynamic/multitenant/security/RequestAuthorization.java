package com.amran.dynamic.multitenant.security;

import java.lang.annotation.*;

/**
 * @author Mohamed DIOP
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface RequestAuthorization {
}
