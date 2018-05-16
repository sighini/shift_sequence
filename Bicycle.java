import java.math.RoundingMode;
import java.text.DecimalFormat;

class Bicycle {
	
	public static void main(String[] args) {
		int[] f_cogs = {38, 30};
		int[] r_cogs = {28, 23, 19, 16};
		final float ratio = 1.6f;
		int f_init_value = 38;
		int r_init_value = 28;
		int f_start_index = 0;
		int r_start_index = 0;
		int count = 0;
		
		//Get front index
		for (int i = 0; i < f_cogs.length; i++) {
			if (f_cogs[i] == f_init_value) {
				f_start_index = i;
			}
		}
		
		//Get rear index
		for (int i = 0; i < r_cogs.length; i++) {
			if (r_cogs[i] == r_init_value) {
				r_start_index = i;
			}
		}
		
		DecimalFormat df = new DecimalFormat("#.#");
		df.setRoundingMode(RoundingMode.CEILING);
		//df.setRoundingMode(RoundingMode.DOWN);
		for (int i = f_start_index; i < f_cogs.length; i++) {
			for (int j=r_start_index; j < r_cogs.length; j++) {
				count++;
				float r = ((float) f_cogs[i] )/r_cogs[j];
				System.out.println(count + " - F: " + f_cogs[i] + " R: " + r_cogs[j] + " Ratio " + new DecimalFormat("#.###").format(r));

				//Hack..not recommended
				if (i == f_start_index) {
					j = r_cogs.length;
				}
				//Hack end
				
				if (ratio == Float.parseFloat(df.format(r))) {
					break;
				}
			}
		}
}
