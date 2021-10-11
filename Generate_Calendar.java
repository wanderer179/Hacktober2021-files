public class calander {

   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
    int year,month;
    int flag;
    int dpm=0;
    System.out.println("Enter Year : ");
    year=sc.nextInt();
    System.out.println("Enter Month in number : ");
    month=sc.nextInt();
    String monthname="month";
    
    switch(month){
        case 1:
            monthname="january";
            dpm=31;
            break;
        case 2:
            monthname="february";
            if(year%4==0){
                if(year%100==0){
                    if(year%400==0){
                        flag=0;
                    }
                    else{
                        flag=1;
                    }}
                else{
                    flag=0;
                    }
                }
            else{
                flag=1;
            }
            if(flag==1){
            dpm=28;
            }
            else{
            dpm=29;
            }
            break;
        case 3:
            monthname="march";
            dpm=31;
            break;
        case 4:
            monthname="April";
            dpm=30;
            break;
        case 5:
            monthname="May";
            dpm=31;
            break;
        case 6:
            monthname="June";
            dpm=30;
            break;
        case 7:
            monthname="July";
            dpm=31;
            break;
        case 8:
            monthname="August";
            dpm=30;
            break;
        case 9:
            monthname="September";
            dpm=31;
            break;
        case 10:
            monthname="October";
            dpm=30;
            break;
        case 11:
            monthname="November";
            dpm=31;
            break;
        case 12:
            monthname="December";
            dpm=30;
            break;
        default:
            System.out.println("month not recogonized");
            System.exit(0);
        }
    System.out.println("---------------------------------");
    System.out.println("" +monthname+ "   "+year);
    System.out.println("sun\tmon\ttue\twed\tthu\tfri\tsat");
    for(int i=1;i<=dpm;i++){
       System.out.print(i+"\t" );
       if(i%7==0){
         System.out.println();
       }
    }
       System.out.println();
       System.out.println("---------------------------------");
       System.out.println();

    }
    }
    

