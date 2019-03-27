package me.example.core;

import com.sun.istack.internal.Nullable;

import javax.print.DocFlavor;
import javax.swing.text.html.Option;
import java.util.Optional;

public class CarClass implements CarStaticExample {

    @Nullable
   static String k;

public static void main(String args[]) {
  //  CarStaticExample.testStatic();

    Optional<String> stringOpt = CarClass.getName();

    stringOpt.ifPresent(s -> System.out.print(stringOpt.get()));
    
    k.charAt(0);
}

public static Optional<String> getName() {

    return Optional.ofNullable("Test");
}
}
