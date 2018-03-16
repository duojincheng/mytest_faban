package test;

public class functions {
	public static void main(String[] args) {
		Boolean isMatch =false;
		//============±ê¼Ç
		for (int i = 0; i < backuo.logs.length; i++) {
			int matchNo=0;
			for (int j = 0; j < backuo.bugs.length; j++) {
				if (backuo.logs[i].contains(backuo.bugs[j])) {
					isMatch=true;
					matchNo=matchNo+1;
				}
			}
			if (!isMatch) {
				System.out.println(i+"     "+backuo.logs[i]);
				
			}else{
				System.out.println("====================="+matchNo+"==============================");
				System.out.println(i+"     "+backuo.logs[i]);
				System.out.println("====================="+matchNo+"====================");
			}
			isMatch=false;
		}
		System.out.println("******************************Î´matchµÄbugºÅÂë******************************");
		for (int i = 0; i < backuo.bugs.length; i++) {
			
			for (int j = 0; j < backuo.logs.length; j++) {
				if (backuo.logs[j].contains(backuo.bugs[i])) {
					isMatch=true;
					
				}
			}
			if (isMatch) {
//				System.out.println(i+"     "+backuo.bugs[i]);
			}else{
				System.out.println(backuo.bugs[i]);
			}
			isMatch=false;
		}
	}

}
