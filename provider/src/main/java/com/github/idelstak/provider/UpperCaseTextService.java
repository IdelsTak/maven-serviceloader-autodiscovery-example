package com.github.idelstak.provider;

import com.github.idelstak.service.*;

/**
 * An implementation of the {@link TextService} interface that converts input text to uppercase.
 * This service offers a simple functionality of transforming text to uppercase.
 */
public class UpperCaseTextService implements TextService {

  /**
   * Processes the given text by converting it to uppercase.
   *
   * @param text The input text to be converted.
   * @return The processed text in uppercase.
   * @implNote This implementation uses the {@link String#toUpperCase()} method to achieve the
   *     desired transformation. It handles null input gracefully by returning null in such cases.
   * @implSpec implementers should be aware that this service performs a basic operation and may not
   *     be suitable for all text processing needs. Consider using or implementing additional
   *     services for more advanced requirements.
   * @apiNote This method is thread-safe as it does not have any shared mutable state. It is
   *     recommended to maintain this property in any modifications or extensions.
   */
  @Override
  public String process(String text) {
    // Using built-in method to convert text to uppercase
    return text == null ? null : text.toUpperCase();
  }
}
