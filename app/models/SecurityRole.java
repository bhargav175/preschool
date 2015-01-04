/*
 * Copyright 2012 Steve Chaloner
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package models;

import be.objectify.deadbolt.core.models.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Steve Chaloner (steve@objectify.be)
 */
@Entity
public class SecurityRole extends Model implements Role {
	public static final String TEACHER_ROLE = "teacher";
	public static final String ADMIN_ROLE = "admin";
	public static final String PARENT_ROLE = "parent";
	public static final String USER_ROLE = "user";

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("id")
	@Id
	public Long id;

	@JsonProperty("roleName")
	public String roleName;

	public static final Finder<Long, SecurityRole> find = new Finder<Long, SecurityRole>(
			Long.class, SecurityRole.class);

	@JsonIgnore
	@Override
	public String getName() {
		return roleName;
	}

	public static SecurityRole findByRoleName(String roleName) {
		return find.where().eq("roleName", roleName).findUnique();
	}


}
