public class TimeCalc {
    public static void main(String[] args) {

		int hoursIn = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutesIn = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        
        int additionalMins = Integer.parseInt(args [1]);
        int totalMins = hoursIn * 60 + minutesIn + additionalMins;
        int totalHours = totalMins / 60;
        int newHour = totalHours % 24;
        int newMins = totalMins - (totalHours*60);

        if (newHour < 10 && newMins < 10) {
             System.out.println("0" + newHour + ":" + "0" + newMins);
        }else {
            if (newHour < 10 && newMins > 10) {
                System.out.println("0" + newHour + ":" + newMins);
            } else {
                if (newHour >= 10 && newMins < 10) {
                    System.out.println(newHour + ":" + "0" + newMins);
                } else {
                    System.out.println(newHour + ":" + newMins);

                }
            }
        }
    }
}