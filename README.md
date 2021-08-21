# Krypton Library

Welcome to the Krypton Library. A library meant for the krypton algorithm for java.

# Getting started

To use the Krypton Library download the repository as a zip or clone it into your projects directory.
Next either unzip the file or if you cloned it just leave it as it is. 
Finally to import the library into your project simply type the line of java code below.

```
import krypton.*;
```

# Implementation

The krypton library has very simple and few methods for encrypting and decrypting content. An Example of encrypting and decrypting in Java will be below

``` java
import krypton.*;

public class Main {
    public static void main(String[] args){
        // Setting my key to a string
        String key = krypton.key("MyEncryptionKey");

        // Setting a string to the encrypt() method
        String encrypt = krypton.encrypt("Hello World", key);

        String output = encrypt;

        System.out.println("------------ encrypted text ------------");
        System.out.println(encrypt);
        System.out.println("------------ Key ------------");
        System.out.println(key);
        
        // decrypting the encrypted text and inserting the key for decryption
        String decrypt = krypton.decrypt(output, key);

        System.out.println("------------ Decrypted text ------------");
        System.out.println(decrypt);
    }
}

```
