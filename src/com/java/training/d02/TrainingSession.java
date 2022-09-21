package com.java.training.d02;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface TrainingSession {
    TrainingDay trainingDay();
    String topic();
    String[] subtopics() default {};
}
