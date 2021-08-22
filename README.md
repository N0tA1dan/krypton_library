# Krypton Library

Welcome to the Krypton Library. A library meant for the krypton algorithm for java.

# Getting started

Watch the youtube video linked below for a full tutorial getting started:

https://www.youtube.com/watch?v=PG4lgZ4LotQ&t=118s

To Use the Krypton library in java, download or clone the repository into your project enviroment. Then unzip and extract the "krypton" folder into your project enviroment.
Finally import Krypton by typing the following code below into your project.

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

# Support

If you need support or would like to make a submission contact my emai: notaidan420@gmail.com

