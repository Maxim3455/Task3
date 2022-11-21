public class Main {
    public static void main(String[] args) {
        System.out.println(solutions(1,0,0));
        System.out.println(findZip("all zip files are zipped"));
        System.out.println(checkPerfect(97));
        System.out.println(flipEndChars("Cat, dog, and mouse."));
        System.out.println(isValidHexCode("#EAECEE"));
        System.out.println(same(new int[] {1, 2, 8, 8, 8, 8, 8, 7, 7}, new int[] {6, 4, 5, 9}));
        System.out.println(isKaprekar(3));
        longestZero("10010");
        System.out.println(nextPrime(21));
        System.out.println(rightTriangle(70,130,110));
    }
    //1
    public static int solutions(int a, int b, int c){
        int D = b*b - 4*a*c;
        if (D > 0){
            return 2;
        } else if(D == 0){
            return 1;
        }
        return 0;
    }
    //2
    public static int findZip(String s) {
        int F = s.indexOf("zip");
        int F1 = s.indexOf("zip", F + 1);
        return F1;
    }
    //3
    public static boolean checkPerfect(int a){
        int F = 0;
        for (int i = 1; i < a; i++){
            if (a % i == 0){
                F += i;
            }
        }
        return F == a;
    }
    //4
    public static String flipEndChars(String a) {
        if (a.length() < 2)
            return "Несовместимо";
        if (a.charAt(0) == a.charAt(a.length() - 1))
            return "Два - это пара";
        String c = a.substring(a.length() - 1) + a.substring(1, a.length() - 1) + a.substring(0, 1);
        return c;
    }
    //5
    public static boolean isValidHexCode(String a) {
        String s = "1234567890ABCDEF";
        if (a.charAt(0) != '#')
            return false;
        if (a.length() != 7)
            return false;
        for(int i = 1; i < a.length(); i++) {
            char a1 = a.charAt(i);
            if (s.indexOf(a1) == -1)
                return false;
        }
        return true;

    }


    //6
    public static boolean same(int a[], int b[]){
        int F1 = 0;
        int F2 = 0;
        for (int i = 0; i < a.length; i++){
            for (int j = i + 1; j < a.length; j++){
                if (a[i] == a[j]){
                    F1++;
                    i = j;
                }
            }
        }
        for (int i = 0; i < b.length; i++){
            for (int j = i + 1; j < b.length; j++){
                if (b[i] == b[j]){
                    F2++;
                    i = j;
                }
            }
        }
        return((a.length - F1) == (b.length - F2));
    }
    //7
    public static boolean isKaprekar(int a)
    {
        if (a == 1 || a == 0)
            return true;
        if (a < 4)
            return false;
        int number = (int)Math.pow(a, 2);
        String num = Integer.toString(number);
        String first = num.substring(0, (num.length())/2);
        String second = num.substring((num.length())/2);
        int sum = Integer.parseInt(first) + Integer.parseInt(second);
        return sum == a;
    }

    //8
    public static void longestZero(String a)
    {
        String s = "";
        int c = 0;
        int max = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '1')
                c = 0;
            else
                c++;
            if (c > max)
                max = c;
        }
        for (int i = 0; i < max; i++){
            s += "0";

        }
        System.out.println(s);
    }
    //9
    public static int nextPrime(int n) {
        if (n==2 || n==3 || n==5 || n==7){
            return n;
        }
        else{
            if (n%2!=0 && n%3!=0 && n%5!=0 && n%7!=0){
                return n;
            }
            else{
                while (true){
                    n++;
                    if (n%2!=0 && n%3!=0 && n%5!=0 && n%7!=0){
                        return n;
                    }
                }
            }
        }
    }

    //10
    public static boolean rightTriangle(int a, int b, int c){
        int F = c;
        if (a > b && a > c){
            F = a;
            return F == Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2));
        }else if (a < b && c < b){
            F = b;
            return F == Math.sqrt(Math.pow(a, 2) + Math.pow(c, 2));
        }
        return F == Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}