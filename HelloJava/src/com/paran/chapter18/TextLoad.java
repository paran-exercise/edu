package com.paran.chapter18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextLoad {

	public static void main(String[] args) {

		// 파일 변수 file을 만든다
		File file = new File("D:\\1.txt"); // (ex) "C:\\파일이름.txt");
		try {
			// BufferedReader 변수에 file을 넣는다
			BufferedReader reader = new BufferedReader(new FileReader(file));
			// 파일을 한줄씩 읽어 넣기 위한 변수 line
			String line = null;
			// 하나의 line을 split 하여 넣을 배열 splitedStr
			String[] splitedStr = null;

			// 한 줄씩 읽어서 line에 넣은 후 null이 아니면 실행
			while ((line = reader.readLine()) != null) {
				// 초기화
				splitedStr = null;
				// 탭을 기준으로 잘라서 splitedStr 에 넣는다
				splitedStr = line.split("\t");
				// 배열에 들어간 길이 만큼 반복한다
				for (int i = 0; i < splitedStr.length; i++) {

					// 양쪽의 공백을 제거하고 다시 입력한다
					splitedStr[i] = splitedStr[i].trim();
					// splitedStr 을 List<Class명>에 입력하는 등 이용가능하다
				}
			}
			reader.close();
		} catch (FileNotFoundException fnf) {
			fnf.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			
			System.out.println("");
		}
	}
}
