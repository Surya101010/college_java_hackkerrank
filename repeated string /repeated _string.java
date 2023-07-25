public static long repeatedString(String s, long n) {
    
	byte as = (byte) s.chars().filter(c -> c == 'a').count();
        long times = 0;
        times = as * (n / s.length());

        for (byte i = 0; i < n % s.length(); i++) {
            if (s.charAt(i) == 'a') {
                times++;
            }
        }

        return times;
}
