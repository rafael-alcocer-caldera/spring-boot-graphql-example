/**
 * Copyright [2021] [RAFAEL ALCOCER CALDERA]
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package rafael.alcocer.caldera.spring.boot.graphql.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import rafael.alcocer.caldera.spring.boot.graphql.model.Thing;

@Service
public class ThingServiceImpl implements ThingService {

    private Map<String, Thing> map = new HashMap<>();

    @Override
    public Thing getThingDetailsByName(String name) {
        return null != name ? map.get(name) : null;
    }

    @Override
    public Thing createThingRecord(Thing thing) {
        if (null != thing) {
            map.put(thing.getName(), thing);
        }

        return thing;
    }
}
