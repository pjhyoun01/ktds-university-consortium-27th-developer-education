package com.ktdsuniversity.edu.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class FileReadOldExam {

	public static void main(String[] args) {

//		운영체제의 정보를 가져오는 방법
		Properties props = System.getProperties();
		String homePath = props.get("user.home").toString();
//		System.out.println(props);
//		System.out.println(props.get("user.home"));

		Map<String, String> env = System.getenv();
//		System.out.println(env);
//		System.out.println(env.get("HOME"));

//		System.out.println(File.separator);
//		C:/Java Exam 폴더의 정보를 추출
		File directory = new File(homePath + File.separator + "Java Exam");
//		폴더의 이름 출력
		String directoryName = directory.getName();
		System.out.println(directoryName);
//		이 경로가 가리키는 것이 파일인지 폴더인지 구분
		boolean isFile = directory.isFile();
		System.out.println(isFile);
		boolean isDerectory = directory.isDirectory();
		System.out.println(isDerectory);
//		이 경로가 실제 존재하는 것 인지
		boolean exists = directory.exists();
//		t 존재하는 폴더, f 존재하지 않는 폴더
		System.out.println(exists);
//		이 경로의 크기 출력
		Long bytes = directory.length();
		System.out.println(bytes + " byte");

//		C:/Java Exam/Java Exam.txt = 파일의 정보를 출력
		File textFile = new File(homePath + File.separator + "Java Exam", "Java Exam.txt");
		System.out.println(textFile);
//		파일의 이름을 출력
		System.out.println(textFile.getName());
//		파일이 폴더인지 파일인지 구분해서 출력
		System.out.println(textFile.isFile());
//		이 파일이 실제 존재하는 것인지 출력
		System.out.println(textFile.exists());
//		파일의 크기를 출력
		System.out.println(textFile.length());
//		이 파일이 있는 부모의 경로를 출력
		System.out.println(textFile.getParent());
		System.out.println(textFile.getParentFile());
//		이 파일의 경로 출력
		System.out.println(textFile.getAbsolutePath());

//		readAndPrintFileDescriptionUseIO(homePath, File.separator + "Java Exam" + "Java Exam.txt");
		readAndPrintFileDescriptionUseNIO(homePath, File.separator + "Java Exam" + File.separator + "Java Exam.txt");
	}

	public static void readAndPrintFileDescriptionUseNIO(String parentPath, String file) {
//		읽으려는 파일을 특정
		File target = new File(parentPath, file);
//		파일의 내용을 읽는다
		try {
//			Files.lines(target.toPath());
			List<String> lines = Files.readAllLines(target.toPath());
			for (String line : lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

//		파일의 내용을 list에 할당한다
//		파일의 내용을 출력한다

	}

	public static void readAndPrintFileDescriptionUseIO(String parentPath, String file) {
//		1. 읽으려는 파일을 특정
		File target = new File(parentPath, file);
//		2. 파일이 존재하는지 확인

//		3. 읽으려는 대상이 진짜 파일이 맞는지 확인
		if (target.exists() && target.isFile()) {

			FileReader fileReader = null;
			BufferedReader bufferedReader = null;
//		4. 파일의 내용을 읽기 시작
			try {
//				4-1. 파일의 바이트를 Chunking해서 가져온다
				fileReader = new FileReader(target);
//				4-2. 파일의 내용을 String으로 변환
				bufferedReader = new BufferedReader(fileReader);

				String line = null;
				while (true) {
					line = bufferedReader.readLine();
					if (line == null) {
						fileReader.close();
						break;
					} else {
//						4-3. 내용을 출력
						System.out.print(line);
					}
				}
//				

			} catch (IOException ioe) {
				ioe.printStackTrace();
			} finally {
				if (bufferedReader != null) {
					try {
						bufferedReader.close();
					} catch (IOException e) {
					}
				}
				if (fileReader != null) {
					try {
						fileReader.close();
					} catch (IOException e) {
					}
				}
			}
		}
	}
}
