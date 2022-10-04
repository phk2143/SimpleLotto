import java.util.Arrays;
import java.util.Random;

public class Lotto {
	
	public void lottoRange(){
		
		int lottoNumber[] = new int[6];
		Random random = new Random();
		int temp;
		
		/**1~45 난수 발생*/
		for (int i=0; i<lottoNumber.length; i++) {
			lottoNumber[i] = random.nextInt(45)+1;
			
			/**중복제거 */
			for(int j=0; j<i; j++) {
				if(lottoNumber[i] == lottoNumber[j]) {
					i--;
					break;
				}
			}
		}
		/**내림차순 sort*/
		for (int i=0; i<lottoNumber.length; i++) {
			for (int j=0; j<i; j++) {
				if(lottoNumber[i]<lottoNumber[j]) {
					temp = lottoNumber[i];
					lottoNumber[i] = lottoNumber[j];
					lottoNumber[j] = temp;
				}
			}
		}
		System.out.println("로또 번호: " + Arrays.toString(lottoNumber));
	}
}
