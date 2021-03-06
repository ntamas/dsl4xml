package com.sjl.dsl4xml;

import org.xmlpull.v1.*;

public interface ReadingContext extends HasConverters {

	public abstract <T> T peek();

	public abstract void push(Object aContext);

	public abstract <T> T pop();

	public abstract XmlPullParser getParser();

	public abstract boolean hasMoreTags();

	public abstract int next();

	public abstract boolean isTagNamed(String aTagName);

	public abstract boolean isStartTag();

	public abstract String getAttributeValue(String anAttributeName);

	public abstract String getAttributeValue(int anIndex);

	public abstract boolean isTextNode();

	public abstract boolean isStartTagNamed(String aNamespace, String aTagName);
	
	public abstract boolean isNotEndTag(String aNamespace, String aTagName);

}