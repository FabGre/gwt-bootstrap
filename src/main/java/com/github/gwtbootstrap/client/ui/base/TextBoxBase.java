/*
 *  Copyright 2012 GWT-Bootstrap
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.github.gwtbootstrap.client.ui.base;

import com.google.gwt.dom.client.Element;
import com.google.gwt.text.shared.testing.PassthroughParser;
import com.google.gwt.text.shared.testing.PassthroughRenderer;

/**
 * Abstract base class for most text entry widgets. and Support Bootstrap style.
 * 
 * @since 2.0.4.0
 * @author ohashi keisuke
 * @see com.google.gwt.user.client.ui.TextBoxBase
 */
public class TextBoxBase extends ValueBoxBase<String> {

	/**
	 * Creates a text box that wraps the given browser element handle. This is
	 * only used by subclasses.
	 * 
	 * @param elem
	 *            the browser element to wrap
	 */
	protected TextBoxBase(Element elem) {
		super(elem, PassthroughRenderer.instance(), PassthroughParser.instance());
	}

	/**
	 * Overridden to return "" from an empty text box.
	 */
	@Override
	public String getValue() {
		String raw = super.getValue();
		return raw == null
							? ""
							: raw;
	}

}
