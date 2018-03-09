package com.foreach.across.support.message;

import lombok.Builder;

/**
 * @author Arne Vandamme
 * @since 0.0.1
 */
@Builder(toBuilder = true)
public final class MessageCodeResult
{
	/**
	 * This result should never be cached.
	 */
	public static final int CACHE_NEVER = -1;

	/**
	 * This result can be cached forever.
	 */
	public static final int CACHE_INFINITELY = 0;

	private final String messageCode;
	private final String value;
	private final int cacheTimeInMillis;

	// a code provider returns a message code result
	// if hierarchical and it has a cache time set, it will always adjust the
	// cache time
}
