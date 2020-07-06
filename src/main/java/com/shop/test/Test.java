package com.shop.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;


public class Test {
	public static void main(String[] args) throws Exception {
		
		String str = "00";
			System.out.println(Integer.parseInt(str));
			String str1 = "09";
			System.out.println(Integer.parseInt(str1));
	}
}
