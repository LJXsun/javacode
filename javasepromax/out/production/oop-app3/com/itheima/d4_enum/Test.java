// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Test.java

package com.itheima.d4_enum;

import java.io.PrintStream;
import java.util.LinkedList;

// Referenced classes of package com.itheima.d4_enum:
//			A, Cat, Dog, Animal

public class Test
{

	public Test()
	{
	}

	public static void main(String args[])
	{
		A a1 = A.X;
		A a2 = A.Y;
		A a3 = A.Z;
		System.out.println(a2.ordinal());
		LinkedList list = new LinkedList();
		list.add("23");
		System.out.println(list);
		Animal c = aaa(new Cat());
		Dog c1 = (Dog)aaa(new Dog());
	}

	public static Animal aaa(Animal t)
	{
		return t;
	}
}
