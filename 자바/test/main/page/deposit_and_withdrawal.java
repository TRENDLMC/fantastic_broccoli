package main.page;

import java.util.Scanner;

public class deposit_and_withdrawal {
	Scanner sca=new Scanner(System.in);
	int retry;
	String renum=null;
	Search search=new Search();
	
	public void meney(int x) {
		int y= x;
		if(y==1) {
		do {
		System.out.print("출금하실 계좌를 입력해주세요");
		renum=sca.next();
		String realnum=search.cunumsearch(renum);
		if(!renum.equals(realnum)){
			System.out.println("계좌번호가 틀렸습니다 재입력하시길바랍니다.:");
			retry=1;
		}else {
			retry=0;
		}
		}while(retry==1);
		
		
		System.out.print("계좌의 비밀번호를 입력해주십시오.:");
		int repass=sca.nextInt();
		int realpass=search.sepass(renum);
		if(repass!=realpass){
			System.out.println("비밀번호가 틀렸습니다.");
			return;
		}
		System.out.print("출금하실금액을 입력해주십시오:");
		 long money=sca.nextInt();
		 if(money<0) {
			 System.out.println("금액이 이상합니다 ");
			 return;
		 }
	
		 long russmoney=search.dbmoney(renum);
		
		 if(russmoney>money) {
			long ehs= russmoney-money;
		 search.updb(renum, ehs);
		 }else {
			 System.out.println("잔액이 모자릅니다");
		 }
		 long outmoney=search.dbmoney(renum);
		 System.out.println("현재잔액:"+outmoney);
		 return;
		 
		}
		else if(y==2){
			do {
			System.out.print("입금하실 계좌를 입력해주세요");
			renum=sca.next();
			String realnum=search.cunumsearch(renum);
			if(!renum.equals(realnum)){
				System.out.print("계좌번호가 틀렸습니다 재입력하시길바랍니다.:");
				retry=1;
				}else {
					retry=0;
				}
			}while(retry==1);
			System.out.print("입급하실금액을 입력해주십시오:");
			 long money=sca.nextInt();
			 if(money<0) {
				 System.out.println("금액이 이상합니다 ");
				 return;
				 }
				 
				long dbmoney=search.dbmoney(renum);
			 money +=dbmoney;
			 search.updb(renum, money);
			 
			 long outmoney=search.dbmoney(renum);
			 System.out.println("현재잔액:"+outmoney);
			return;
				}
		}
		 
	}




