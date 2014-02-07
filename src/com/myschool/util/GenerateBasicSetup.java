package com.myschool.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateBasicSetup {
	
	public static void main(String[] args) {
		
		String mainPath = "C:\\Users\\3129348\\git\\MySchool\\src\\com\\myschool\\";
		String name= "StudentRegistration";
		String DAO[]= {"StudentRegistration"};
		
		
		
		String valString = name.substring(0,1).toLowerCase() + name.substring(1,name.length());
		String DAOIntCap[] = new String[DAO.length];
		for (int j = 0; j < DAO.length; j++) {
			DAOIntCap[j] = DAO[j].substring(0,1).toLowerCase() + DAO[j].substring(1,DAO[j].length());
		}
		
		File actionClass = new File(mainPath+"\\action\\"+name+"Action.java");
		File actionSeriveClass = new File(mainPath+"\\service\\"+name+"Service.java");
		File actionSeriveClassImpl = new File(mainPath+"\\service\\"+name+"ServiceImpl.java");
		File[] actionDAOClass = new File[DAO.length];
		File[] actionDAOClassImpl = new File[DAO.length];
		
		for (int i = 0; i < DAO.length; i++) {
			actionDAOClass[i] = new File(mainPath+"\\dao\\"+DAO[i]+"DAO.java");
			actionDAOClassImpl[i] = new File(mainPath+"\\dao\\"+DAO[i]+"DAOImpl.java");
		}
		
		
		String actionData="package com.myschool.action;\n" +
							"import org.apache.log4j.Logger;\n"+
							"import com.myschool.service."+name+"Service;\n"+
							"import com.opensymphony.xwork2.ActionSupport;\n"+
							"public class "+name+"Action extends ActionSupport {	\n"+
							"	private static Logger log = Logger.getLogger("+name+"Action.class);\n"+
							"	private "+name+"Service "+valString+"Service;\n"+
							generategetterSetter(name+"Service")+
							"}\n";
		
		String actionSeriveClassData="package com.myschool.service;\n"+
									"public interface "+name+"Service {\n"+
									"}";
		
		
		
		String temp ="";
				for (int i = 0; i < DAO.length; i++) {
					temp = "import com.myschool.dao."+DAO[i]+"DAO;\n"+
							"public class"+name+"ServiceImpl implements "+name+"Service{	\n"+
							"private SchoolClassDAO "+DAOIntCap[i]+";\n"+
							generategetterSetter(DAO[i]+"DAO");
							
				}
		String actionServiceImpl = "package com.myschool.service;\n"+temp+"}";
		
		writeInFile(actionClass, actionData, "ACTION");
		writeInFile(actionSeriveClass, actionSeriveClassData, "SERVICE");
		writeInFile(actionSeriveClassImpl, actionServiceImpl, "SERVICEIMPL");
		
		
		for (int i = 0; i < DAO.length; i++) {
			String actionDAOClassData = "package com.myschool.dao;\n"+
										"public interface "+DAO[i]+"DAO {\n"+
										"}";
			writeInFile(actionDAOClass[i], actionDAOClassData, "DAO");					
		}
		
		
		for (int i = 0; i < DAO.length; i++) {
			String actionDAOClassImplData = "package com.myschool.dao;\n"+
					"import org.springframework.orm.hibernate3.support.HibernateDaoSupport;\n"+
					"public class "+DAO[i]+"DAOImpl extends HibernateDaoSupport implements "+DAO[i]+"DAO{\n"+
					"}";

			writeInFile(actionDAOClassImpl[i], actionDAOClassImplData, "DAOIMPL");
		}
		
		
		
		
	}

	public static void writeInFile(File file, String data,String type)
	{
			FileWriter wiFileWriter = null;
			try {
				file.createNewFile();
				System.out.println("Creating file ="+file.getAbsolutePath());
				wiFileWriter = new FileWriter(file);
				wiFileWriter.write(data);
				wiFileWriter.close();
			} catch (IOException e) {
				if(wiFileWriter !=null)
					try {
						wiFileWriter.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				e.printStackTrace();
			}
	}
	
	private static String generategetterSetter(String string) {

		String intcap = string.substring(0,1).toLowerCase() + string.substring(1,string.length());
		String returStr = "public StaffService get"+string+"() {\n"+
								"return "+intcap+";\n"+
							"}\n"+
							"public void set"+string+"("+string+" "+intcap+") {\n"+
							"	this."+intcap+" = "+intcap+";\n"+
							"}\n";
		return returStr;
		
	}
}
