class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        char prevChar = ' ';

        for(int i = 0; i < s.length(); i++) {
            char nowChar = s.charAt(i);
            switch(nowChar) {
                case 'I' : sum += 1; break;
                case 'V' : sum += 5; 
                    if(prevChar == 'I') {
                        sum -= 2;
                    };
                    break;
                case 'X' : sum += 10; 
                    if(prevChar == 'I') {
                        sum -= 2;
                    }
                    break;
                case 'L' : sum += 50; 
                    if(prevChar == 'X') {
                        sum -= 20;
                    };
                    break;
                case 'C' : sum += 100; 
                    if(prevChar == 'X') {
                        sum -= 20;
                    }
                    break;
                case 'D' : sum += 500; 
                    if(prevChar == 'C') {
                        sum -= 200;
                    }
                    break;
                case 'M' : sum += 1000; 
                    if(prevChar == 'C') {
                        sum -= 200;
                    }
                    break;
            }
            prevChar = nowChar;
        }

        return sum;
    }
}