package com.hcltech.Excercisesday8;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
 
public @interface RequestForEnhancement {
	int id();
    String synopsis();
    String engineer();
    String date();
}
