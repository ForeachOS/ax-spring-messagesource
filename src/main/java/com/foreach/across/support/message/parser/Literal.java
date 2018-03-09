/*
 * Copyright 2014 the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.foreach.across.support.message.parser;

import com.foreach.across.support.message.ResolvableMessageFormatContext;
import lombok.Data;

/**
 * @author Arne Vandamme
 * @since 3.0.0
 */
@Data
class Literal implements MessageToken, MessageTokenOutput
{
	private final String value;

	@Override
	public boolean isLocalized() {
		return false;
	}

	@Override
	public boolean requiresSynchronization() {
		return false;
	}

	@Override
	public MessageTokenOutput createFormat( ResolvableMessageFormatContext context ) {
		return this;
	}

	@Override
	public void write( StringBuilder output, ResolvableMessageFormatContext context ) {
		output.append( value );
	}
}
