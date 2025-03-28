package Day07.Ex02_다중상속;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		tv.turnOn();
		tv.setVolume(30);
		int channel = tv.channelSearch("MBC");
		tv.setChannel(channel);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 컨텐츠 : ");
		String keyword = sc.nextLine();
		String[] content = tv.contentSearch(keyword);
		
		for (int i = 0; i < content.length; i++) {
			System.out.print(content[i]);
			if (i < content.length-1)    // 맨 마지막이 아닐때만 뒤에 콤마찍어주기위해서
				System.out.print(", ");
			
		}
		System.out.println();
		tv.receiveVoice("뉴스 틀어줘");
		tv.turnOff();
		sc.close();
		
		
	}
	
}
