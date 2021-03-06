/*
* Copyright 2019 NexCloud Co.,Ltd.
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
package com.nexcloud.rdb.mapper.mysql;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.nexcloud.rdb.domain.mysql.User;

@Repository("UserMapper")
public interface UserRepository {
	public List<User> getUserList();
	public User getUser(String userId);
	public boolean addUser(User user);
	public boolean deleteUser(String userId);
	public boolean changePassword(User user);
}
