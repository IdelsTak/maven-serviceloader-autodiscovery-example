package com.github.idelstak.service;

/**
 * A service interface for processing text. Implementing classes are expected to provide
 * functionality for manipulating textual data.
 */
public interface TextService {
  /**
   * Processes the given text.
   *
   * @param text The input text to be processed.
   * @return The processed text result.
   * @implSpec Implementing classes should define the specific text processing logic. It is
   *     recommended to handle null input gracefully and document any constraints or behavior
   *     expectations.
   * @apiNote This method should be thread-safe, as it may be accessed concurrently. Ensure proper
   *     synchronization mechanisms if needed.
   */
  String process(String text);
}
