package test01;

import java.util.ArrayList;
import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
// 입력값
//		5
//		1 1 3 1 2 //? 두번째 최대값 해결못함.
		Scanner sc = new Scanner(System.in);
		System.out.println("테스트 횟수 입력: ");
		int T=sc.nextInt(); //T = Test case
		
		for(int i=1; i<=T; i++) {
			System.out.println("매매 N일수 입력(2 이상): ");
			int N = sc.nextInt(); //N = 매매 일수
			if(2<=N && N<=1000000) {
				int price[] = new int[N]; //매매가 = 일일 시세/ 배열길이선언은 Index가 아님.
//								System.out.println("price[] 길이: "+price.length);
				int max=0; 			
				int profit=0;
				for(int k=0; k<N; k++) {
					System.out.println("가격 10,000 이하로 입력: ");
					price[k] = sc.nextInt(); //배열에 값 입력
//								System.out.println("price["+k+"] : "+price[k]);
					//max 값 구하기
					if(price[k]<=10000) { //값 체크
						if(max < price[k]){
							max = price[k]; //최대값 구하기 (매도값)
						} 
//							System.out.println("맥스값은 "+max);
					}else {
						System.out.println("0~10,000 이하로 입력: ");
						price[k]=sc.nextInt(); // 해당 인덱스에 다시 입력;
					}
					
				}// end-매매가입력
				//이익 계산
				ArrayList<Integer> buy = new ArrayList<Integer>();
				for(int x=0; x<price.length;x++) {
//					System.out.println("인덱스["+x+"]"+price[x]);
					if(price[x]<max) {
						buy.add(price[x]); //매입목록
					}else {
						for(int f=0; f<buy.size();f++) {
							profit +=max - buy.get(f);
						}
					}
				}
				System.err.println("#"+i+" "+profit); // 결과출력
				
			}else {
				System.out.println("재입력 : 1,000,000 이하");
				System.out.println("매매 N일수 입력(2 이상): ");
				N = sc.nextInt();
			}//end-매매일입력
		}//end-테스트횟수
		
	}//end-main
}//end-class