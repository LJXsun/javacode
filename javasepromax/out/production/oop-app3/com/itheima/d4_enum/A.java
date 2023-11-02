// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   A.java

package com.itheima.d4_enum;


public final class A extends Enum
{

	public static final A X = new A("X", 0);
	public static final A Y = new A("Y", 1);
	public static final A Z = new A("Z", 2);
	private String name;
	private static final A $VALUES[] = $values();

	public static A[] values()
	{
		return (A[])$VALUES.clone();
	}

	public static A valueOf(String name)
	{
		return (A)Enum.valueOf(com/itheima/d4_enum/A, name);
	}

	private A(String s, int i)
	{
		super(s, i);
	}

	private A(String s, int i, String name)
	{
		super(s, i);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	private static A[] $values()
	{
		return (new A[] {
			X, Y, Z
		});
	}

}
