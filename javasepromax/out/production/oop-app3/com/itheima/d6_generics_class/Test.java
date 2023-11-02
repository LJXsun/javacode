// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Test.java

package com.itheima.d6_generics_class;

import java.io.PrintStream;
import java.util.ArrayList;

public class Test
{

	public Test()
	{
	}

	public static void main(String args[])
	{
		ArrayList animals = new ArrayList();
		test(animals);
	}

	public static Object test(Object t)
	{
		Object t1 = null;
		System.out.println(t1);
		return t;
	}
}
