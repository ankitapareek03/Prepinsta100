public class Main {

    public static String longestPalindrome(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        String longest = "";
        for (int i = 0; i < arr.length; i++) {
            longest = findLongestPalindrome(arr, i, i, longest);     
            longest = findLongestPalindrome(arr, i, i + 1, longest);
        }

        return longest;
    }

    private static String findLongestPalindrome(int[] arr, int left, int right, String longest) {
        while (left >= 0 && right < arr.length && arr[left] == arr[right]) {
            left--;
            right++;
        }
        return right - left - 1 > longest.length() ? new String(arr, left + 1, right - left - 1) : longest;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1};
        System.out.println("Longest Palindrome: " + longestPalindrome(arr));
    }
}
