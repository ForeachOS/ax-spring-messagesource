package com.foreach.across.support.message;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;

import java.util.Locale;

/**
 * Looks up messages from a {@link MessageCodesProvider} and expects a {@link MessageCodeResult}.
 * Will convert the result into a {@link ResolvableMessageFormat} and cache the result if allowed.
 *
 * @author Arne Vandamme
 * @since 0.0.1
 */
public class ExtendedMessageSource implements MessageSource
{
	// cache
	// parser
	// source
	// message formatter

	@Override
	public String getMessage( String code, Object[] args, String defaultMessage, Locale locale ) {
		return null;
	}

	@Override
	public String getMessage( String code, Object[] args, Locale locale ) throws NoSuchMessageException {
		return null;
	}

	@Override
	public String getMessage( MessageSourceResolvable resolvable, Locale locale ) throws NoSuchMessageException {
		return null;
	}
}
