package com.myschool.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.lang.xwork.StringUtils;

public class SimpleClass {
	static String javaStr = "package com.myschool.beans;\n\nimport java.io.Serializable;\n"
			+ "\nimport javax.persistence.Column;"
			+ "\nimport javax.persistence.Entity;"
			+ "\nimport javax.persistence.Table;\n\n";
	static String getterSetterClass = "";

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\3129348\\Desktop\\test.txt");
		File fileDir = new File("E:\\SUMEET\\GENERATEDCLASS");
		String className = null;
		try {

			FileReader reader = new FileReader(file);
			BufferedReader in = new BufferedReader(reader);
			String string;
			int count = 0;
			boolean flag = true;
			while ((string = in.readLine()) != null) {
				
				if (!string.contains("CONSTRAINT") && flag) {
					if (!string.trim().equals("")) {
						if (count == 0) {
							String tableName = string.substring(
									string.indexOf("."),
									string.indexOf("(") - 1).replace(".", "");
							className = initCapTheString(
									tableName.replace("\"", ""), "Class");
							javaStr = javaStr + "@Entity\n" + "@Table(name="
									+ tableName + ")\n" + "public class "
									+ className.replace(".", "")
									+ " implements Serializable{\n";
							count++;

						} else {
							generateJavaCode(string);
						}
					}
				} else {
					if (!flag && !string.contains("CONSTRAINT") && string.contains(")")) {
						flag = true;
						count = 0;
						javaStr = javaStr + "\n\n"+getterSetterClass+"}";
						File classFile = new File(fileDir.getAbsoluteFile() + "\\" + className
								+ ".java");
						classFile.createNewFile();
						FileWriter writer = new FileWriter(classFile);
						writer.write(javaStr);
						writer.close();
						javaStr = "package com.myschool.beans;\n\nimport java.io.Serializable;\n"
								+ "\nimport javax.persistence.Column;"
								+ "\nimport javax.persistence.Entity;"
								+ "\nimport javax.persistence.Table;\n\n";
						getterSetterClass="";
					} else
						flag = false;
				}
			}
			in.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		

		System.out.println(javaStr);
	}

	private static void generateJavaCode(String parseStr) {

		String varibaleName = parseStr.substring(parseStr.indexOf("\""),
				parseStr.lastIndexOf("\"") + 1);
		javaStr = javaStr + "\n@Column(name=" + varibaleName + ")";

		if (parseStr.contains("VARCHAR2")) {
			javaStr = javaStr + "\nString ";
			getterSetter(initCapTheString(varibaleName,"Variable").replace("\"", ""),"String");
		} else if (parseStr.contains("NUMBER")) {
			javaStr = javaStr + "\nInteger ";
			getterSetter(initCapTheString(varibaleName,"Variable").replace("\"", ""),"Integer");
		}

		javaStr = javaStr
				+ initCapTheString(varibaleName.replace("\"", ""), "Variable")
				+ ";\n";
	}

	private static String initCapTheString(String varibaleName, String type) {

		String returnStr = "";
		String[] arr = varibaleName.split("_");
		for (int i = 0; i < arr.length; i++) {
			String firstChar = "";
			if (i != 0 || type.equals("Class")) {
				firstChar = arr[i].substring(0, 1);
			} else {
				firstChar = arr[i].substring(0, 1).toLowerCase();
			}
			String rest = arr[i].substring(1, arr[i].length()).toLowerCase();
			returnStr = returnStr + firstChar + rest;
		}
		return returnStr;
	}

	private static void getterSetter(String variable, String type)
	{
		String updVariable = variable.substring(0,1).toUpperCase() + variable.substring(1,variable.length());
		
		getterSetterClass = getterSetterClass + "public "+type+" get"+updVariable+"(){\n return "+variable+";\n}\n";
		getterSetterClass = getterSetterClass + "public void set"+updVariable+"("+type+" "+variable+"){\n this."+variable+"="+variable+";\n}\n";
	}
}
