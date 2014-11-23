/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.aethersanctum.lilrest.server;

import org.skife.config.Config;
import org.skife.config.Default;
import org.skife.config.TimeSpan;

/**
 */
public interface JaxRsServerConfig {
    @Config("basic.server.listen-port")
    @Default("8080")
    int port();

    @Config("basic.server.max-threads")
    @Default("500")
    int maxThreads();

    @Config("basic.server.idle-timeout")
    @Default("30000ms")
    TimeSpan idleTimeout();
}
