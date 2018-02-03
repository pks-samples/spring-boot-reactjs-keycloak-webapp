/*
	Copyright 2018 Andre Schepers

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

	http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package eu.andreschepers.authservice.domain.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;
import java.util.Map;

public class UserPermissionsDto {

    private Map<String, Boolean> permissions;

    public UserPermissionsDto() {
        this.permissions = new HashMap<>();
    }

    @JsonAnySetter
    public void add(String key, Boolean value) {
        permissions.put(key, value);
    }

    public Map<String, Boolean> getProperties() {
        return permissions;
    }
}
