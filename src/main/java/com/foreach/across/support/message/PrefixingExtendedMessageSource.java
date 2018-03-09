package com.foreach.across.support.message;

import org.springframework.context.MessageSourceResolvable;

/**
 * Wraps an existing {@link ExtendedMessageSource} and applies code prefixes to all non-absolute lookups.
 * If the original resolvable message wants to try code A and B, and the {@code PrefixingExtendedMessageSource}
 * has prefixes of X and Y defined. The actual message codes tried in order will be:
 * <ul>
 * <li>X.A</li>
 * <li>X.B</li>
 * <li>Y.A</li>
 * <li>Y.B</li>
 * </ul>
 * Depending on the propertie:
 * <ul>
 * <li>the fallback (no-prefix) will always be tried as well</li>
 * <li>the prefixing will also be applied to arguments that are a {@link ResolvableMessage} or {@link MessageSourceResolvable}</li>
 * </ul>
 *
 * @author Arne Vandamme
 * @since 0.0.1
 */
public class PrefixingExtendedMessageSource
{
}
