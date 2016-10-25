package com.careerbuilder

/**
 * Pakcage object for examples
 * @author oozturk
 */
package object spark {
  implicit class StringUtils(val value: String) {
    def strip(stripChars: String): String = value.stripPrefix(stripChars).stripSuffix(stripChars)
  }
}
