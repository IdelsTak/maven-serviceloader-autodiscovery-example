package com.github.idelstak.consumer;

import com.github.idelstak.service.*;
import java.util.*;

/**
 * A simple consumer class that discovers and prints available implementations of the {@link
 * TextService} interface. This class uses the Java ServiceLoader mechanism to dynamically discover
 * and print text service implementations.
 */
public class Consumer {

  /**
   * The main entry point to execute the consumer logic.
   *
   * @param args The command-line arguments (not used in this implementation).
   */
  public static void main(String[] args) {
    // Discover and print available text service implementations
    for (var textService : ServiceLoader.load(TextService.class)) {
      System.out.println(
          "Found service implementation for %s: %s"
              .formatted(TextService.class.getName(), textService.getClass().getName()));
    }
  }
}
