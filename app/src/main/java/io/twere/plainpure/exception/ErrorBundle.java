package io.twere.plainpure.exception;

public interface ErrorBundle {
  Exception getException();

  String getErrorMessage();
}