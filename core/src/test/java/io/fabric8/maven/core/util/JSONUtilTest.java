/*
 * Copyright 2016 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */

package io.fabric8.maven.core.util;/*
 *
 * Copyright 2015-2016 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.json.JSONObject;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author roland
 * @since 07/02/17
 */
public class JSONUtilTest {

    @Test
    public void simple() {
        JSONObject first = new JSONObject("{first: bla, second: blub}");
        JSONObject same = new JSONObject("{second: blub, first: bla   }");
        JSONObject different = new JSONObject("{second: blub, first: bla2   }");
        assertTrue(JSONUtil.equals(first, same));
        assertFalse(JSONUtil.equals(first, different));
    }
}