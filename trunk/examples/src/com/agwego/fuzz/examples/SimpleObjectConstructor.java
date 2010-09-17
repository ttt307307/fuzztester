/*
 * Copyright (c) 2010. Agwego Enterprises Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *
 * If you modify this software a credit would be nice
 */

package com.agwego.fuzz.examples;

/**
 * String helpers
 *
 * @author Tim Desjardins
 * @version $Rev$
 * <br/>
 * $Id$
 */

public class SimpleObjectConstructor
{
	private final String strObj;
	private final Integer intObj;
	private final Boolean boolObj;

	public SimpleObjectConstructor()
	{
		strObj = "";
		intObj = 0;
		boolObj = false;
	}

	public SimpleObjectConstructor( String strObj, Integer intObj, Boolean boolObj )
	{
		this.strObj = strObj;
		this.intObj = intObj;
		this.boolObj = boolObj;
	}

	public String getStrObj()
	{
		return strObj;
	}

	public Integer getIntObj()
	{
		return intObj;
	}

	public Boolean getBoolObj()
	{
		return boolObj;
	}

	public String toString()
	{
		return String.format( " strObj = %s, intObj = %s, boolObj = %s ", strObj, intObj, boolObj );
	}
}