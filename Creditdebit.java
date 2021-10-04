package Phase1;
import java.util.Scanner;
public class Creditdebit {
		int balance;
		Scanner sc;
		void select(){
			char ch='y',op;
			System.out.println("Enter the balance of your account:");
			sc=new Scanner(System.in);
			balance=sc.nextInt();
			System.out.println("Welcome for transaction:");
			while(ch=='y'||ch=='Y'){
				System.out.println("Select your option:");
				System.out.println("Press C for Credit:");
				System.out.println("Press D for Debit:");
				op=sc.next().charAt(0);
				if(op=='C'||op=='c'){
					credit();
				}
				else if(op=='d'||op=='D'){
					debit();
				}
				else{
					System.out.println("Invalid option!!");
				}
				System.out.println("Do you want to continue[y/n]");
				ch=sc.next().charAt(0);
			}
		}
		void dispcr(){
			System.out.println("Transaction done on : 04/10/2021");
			System.out.println("Amount credited successfully!!");
			System.out.println("Final amount:"+balance);
		}
		void dispdb(){
			System.out.println("Transaction done on : 04/10/2021");
			System.out.println("Amount debited successfully!!");
			System.out.println("Final amount:"+balance);
		}
		void credit(){
			int cr;
			System.out.println("Enter the amount which you want to add:");
			cr=sc.nextInt();
			balance+=cr;
			dispcr();
		}
		void debit(){
			int db;
			System.out.println("Enter the amount which you want to debit: ");
			db=sc.nextInt();
			if(db>balance){
				System.out.println("Insufficient Funds:");
			}
			else
			{
				balance-=db;
				dispdb();
			}
		}
		public static void main(String args[]){
			Creditdebit cd=new Creditdebit();
			cd.select();
		}
	}


