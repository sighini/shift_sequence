import java.math.RoundingMode;
import java.text.DecimalFormat;

class Bicycle {
	
	public static void main(String[] args) {
		int[] f_cogs = {38, 30};
		int[] r_cogs = {28, 23, 19, 16};
		final float ratio = 1.6f;
		int f_init_value = 38;
		int r_init_value = 28;
		
		float init_ratio = ((float)f_init_value)/r_init_value;
		int count = 0;
		
		DecimalFormat df = new DecimalFormat("#.#");
		df.setRoundingMode(RoundingMode.CEILING);
		for (int i = 0; i < f_cogs.length; i++) {
			for (int j = 0; j < r_cogs.length; j++) {
				float r = ((float) f_cogs[i] )/r_cogs[j];
				
				if (init_ratio < ratio) {
					if (r < ratio) {
						count++;
						System.out.println(count + " - F: " + f_cogs[i] + " R: " + r_cogs[j] + " Ratio " + new DecimalFormat("#.###").format(r));
					}	
				} else {
					if (r > ratio) {
						count++;
						System.out.println(count + " - F: " + f_cogs[i] + " R: " + r_cogs[j] + " Ratio " + new DecimalFormat("#.###").format(r));
					}	
				}
				

			}
		}
	}
}
