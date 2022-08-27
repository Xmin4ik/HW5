public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Задача №1");
        int [] arrInt = {1,2,3};
        double [] arrDoubles = new double [3];
        arrDoubles [0] = 1.57;
        arrDoubles [1] = 7.654;
        arrDoubles [2] = 9.986;
        int [] dayS = new int[7];
        dayS [0] = 10;
        dayS [2] = 12;
        dayS [3] = 9;
        dayS [4] = 12;
        dayS [5] = 10;
        dayS [6] = 9;
        int day = dayS[0];
        for (int i=0 ; i<dayS.length;i++) {
            if (i==0){ System.out.println("Mon "+"\n"+dayS[i] +" hour"); }
            if (i==1){ System.out.println("Tu "+"\n" +dayS[i] +" hour");}
            if (i==2){ System.out.println("We "+"\n"+dayS[i] +" hour");}
            if (i==3){ System.out.println("Th "+"\n"+dayS[i] +" hour");}
            if (i==4){ System.out.println("Fr "+"\n"+dayS[i] +" hour");}
            if (i==5){ System.out.println("Sa "+"\n"+dayS[i] +" hour");}
            if (i==6){ System.out.println("Su "+"\n"+dayS[i] +" hour");}}
        System.out.println("Задача №2");
        for (int a=0 ; a<=2;a++) {
            if (a<=1) { System.out.print(arrInt[a]+" ,");}
            else { System.out.print(arrInt[a]);}}
        System.out.println();
        for (int b=0 ; b<=2;b++) {
            if (b<=1) { System.out.print(arrDoubles[b]+" ,");}
            else { System.out.print(arrDoubles[b]);}}
        System.out.println();
        for (int c=0 ; c<=6;c++) {
            if (c<=5) { System.out.print(dayS[c]+" ,");}
            else { System.out.print(dayS[c]);}}

        System.out.println("\n"+"Задача №3");

        for (int a=2 ; a>=0;a--) {
            if (a>=1) { System.out.print(arrInt[a]+" ,");}
            else { System.out.print(arrInt[a]);}}
        System.out.println();
        for (int b=2 ; b>=0;b--) {
            if (b>=1) { System.out.print(arrDoubles[b]+" ,");}
            else { System.out.print(arrDoubles[b]);}}
        System.out.println();
        for (int c=6 ; c>=0;c--) {
            if (c>=1) { System.out.print(dayS[c]+" ,");}
            else { System.out.print(dayS[c]);}}
        System.out.println("\n"+"Задача №4");
        for (int d=0 ; d<=2;d++) {
            if (arrInt[d]%2==0) {System.out.print(arrInt[d]); }
            else { int arrS = arrInt[d] + 1 ;
                System.out.print(arrS); }}

    }}
