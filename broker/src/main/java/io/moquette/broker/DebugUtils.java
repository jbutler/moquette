/*
 * Copyright (c) 2012-2018 The original author or authors
 * ------------------------------------------------------
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */

package io.moquette.broker;

import io.netty.buffer.ByteBuf;

import java.nio.charset.StandardCharsets;

public final class DebugUtils {

    public static String payload2Str(ByteBuf content) {
        return content.copy().toString(StandardCharsets.UTF_8);
    }

    private DebugUtils() {
    }
}
