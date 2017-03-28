import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main05 {

	public static final String LOG_FILE_NAME = "log.txt";
	
	public static void main(String[] args) throws IOException {
		//System.in
		//System.out
		
		//1) System : 환경
	
		// System.in :환경에서 뭔가 데이터를 받아오겠다. (대표적인 입력 장치로부터...)
		//     키보드
		
		// System.out : 환경에다 뭔가 내가 발생시킨 데이터를 출력하겠다.
		//   모니터(콘솔)		(대표적인 출력 장치에다가..)
		
		// 키보드로 입력 받은 내용을 전부다 log.txt에 저장
		// "exit" 입력 시 프로그램 종료
		// 프로그램을 다시 실행하면 log.txt에 입력 되어 있던 내용을 표시
		// Buffered Reader / Writer를 사용 할 것
		
		// 최초 실행 시 log.txt가 없어 -> createNewFile()
		// 있다면 내용 다 뿌려주고 다시 입력 받기 실행 (isAppend = true)
		// 이어쓰기
		// Write 할 때 뒤에 \n 붙일 것..
		
		
		
		Scanner scan = new Scanner(System.in);
		
		File file = new File(LOG_FILE_NAME);
		
		if(file.exists()){
			FileReader in = new FileReader(file);
			BufferedReader br = new BufferedReader(in);
			
			String readMsg = "";
			System.out.println("--------이전 로그--------");
			
			while( (readMsg = br.readLine()) != null){
				System.out.println(readMsg);
			}
			
			br.close();
			System.out.println("-----------------------");
		}else{
			System.out.println(LOG_FILE_NAME + " 파일을 생성합니다.");
			file.createNewFile();
		}
		
		FileWriter out = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(out);

		String writeMsg = "";
		while(!writeMsg.toLowerCase().equals("exit")){
			System.out.print(">> ");
			writeMsg = scan.nextLine();
			
			if(!writeMsg.toLowerCase().equals("exit")){
				bw.write(writeMsg+"\n");
			}
			
		}
		
		bw.close();
		scan.close();
		System.out.println("프로그램 종료");
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
