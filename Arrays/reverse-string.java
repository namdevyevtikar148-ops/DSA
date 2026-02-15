// Method using a character array and two pointers
String input = "Hello";
char[] charArray = input.toCharArray();
int left = 0, right = charArray.length - 1;

while (left < right) {
    char temp = charArray[left];
    charArray[left] = charArray[right];
    charArray[right] = temp;
    left++;
    right--;
}
String reversed = new String(charArray);
