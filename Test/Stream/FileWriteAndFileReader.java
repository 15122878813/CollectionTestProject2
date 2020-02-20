package Stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class FileWriteAndFileReader {
	
	public static void main(String[] args) {
		
		//写入到文件中
		writerToFile();
		
		//从文件中进行读取
		readFromFile();
	}

	private static void readFromFile() {
		
		StringBuffer sb = new StringBuffer();
		
		String file = "a.txt";
		
		try {
			
			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(
									new File(file))));
			String readLine = null;
			
			while ((readLine=bufferedReader.readLine())!=null) {
				
				sb.append(readLine).append("\n");
				
			}
			System.out.println(sb);
			
			System.out.println("写出文件成功");
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}

	private static void writerToFile() {
		String file = "a.txt";
		
		try {
			
			BufferedWriter bufferedWriter = 
					new BufferedWriter(
							new OutputStreamWriter(
									new FileOutputStream(
											new File(file))));
			
			bufferedWriter.write("张强高薪就业\n");
			bufferedWriter.write("哈哈哈");
			bufferedWriter.write("李超龙SB");
			
			bufferedWriter.flush();
			
			System.out.println("写入文件成功");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}
}
