class ChanllengeOne {
    /** @return the number of words found in a string */
    public static int countWords(String inputstr) {
        int length = inputstr.length();
        if (length == 0) {
            return 0;
        }
        
        int count = 1;
        for (int i = 0; i < length; i++) {
            char res = inputstr.charAt(i);
            if ('A' <= res && res <= 'Z') {
                count++;
            }
            else if (res == ' ') {
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String inputstr = "thisContainsFourWords"; 
        System.out.print(countWords(inputstr));
    }
}
