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
package rafael.alcocer.caldera.spring.boot.graphql.resolvers;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import rafael.alcocer.caldera.spring.boot.graphql.model.Thing;
import rafael.alcocer.caldera.spring.boot.graphql.service.ThingService;

@Component
public class ThingMutationResolver implements GraphQLMutationResolver {

    private final ThingService thingService;

    public ThingMutationResolver(ThingService thingService) {
        this.thingService = thingService;
    }

    public Thing createThing(Thing thing) {
        return thingService.createThingRecord(thing);
    }
}
