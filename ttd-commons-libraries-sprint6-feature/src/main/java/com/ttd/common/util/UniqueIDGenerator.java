package com.ttd.common.util;

import java.util.UUID;

public class UniqueIDGenerator {

	public static long generateUniqueId() {

		UUID idOne = UUID.randomUUID();
		String str = "" + idOne;
		int uid = str.hashCode();
		String filterStr = "" + uid;
		str = filterStr.replaceAll("-", "");
		return Long.parseLong(str);
	}

}
