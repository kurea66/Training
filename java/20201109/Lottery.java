public class Lottery{
	public static void main(String[] args){
		int count=3;
		int sum=0;
		for(int i=0;i<count;i++){
			System.out.println(i+1+"回目");
			int num = new java.util.Random().nextInt(100)+1;
			System.out.println(num);
			if(num == 1){
				System.out.println("1000万円");
				sum += 10000000;
			}else if(num < 4){
				System.out.println("100万円");
				sum += 1000000;
			}else if(num < 7){
				System.out.println("10万円");
				sum += 100000;
			}else if(num < 11){
				System.out.println("1万円");
				sum += 10000;
			}else if(num < 21){
				System.out.println("1000円");
				sum += 1000;
			}else if(num < 41){
				System.out.println("100円");
				sum += 100;
			}else{
				System.out.println("ハズレ");
			}
		}
		System.out.println("獲得賞金は");
		System.out.printf("%,d円でした!%n",sum);
	}
}
