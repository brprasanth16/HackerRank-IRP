
public class ConditionalStatements {

	public static void main(String[] args) {
		int month = 2;
        String monthString = "";

        switch (monthString) {
        case "January":  monthString = "January";
                 break;
        case "February":  monthString = "February";
                 break;
        case "March":  monthString = "March";
                 break;
        case "April":  monthString = "April";
                 break;
        default: monthString = "Invalid month";
                 break;
        }
        System.out.println(monthString);
        
        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        System.out.println(monthString);
        
        char c = 'a';
        switch (c) {
        case 'a':  monthString = "January";
                 break;
        case 'b':  monthString = "February";
                 break;
        default: monthString = "Invalid month";
                 break;
        }
        System.out.println(monthString);
        
        while(month < 12){
        	month++;
        	System.out.println(month);
        }
        
        do{
        	System.out.println(month);
        	month--;
        } while(month > 0);
	}

}
