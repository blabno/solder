/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
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

package org.jboss.solder.exception.control.test.common.extension.literal;

import javax.enterprise.util.AnnotationLiteral;

import org.jboss.solder.exception.control.test.common.extension.CatchQualifier;

@SuppressWarnings("all")
public class CatchQualifierLiteral extends AnnotationLiteral<CatchQualifier> implements CatchQualifier {
    private static final long serialVersionUID = 6052715391406598552L;
    public static final CatchQualifier INSTANCE = new CatchQualifierLiteral();
}