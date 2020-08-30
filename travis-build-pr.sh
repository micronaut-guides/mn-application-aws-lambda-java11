#!/bin/bash
set -e

export EXIT_STATUS=0

./gradlew complete:test || EXIT_STATUS=$?

if [[ $EXIT_STATUS -ne 0 ]]; then
  exit $EXIT_STATUS
fi

exit $EXIT_STATUS