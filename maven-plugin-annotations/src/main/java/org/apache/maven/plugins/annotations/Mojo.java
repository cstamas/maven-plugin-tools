package org.apache.maven.plugins.annotations;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Olivier Lamy
 * @since 3.0
 */
@Documented
@Retention( RetentionPolicy.RUNTIME )
@Target( ElementType.TYPE )
@Inherited
public @interface Mojo
{
    String name();

    LifecyclePhase defaultPhase() default LifecyclePhase.NONE;

    DependencyScope requiresDependencyResolution() default DependencyScope.RUNTIME;

    DependencyScope requiresDependencyCollection() default DependencyScope.RUNTIME;

    String instantiationStrategy() default "per-lookup";

    String executionStrategy() default "once-per-session";

    boolean requiresProject() default true;

    boolean requiresReports() default false;

    boolean aggregator() default false;

    boolean requiresDirectInvocation() default false;

    boolean requiresOnline() default false;

    boolean inheritByDefault() default true;

    String configurator() default "";

    boolean threadSafe() default false;
}