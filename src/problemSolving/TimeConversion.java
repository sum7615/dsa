package problemSolving;

import java.util.Arrays;

public class TimeConversion {
	public String timeConversion(String s) {
		String[] str = s.split(":");
		String zone = str[2].substring(2, 4);
		str[2] = str[2].substring(0, 2);

		if(zone.equals("PM")) {
			if(!str[0].equals("12")) {
				int i = Integer.parseInt(str[0]);
				i+=12;
				str[0]=""+i;
			}
			
		}
		if(zone.equals("AM") && str[0].equals("12")) {
			str[0]="00";
		}
		return str[0]+":"+str[1]+":"+str[2];
	}
}
