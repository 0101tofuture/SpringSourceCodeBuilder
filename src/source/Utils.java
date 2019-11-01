package source;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Utils {

	public static boolean isEmpty(String str) {
		if(str==null||str.trim().equals("")) {
			return true;
		}
		return false;
	}
	
	public static String getSystemUpLoadFile(String state) {
		String os = System.getProperty("os.name");
		StringBuffer path=new StringBuffer();
		if(!os.toLowerCase().startsWith("win")){  
			path.append("/usr/ProjectManagerUploadFile/lastversion");
		}else {
			path.append("C:/usr/ProjectManagerUploadFile/lastversion");
		}
		if("1".equals(state)) {
			path.append("/sit");
		}else if("2".equals(state)) {
			path.append("/uat");
		}else if("3".equals(state)) {
			path.append("/temp");
		}
		
        Calendar now = Calendar.getInstance();  
        String year=String.valueOf(now.get(Calendar.YEAR));  
        String month=String.valueOf(now.get(Calendar.MONTH) + 1);  
        String day=String.valueOf(now.get(Calendar.DAY_OF_MONTH));  
        path.append("/"+year+"/"+month+"/"+day);
		File file = new File(path.toString());
		mkDirs(file);
		if(!file.exists()) {
			file.setWritable(true, false); 
			file.mkdirs();
		}
		return path.toString();
	}
	
	public static String getCurrentDate() {
		 SimpleDateFormat  aSimpleDateFormat=new SimpleDateFormat("YYYY-MM-dd");
		 Calendar now = Calendar.getInstance();
		 return aSimpleDateFormat.format(now.getTime());
	}
	
	public static String getCurrentDateTimeFm() {
		 SimpleDateFormat  aSimpleDateFormat=new SimpleDateFormat("YYYY-MM-dd_HH_mm_ss");
		 Calendar now = Calendar.getInstance();
		 return aSimpleDateFormat.format(now.getTime());
	}
	
	public static String getCurrentDateTime() {
		 SimpleDateFormat  aSimpleDateFormat=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		 Calendar now = Calendar.getInstance();
		 return aSimpleDateFormat.format(now.getTime());
	}
	
	public static boolean mkDirs(File file) {
		if(file!=null) {
			if(file.getParentFile()!=null) {
				if(!file.getParentFile().exists()) {
					file.getParentFile().setWritable(true, false);
					file.getParentFile().mkdir();
					return mkDirs(file.getParentFile());
				}
			}
		}
		return true;
	}
	
	/**
	 * �ַ����ĵ�һ����ĸ��д
	 * 
	 * @param str
	 *            �ַ���
	 * @return String ��������ַ���
	 */
	private static String firstUpperCase(String str) {
		if (str == null) {
			return "";
		}

		if (str.length() == 1) {
			str = str.toUpperCase();
		} else {
			str = str.substring(0, 1).toUpperCase() + str.substring(1);
		}
		return str;
	}
	
}
//                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   