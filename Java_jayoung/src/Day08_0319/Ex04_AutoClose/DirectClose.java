package Day08_0319.Ex04_AutoClose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * test.txt 파일을 입력받아 텍스트 파일의 내용을 출력하는 프로그램
 */
public class DirectClose {

	public static void main(String[] args) {

		FileInputStream   fis = null;
		InputStreamReader in  = null;

		// test.txt 파일을 입력 할 수 있도록 연결

		// Start Try
		try {
			fis = new FileInputStream("test.txt");
			in  = new InputStreamReader(fis, "UTF-8");

			int read = 0;
			while ((read = in.read()) != -1) {
				System.out.print((char) read);
			}

		} catch (FileNotFoundException e) {
			// 파일 없음
			System.out.println("파일을 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// 인코딩 에러
			System.out.println("지원하지 않는 인코딩 타입 입니다.");
			e.printStackTrace();
		} catch (IOException e) {
			// 파일 입출력 에러
			System.out.println("파일 입출력에 관련된 예외가 발생했습니다.");
			e.printStackTrace();

		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (fis != null) {
				try {
					fis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		// End try
	}
}
