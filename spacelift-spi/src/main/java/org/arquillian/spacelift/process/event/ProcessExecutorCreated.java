/*
 * JBoss, Home of Professional Open Source
 * Copyright 2014, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.arquillian.spacelift.process.event;

import org.arquillian.spacelift.process.ProcessExecutor;

/**
 * Event that is fire right after ProcessExecutor is available. Can be used to modify executor object.
 *
 * @author <a href="kpiwko@redhat.com">Karel Piwko</a>
 *
 */
public class ProcessExecutorCreated {

    private final ProcessExecutor executor;

    public ProcessExecutorCreated(ProcessExecutor executor) {
        this.executor = executor;
    }

    public ProcessExecutor getExecutor() {
        return executor;
    }
}
