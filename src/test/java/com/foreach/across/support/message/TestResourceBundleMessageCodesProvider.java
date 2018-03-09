package com.foreach.across.support.message;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.util.Locale;
import java.util.ResourceBundle;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Arne Vandamme
 * @since 0.0.1
 */
class TestResourceBundleMessageCodesProvider
{
	@Test
	void defaultResourceBundleMessageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename( "bundles.properties.messages" );
		messageSource.setDefaultEncoding( "UTF-8" );

		assertThat( messageSource.getMessage( "one", null, Locale.UK ) ).isEqualTo( "one" );
	}

	@Test
	void resourceBundleMessageCodesProvider() {
		ResourceBundleMessageCodesProvider codesProvider = new ResourceBundleMessageCodesProvider();


		ResourceBundle bundle ;


	}
}
