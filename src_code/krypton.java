package krypton;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

public class krypton {
    public static String key(String key){
        return key;
    }
    public static String encrypt(String user_input, String user_key){

        byte[] encode = user_input.getBytes(StandardCharsets.UTF_8);


        byte[] key_encoded = user_key.getBytes(StandardCharsets.UTF_8);
        BigInteger key_1 = new BigInteger(key_encoded);


        // Reverses key_1
        String key_1_string = key_1.toString();
        StringBuilder stringbuilder = new StringBuilder(key_1_string);
        stringbuilder.reverse();
        String key_1_reversed = stringbuilder.toString();

        BigInteger key_2 = new BigInteger(key_1_reversed);

        // --------- ENCRYPTION PROCESS ----------
        // turns users input from its encoding into hexadecimal then into a biginteger
        BigInteger cipher_1 = new BigInteger(encode);
        // math adding onto the hexadecimal numbers
        BigInteger cipher_2 = cipher_1.multiply(key_1);
        BigInteger cipher_3 = cipher_2.multiply(key_2);

        // reverses user cipher
        String cipher_3_to_string = cipher_3.toString();
        StringBuilder stringbuilder_2 = new StringBuilder(cipher_3_to_string);
        stringbuilder_2.reverse();
        String cipher_4_string = stringbuilder_2.toString();

        // reversed user cipher
        BigInteger cipher_4 = new BigInteger(cipher_4_string);

        BigInteger cipher_5 = cipher_4.multiply(key_1);
        String cipher_5_to_string = cipher_5.toString();


        return cipher_5_to_string;
    }

    public static String decrypt(String user_input, String user_key){

        byte[] key_encoded = user_key.getBytes(StandardCharsets.UTF_8);
        BigInteger key_1 = new BigInteger(key_encoded);


        // Reverses key_1
        String key_1_string = key_1.toString();
        StringBuilder stringbuilder = new StringBuilder(key_1_string);
        stringbuilder.reverse();
        String key_1_reversed = stringbuilder.toString();

        BigInteger key_2 = new BigInteger(key_1_reversed);


        // ---------- DECRYPTING THE CIPHERS ----------
        BigInteger cipher = new BigInteger(user_input);

        BigInteger cipher_5 = cipher.divide(key_1);

        String cipher_5_to_string = cipher_5.toString();
        StringBuilder stringBuilder_2 = new StringBuilder(cipher_5_to_string);
        stringBuilder_2.reverse();
        String cipher_4_to_string = stringBuilder_2.toString();

        BigInteger cipher_4 = new BigInteger(cipher_4_to_string);

        BigInteger cipher_3 = cipher_4.divide(key_2);
        BigInteger cipher_2 = cipher_3.divide(key_1);


        // converts the bigintegers back into hexadecimal using a radix of 16
        String cipher_1 = cipher_2.toString(16);

        // converts the hexadecimal string into a byte array
        byte[] hex_string_byte_array = new BigInteger(cipher_1, 16).toByteArray();
        // converts the byte array back into its encoded chars
        String hex_to_char = new String(hex_string_byte_array, StandardCharsets.UTF_8);

        return hex_to_char;
    }
}
